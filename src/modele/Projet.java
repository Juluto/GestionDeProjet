package modele;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Projet implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int refProjet;
	private String nom;
	private int surfaceTotal;
	private String avancement;
	@Temporal(TemporalType.DATE)
	private Date dateFinEstimee;
	private int coutTotalEstime;
	private boolean termine;
	@Temporal(TemporalType.DATE)
	private Date dateFinReelle;
	public ArrayList<Acteur> participe = new ArrayList<Acteur>();
	public Adresse localisation;
	public ArrayList<Lot> est_decoupe_en = new ArrayList<Lot>();
	
	public Projet(int refProjet, String nom, int surfaceTotal, String avancement, Date dateFinEstimee,
			int coutTotalEstime, boolean termine, Date dateFinReelle, ArrayList<Acteur> participe, Adresse localisation,
			ArrayList<Lot> est_decoupe_en) {
		super();
		this.refProjet = refProjet;
		this.nom = nom;
		this.surfaceTotal = surfaceTotal;
		this.avancement = avancement;
		this.dateFinEstimee = dateFinEstimee;
		this.coutTotalEstime = coutTotalEstime;
		this.termine = termine;
		this.dateFinReelle = dateFinReelle;
		this.participe = participe;
		this.localisation = localisation;
		this.est_decoupe_en = est_decoupe_en;
	}

	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRefProjet() {
		return refProjet;
	}

	public void setRefProjet(int refProjet) {
		this.refProjet = refProjet;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSurfaceTotal() {
		return surfaceTotal;
	}

	public void setSurfaceTotal(int surfaceTotal) {
		this.surfaceTotal = surfaceTotal;
	}

	public String getAvancement() {
		return avancement;
	}

	public void setAvancement(String avancement) {
		this.avancement = avancement;
	}

	public Date getDateFinEstimee() {
		return dateFinEstimee;
	}

	public void setDateFinEstimee(Date dateFinEstimee) {
		this.dateFinEstimee = dateFinEstimee;
	}

	public int getCoutTotalEstime() {
		return coutTotalEstime;
	}

	public void setCoutTotalEstime(int coutTotalEstime) {
		this.coutTotalEstime = coutTotalEstime;
	}

	public boolean isTermine() {
		return termine;
	}

	public void setTermine(boolean termine) {
		this.termine = termine;
	}

	public Date getDateFinReelle() {
		return dateFinReelle;
	}

	public void setDateFinReelle(Date dateFinReelle) {
		this.dateFinReelle = dateFinReelle;
	}

	public ArrayList<Acteur> getParticipe() {
		return participe;
	}

	public void setParticipe(ArrayList<Acteur> participe) {
		this.participe = participe;
	}

	public Adresse getLocalisation() {
		return localisation;
	}

	public void setLocalisation(Adresse localisation) {
		this.localisation = localisation;
	}

	public ArrayList<Lot> getEst_decoupe_en() {
		return est_decoupe_en;
	}

	public void setEst_decoupe_en(ArrayList<Lot> est_decoupe_en) {
		this.est_decoupe_en = est_decoupe_en;
	}
	
	
}