package nl.rls.composer.rest.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.rls.composer.rest.dto.hateoas.ResourceSupport;

@NoArgsConstructor
@Getter @Setter
public class TrainDto extends ResourceSupport   {
    private String operationalTrainNumber;
	private String transferPoint;
    private Date scheduledTimeAtHandover;
    private Date scheduledDateTimeAtTransfer;
	private List<JourneySectionDto> journeySections = new ArrayList<JourneySectionDto>();
}
