package modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import enumeration.EEtaScolaire;

@Entity
@DiscriminatorValue("ETABLISSEMENTSCOLAIRE")
public class EtablissementScolaire extends BatimentPublic {
	private int nbEleves;
	private EEtaScolaire categorie;
	
	public EtablissementScolaire(String ministere, int nbEleves, EEtaScolaire categorie) {
		super(ministere);
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