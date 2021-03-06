package nl.rls.composer.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.rls.composer.domain.code.TrainActivityType;

/**
 * @author berend.wilkens
 * 
 *         Defines the make up of a train for each section of its journey.
 * 
 */
@Entity
@NoArgsConstructor
@Getter
@Setter
public class JourneySection extends OwnedEntity {
	public JourneySection(Integer ownerId) {
		super(ownerId);
	}

	/**
	 * Origin of the section on which train composition is unchanged
	 */
	@ManyToOne
	private Location journeySectionOrigin;
	/**
	 * Destination of the section on which train composition is unchanged
	 */
	@ManyToOne
	private Location journeySectionDestination;
	/**
	 * This element identifies the responsible RU or IM for the actual path section
	 */
	@ManyToOne
	private Responsibility responsibilityActualSection;
	/**
	 * This element identifies the responsible RU and IM for the following path
	 * section
	 */
	@ManyToOne
	private Responsibility responsibilityNextSection;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private TrainComposition trainComposition;

	@OneToMany(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "journey_section_id")
	private List<TrainActivityType> activities = new ArrayList<>();

	@ManyToOne
	private Train train;

	public TrainActivityType getActivityById(Integer id) {
		for (TrainActivityType ait : activities) {
			if (ait.getId() == id) {
				return ait;
			}
		}
		return null;
	}

	public boolean addActivity(TrainActivityType entity) {
		if (!activities.contains(entity)) {
			activities.add(entity);
			return true;
		} else {
			return false;
		}
	}

	public boolean removeActivityById(int id) {
		TrainActivityType entity = getActivityById(id);
		if (entity != null) {
			removeActivity(entity);
			return true;
		} else {
			return false;
		}
	}

	public void removeActivity(TrainActivityType entity) {
		activities.remove(entity);
	}
}
