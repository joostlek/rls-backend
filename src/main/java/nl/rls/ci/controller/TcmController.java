package nl.rls.ci.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import nl.rls.ci.aa.security.SecurityContext;
import nl.rls.ci.domain.CiMessage;
import nl.rls.ci.service.CiService;
import nl.rls.ci.url.BaseURL;
import nl.rls.composer.domain.message.TrainCompositionMessage;
import nl.rls.composer.repository.TrainCompositionMessageRepository;

@RestController
@RequestMapping(BaseURL.BASE_PATH+"tcm")
public class TcmController {
	@Autowired
	private TrainCompositionMessageRepository trainCompositionMessageRepository;
	@Autowired
	private CiService ciService;
	@Autowired
	private SecurityContext securityContext;

	@ApiOperation(value = "Constructs a tcm-message from data and puts it into de CI-buffer")
	@PostMapping(value = "/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<String> createTcm(@PathVariable Integer id) {
		int ownerId = securityContext.getOwnerId();
		Optional<TrainCompositionMessage> trainCompositionMessage = trainCompositionMessageRepository.findByIdAndOwnerId(id, ownerId);
		if (trainCompositionMessage.isPresent()) {
			System.out.println(trainCompositionMessage.get());
			String xmlMessage = ciService.makeXmlMessage(trainCompositionMessage.get());
			CiMessage ciMessage = ciService.makeCiMessage(xmlMessage);

			System.out.println("POST XML message to databases");
			return ResponseEntity.created(linkTo(methodOn(CiController.class).getMessage(ciMessage.getId())).toUri())
					.build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	/**
	 * Maakt een nieuw CI bericht aan.
	 * 
	 * @param messageXml
	 * @return de link naar het CI object/resource
	 */
	@Transactional
	@PostMapping(value = "/")
	@ApiOperation(value = "Stores a CI (XML-)message for a client (UicRequest). This message is not send.")
	public ResponseEntity<?> postMessage(@RequestBody String messageXml) {
		System.out.println("POST XML message to databases");
		CiMessage ciMessage = ciService.makeCiMessage(messageXml);
		return ResponseEntity.created(linkTo(methodOn(CiController.class).getMessage(ciMessage.getId())).toUri())
				.build();
	}


}
