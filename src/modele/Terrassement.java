package modele;

import java.util.Date;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TERRASSEMENT")
public class Terrassement extends Lot {
	private int volumeTerre;

	public Terrassement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Terrassement(int numero, Date dateDebut, int dureeEstimee, int coutEstime, String avancement, int coutReel,
			Date dateFinReel, Set<Entreprise> realise, Entreprise responsable) {
		super(numero, dateDebut, dureeEstimee, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		// TODO Auto-generated constructor stub
	}

	public int getVolumeTerre() {
		return volumeTerre;
	}

	public void setVolumeTerre(int volumeTerre) {
		this.volumeTerre = volumeTerre;
	}
	
	
}