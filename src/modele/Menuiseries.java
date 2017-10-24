package modele;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MENUISERIES")
public class Menuiseries extends Lot {
	private int nbFenetres;
	private int nbPortes;
	private int nbFenetreToit;
	public Menuiseries() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menuiseries(int numero, Date dateDebut, int dureeEstimee, int coutEstime, String avancement, int coutReel,
			Date dateFinReel, ArrayList<Entreprise> realise, Entreprise responsable) {
		super(numero, dateDebut, dureeEstimee, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		// TODO Auto-generated constructor stub
	}
	public int getNbFenetres() {
		return nbFenetres;
	}
	public void setNbFenetres(int nbFenetres) {
		this.nbFenetres = nbFenetres;
	}
	public int getNbPortes() {
		return nbPortes;
	}
	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}
	public int getNbFenetreToit() {
		return nbFenetreToit;
	}
	public void setNbFenetreToit(int nbFenetreToit) {
		this.nbFenetreToit = nbFenetreToit;
	}
	
	
}