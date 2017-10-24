package modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ELECTRICITE")
public class Electricite extends Lot {
	private int nbTableau;
	private int longueurCable;
}