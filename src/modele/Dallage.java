package modele;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DALLAGE")
public class Dallage extends Lot {
	private int surfaceTotale;

	public Dallage(int numero, Date dateDebut, int dureeEstimee, int coutEstime, String avancement, int coutReel,
			Date dateFinReel, ArrayList<Entreprise> realise, Entreprise responsable, int surfaceTotale) {
		super(numero, dateDebut, dureeEstimee, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		this.surfaceTotale = surfaceTotale;
	}

	public Dallage() {
		super();
	}

	public int getSurfaceTotale() {
		return surfaceTotale;
	}

	public void setSurfaceTotale(int surfaceTotale) {
		this.surfaceTotale = surfaceTotale;
	}
	
	
}