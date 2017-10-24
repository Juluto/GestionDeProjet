package modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import enumeration.ECharpente;

@Entity
@DiscriminatorValue("CHARPENTE")
public class Charpente extends Lot {
	private ECharpente typeCharpente;
}