package modele;

import java.util.Date;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ELECTRICITE")
public class Electricite extends Lot {
	private int nbTableau;
	private int longueurCable;
	
	public Electricite(int numero, Date dateDebut, int dureeEstimee, int coutEstime, String avancement, int coutReel,
			Date dateFinReel, Set<Entreprise> realise, Entreprise responsable, int nbTableau, int longueurCable) {
		super(numero, dateDebut, dureeEstimee, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		this.nbTableau = nbTableau;
		this.longueurCable = longueurCable;
	}

	public Electricite() {
		super();
	}

	public int getNbTableau() {
		return nbTableau;
	}

	public void setNbTableau(int nbTableau) {
		this.nbTableau = nbTableau;
	}

	public int getLongueurCable() {
		return longueurCable;
	}

	public void setLongueurCable(int longueurCable) {
		this.longueurCable = longueurCable;
	}
	
	
}