package modele;

import java.util.Date;
import java.util.Set;

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
			Date dateFinReel, Set<Entreprise> realise, Entreprise responsable, int surfacePlafond, int surfaceMur) {
		super(numero, dateDebut, dureeEstimee, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		this.surfacePlafond = surfacePlafond;
		this.surfaceMur = surfaceMur;
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