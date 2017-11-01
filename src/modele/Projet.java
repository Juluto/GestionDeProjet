package modele;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries({
	@NamedQuery(
			 name="Projet.findEnCours",
			 query="select p from Projet p where p.termine = 0"),
	@NamedQuery(
			 name="Projet.findAvance",
			 query="select p from Projet p where p.refProjet = :reference"),
	@NamedQuery(
			 name="Projet.projetsTermines",
			 query="select p from Projet p join p.participe e where e.entreprise.nom=:nomEntreprise and p.termine =:termine"),
})
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Projet implements Serializable{
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@ManyToMany
	private Set<Acteur> participe = new HashSet<Acteur>();
	@OneToOne
	private Adresse localisation;
	@OneToMany
	private Set<Lot> est_decoupe_en = new HashSet<Lot>();
	
	public Projet(int refProjet, String nom, int surfaceTotal, String avancement, Date dateFinEstimee,
			int coutTotalEstime, boolean termine, Date dateFinReelle, Set<Acteur> participe, Adresse localisation,
			Set<Lot> est_decoupe_en) {
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

	public Set<Acteur> getParticipe() {
		return participe;
	}

	public void setParticipe(Set<Acteur> participe) {
		this.participe = participe;
	}

	public Adresse getLocalisation() {
		return localisation;
	}

	public void setLocalisation(Adresse localisation) {
		this.localisation = localisation;
	}

	public Set<Lot> getEst_decoupe_en() {
		return est_decoupe_en;
	}

	public void setEst_decoupe_en(Set<Lot> est_decoupe_en) {
		this.est_decoupe_en = est_decoupe_en;
	}
	
	
}