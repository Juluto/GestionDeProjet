package modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MUSEE")
public class Musee extends BatimentPublic {
	private int nbSalles;

	public Musee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Musee(String ministere, int nbSalles) {
		super(ministere);
		this.nbSalles = nbSalles;
	}

	public int getNbSalles() {
		return nbSalles;
	}

	public void setNbSalles(int nbSalles) {
		this.nbSalles = nbSalles;
	}

}