package modele;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PLATERIE")
public class Platerie extends Lot {
	private int surfacePlafond;
	private int surfaceMur;
	
	public Platerie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Platerie(int numero, Date dateDebut, int dureeEstimee, int coutEstime, String avancement, int coutReel,
			Date dateFinReel, ArrayList<Entreprise> realise, Entreprise responsable) {
		super(numero, dateDebut, dureeEstimee, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		// TODO Auto-generated constructor stub
	}
	public int getSurfacePlafond() {
		return surfacePlafond;
	}
	public void setSurfacePlafond(int surfacePlafond) {
		this.surfacePlafond = surfacePlafond;
	}
	public int getSurfaceMur() {
		return surfaceMur;
	}
	public void setSurfaceMur(int surfaceMur) {
		this.surfaceMur = surfaceMur;
	}
	
	
}