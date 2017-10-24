package modele;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("IMMEUBLE")
public class Immeuble extends Projet {
	private int nbNiveaux;
	@OneToMany
	public ArrayList<Appartement> appartement = new ArrayList<Appartement>();
	
	public Immeuble(int refProjet, String nom, int surfaceTotal, String avancement, Date dateFinEstimee,
			int coutTotalEstime, boolean termine, Date dateFinReelle, ArrayList<Acteur> participe, Adresse localisation,
			ArrayList<Lot> est_decoupe_en, int nbNiveaux, ArrayList<Appartement> appartement) {
		super(refProjet, nom, surfaceTotal, avancement, dateFinEstimee, coutTotalEstime, termine, dateFinReelle,
				participe, localisation, est_decoupe_en);
		this.nbNiveaux = nbNiveaux;
		this.appartement = appartement;
	}

	public Immeuble() {
		super();
	}

	public int getNbNiveaux() {
		return nbNiveaux;
	}

	public void setNbNiveaux(int nbNiveaux) {
		this.nbNiveaux = nbNiveaux;
	}

	public ArrayList<Appartement> getAppartement() {
		return appartement;
	}

	public void setAppartement(ArrayList<Appartement> appartement) {
		this.appartement = appartement;
	}
	
	
	
}