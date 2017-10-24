package modele;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("LOTISSEMENT")
public class Lotissement extends Projet {
	private int nbMaisons;
	public ArrayList<Maison> listMaison = new ArrayList<Maison>();
	public Lotissement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lotissement(int refProjet, String nom, int surfaceTotal, String avancement, Date dateFinEstimee,
			int coutTotalEstime, boolean termine, Date dateFinReelle, ArrayList<Acteur> participe, Adresse localisation,
			ArrayList<Lot> est_decoupe_en) {
		super(refProjet, nom, surfaceTotal, avancement, dateFinEstimee, coutTotalEstime, termine, dateFinReelle, participe,
				localisation, est_decoupe_en);
		// TODO Auto-generated constructor stub
	}
	public int getNbMaisons() {
		return nbMaisons;
	}
	public void setNbMaisons(int nbMaisons) {
		this.nbMaisons = nbMaisons;
	}
	public ArrayList<Maison> getListMaison() {
		return listMaison;
	}
	public void setListMaison(ArrayList<Maison> listMaison) {
		this.listMaison = listMaison;
	}
	
	
}