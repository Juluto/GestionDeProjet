package modele;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FONDATION")
public class Fondation extends Lot {
	private int profondeur;

	public Fondation(int numero, Date dateDebut, int dureeEstimee, int coutEstime, String avancement, int coutReel,
			Date dateFinReel, ArrayList<Entreprise> realise, Entreprise responsable, int profondeur) {
		super(numero, dateDebut, dureeEstimee, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		this.profondeur = profondeur;
	}

	public Fondation() {
		super();
	}

	public int getProfondeur() {
		return profondeur;
	}

	public void setProfondeur(int profondeur) {
		this.profondeur = profondeur;
	}
	
	
}