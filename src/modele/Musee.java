package modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MUSEE")
public class Musee extends BatimentPublic {
	private int nbSalles;
	
	
}