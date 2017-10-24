package modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DALLAGE")
public class Dallage extends Lot {
	private int surfaceTotale;
}