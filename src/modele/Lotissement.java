package modele;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("LOTISSEMENT")
public class Lotissement extends Projet {
	private int nbMaisons;
	@OneToMany
	private Set<Maison> listMaison = new HashSet<Maison>();

	public Lotissement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lotissement(int refProjet, String nom, int surfaceTotal, String avancement, Date dateFinEstimee,
			int coutTotalEstime, boolean termine, Date dateFinReelle, Set<Acteur> participe, Adresse localisation,
			Set<Lot> est_decoupe_en, int nbMaisons, Set<Maison> listMaison) {
		super(refProjet, nom, surfaceTotal, avancement, dateFinEstimee, coutTotalEstime, termine, dateFinReelle,
				participe, localisation, est_decoupe_en);
		this.nbMaisons = nbMaisons;
		this.listMaison = listMaison;
	}

	public int getNbMaisons() {
		return nbMaisons;
	}

	public void setNbMaisons(int nbMaisons) {
		this.nbMaisons = nbMaisons;
	}

	public Set<Maison> getListMaison() {
		return listMaison;
	}

	public void setListMaison(Set<Maison> listMaison) {
		this.listMaison = listMaison;
	}

}