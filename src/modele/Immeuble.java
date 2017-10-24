package modele;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("IMMEUBLE")
public class Immeuble extends Projet {
	private int nbNiveaux;
	@OneToMany
	private Set<Appartement> appartement = new HashSet<Appartement>();
	
	public Immeuble(int refProjet, String nom, int surfaceTotal, String avancement, Date dateFinEstimee,
			int coutTotalEstime, boolean termine, Date dateFinReelle, Set<Acteur> participe, Adresse localisation,
			Set<Lot> est_decoupe_en, int nbNiveaux, Set<Appartement> appartement) {
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

	public Set<Appartement> getAppartement() {
		return appartement;
	}

	public void setAppartement(Set<Appartement> appartement) {
		this.appartement = appartement;
	}
	
	
	
}