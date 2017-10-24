package modele;

import java.util.Date;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MACONNERIE")
public class Maconnerie extends Lot {
	private int surfaceMur;
	private int nbPoteaux;
	
	public Maconnerie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSurfaceMur() {
		return surfaceMur;
	}
	public void setSurfaceMur(int surfaceMur) {
		this.surfaceMur = surfaceMur;
	}
	public int getNbPoteaux() {
		return nbPoteaux;
	}
	public void setNbPoteaux(int nbPoteaux) {
		this.nbPoteaux = nbPoteaux;
	}
	public Maconnerie(int numero, Date dateDebut, int dureeEstimee, int coutEstime, String avancement, int coutReel,
			Date dateFinReel, Set<Entreprise> realise, Entreprise responsable) {
		super(numero, dateDebut, dureeEstimee, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		// TODO Auto-generated constructor stub
	}
}