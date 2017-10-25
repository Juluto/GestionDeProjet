package modele;

import java.util.Date;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import enumeration.EEtaScolaire;

@Entity
@DiscriminatorValue("ETABLISSEMENTSCOLAIRE")
public class EtablissementScolaire extends BatimentPublic {
	private int nbEleves;
	private EEtaScolaire categorie;

	public EtablissementScolaire(int refProjet, String nom, int surfaceTotal, String avancement, Date dateFinEstimee,
			int coutTotalEstime, boolean termine, Date dateFinReelle, Set<Acteur> participe, Adresse localisation,
			Set<Lot> est_decoupe_en, String ministere, int nbEleves, EEtaScolaire categorie) {
		super(refProjet, nom, surfaceTotal, avancement, dateFinEstimee, coutTotalEstime, termine, dateFinReelle,
				participe, localisation, est_decoupe_en, ministere);
		this.nbEleves = nbEleves;
		this.categorie = categorie;
	}

	public EtablissementScolaire() {
		super();
	}

	public int getNbEleves() {
		return nbEleves;
	}

	public void setNbEleves(int nbEleves) {
		this.nbEleves = nbEleves;
	}

	public EEtaScolaire getCategorie() {
		return categorie;
	}

	public void setCategorie(EEtaScolaire categorie) {
		this.categorie = categorie;
	}

}