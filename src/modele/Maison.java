package modele;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MAISON")
public class Maison extends Projet {
	private int nbPieces;
	private int nbNiveaux;
	public Maison() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Maison(int refProjet, String nom, int surfaceTotal, String avancement, Date dateFinEstimee,
			int coutTotalEstime, boolean termine, Date dateFinReelle, ArrayList<Acteur> participe, Adresse localisation,
			ArrayList<Lot> est_decoupe_en) {
		super(refProjet, nom, surfaceTotal, avancement, dateFinEstimee, coutTotalEstime, termine, dateFinReelle, participe,
				localisation, est_decoupe_en);
		// TODO Auto-generated constructor stub
	}
	public int getNbPieces() {
		return nbPieces;
	}
	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}
	public int getNbNiveaux() {
		return nbNiveaux;
	}
	public void setNbNiveaux(int nbNiveaux) {
		this.nbNiveaux = nbNiveaux;
	}
	
	
}