package modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("HOPITAL")
public class Hopital extends BatimentPublic {
	private int nbLits;
	private int nbServices;
	
	public Hopital(String ministere, int nbLits, int nbServices) {
		super(ministere);
		this.nbLits = nbLits;
		this.nbServices = nbServices;
	}
	
	public Hopital() {
		super();
	}
	
	public int getNbLits() {
		return nbLits;
	}
	
	public void setNbLits(int nbLits) {
		this.nbLits = nbLits;
	}
	
	public int getNbServices() {
		return nbServices;
	}
	
	public void setNbServices(int nbServices) {
		this.nbServices = nbServices;
	}
	
	
}