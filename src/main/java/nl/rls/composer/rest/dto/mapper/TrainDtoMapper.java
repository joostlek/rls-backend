package nl.rls.composer.rest.dto.mapper;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;

import nl.rls.composer.controller.CompanyController;
import nl.rls.composer.controller.LocationController;
import nl.rls.composer.controller.TrainController;
import nl.rls.composer.domain.JourneySection;
import nl.rls.composer.domain.Train;
import nl.rls.composer.rest.dto.JourneySectionDto;
import nl.rls.composer.rest.dto.TrainDto;
import nl.rls.composer.rest.dto.TrainPostDto;

public class TrainDtoMapper {
	public static TrainDto map(Train entity) {	
		DozerBeanMapper mapper = new DozerBeanMapper();
		BeanMappingBuilder mappingBuilder = new BeanMappingBuilder() {
			protected void configure() {
				mapping(Train.class, TrainDto.class)
				.fields("transferPoint.primaryLocationName", "transferPoint")
				;
			}
		};
		mapper.addMapping(mappingBuilder);
		TrainDto dto = mapper.map(entity, TrainDto.class);
		
		List<JourneySectionDto> dtoList = new ArrayList<JourneySectionDto>();
		for (JourneySection listItem : entity.getJourneySections()) {
			dtoList.add(JourneySectionDtoMapper.map(listItem));
		}
		dto.setJourneySections(dtoList);
		
		dto.add(linkTo(methodOn(TrainController.class).getById(entity.getId())).withSelfRel().withTitle(entity.getOperationalTrainNumber()));
		dto.add(linkTo(methodOn(CompanyController.class).getById(entity.getTransfereeIM().getId())).withRel("transfereeIM").withTitle(entity.getTransfereeIM().getName()));
		dto.add(linkTo(methodOn(LocationController.class).getById(entity.getTransferPoint().getLocationPrimaryCode())).withRel("transferPoint").withTitle(entity.getTransferPoint().getPrimaryLocationName()));
		return dto;
	}

	public static Train map(TrainPostDto dto) {
		DozerBeanMapper mapper = new DozerBeanMapper();
		BeanMappingBuilder mappingBuilder = new BeanMappingBuilder() {
			protected void configure() {
			}
		};
		mapper.addMapping(mappingBuilder);
		Train train = mapper.map(dto, Train.class);
		return train;
	}

}
