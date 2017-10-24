package modele;

import java.util.ArrayList;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("IMMEUBLE")
public class Immeuble extends Projet {
	private int nbNiveaux;
	public ArrayList<Appartement> appartement = new ArrayList<Appartement>();
}