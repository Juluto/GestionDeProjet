package modele;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Lot implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	private int dureeEstimee;
	private int coutEstime;
	private String avancement;
	private int coutReel;
	@Temporal(TemporalType.DATE)
	private Date dateFinReel;
	@ManyToMany
	public ArrayList<Entreprise> realise = new ArrayList<Entreprise>();
	@ManyToOne
	public Entreprise responsable;
	
	public Lot(int numero, Date dateDebut, int dureeEstimee, int coutEstime, String avancement, int coutReel,
			Date dateFinReel, ArrayList<Entreprise> realise, Entreprise responsable) {
		super();
		this.numero = numero;
		this.dateDebut = dateDebut;
		this.dureeEstimee = dureeEstimee;
		this.coutEstime = coutEstime;
		this.avancement = avancement;
		this.coutReel = coutReel;
		this.dateFinReel = dateFinReel;
		this.realise = realise;
		this.responsable = responsable;
	}

	public Lot() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getDureeEstimee() {
		return dureeEstimee;
	}

	public void setDureeEstimee(int dureeEstimee) {
		this.dureeEstimee = dureeEstimee;
	}

	public int getCoutEstime() {
		return coutEstime;
	}

	public void setCoutEstime(int coutEstime) {
		this.coutEstime = coutEstime;
	}

	public String getAvancement() {
		return avancement;
	}

	public void setAvancement(String avancement) {
		this.avancement = avancement;
	}

	public int getCoutReel() {
		return coutReel;
	}

	public void setCoutReel(int coutReel) {
		this.coutReel = coutReel;
	}

	public Date getDateFinReel() {
		return dateFinReel;
	}

	public void setDateFinReel(Date dateFinReel) {
		this.dateFinReel = dateFinReel;
	}

	public ArrayList<Entreprise> getRealise() {
		return realise;
	}

	public void setRealise(ArrayList<Entreprise> realise) {
		this.realise = realise;
	}

	public Entreprise getResponsable() {
		return responsable;
	}

	public void setResponsable(Entreprise responsable) {
		this.responsable = responsable;
	}
	
	
	
	
}