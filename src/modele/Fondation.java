package modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FONDATION")
public class Fondation extends Lot {
	private int profondeur;
}