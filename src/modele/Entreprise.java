package modele;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import enumeration.ECorpsMetier;

@Entity
public class Entreprise implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	private ECorpsMetier corpsMetier;
	private String numTel;
	@OneToMany
	private Set<Acteur> acteur = new HashSet<Acteur>();
	@OneToOne
	private Adresse siegeSocial;
	
	public Entreprise(int id, String nom, ECorpsMetier corpsMetier, String numTel, Set<Acteur> acteur,
			Adresse siegeSocial) {
		super();
		this.id = id;
		this.nom = nom;
		this.corpsMetier = corpsMetier;
		this.numTel = numTel;
		this.acteur = acteur;
		this.siegeSocial = siegeSocial;
	}
	
	public Entreprise() {
		super();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public ECorpsMetier getCorpsMetier() {
		return corpsMetier;
	}
	
	public void setCorpsMetier(ECorpsMetier corpsMetier) {
		this.corpsMetier = corpsMetier;
	}
	
	public String getNumTel() {
		return numTel;
	}
	
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	
	public Set<Acteur> getActeur() {
		return acteur;
	}
	
	public void setActeur(Set<Acteur> acteur) {
		this.acteur = acteur;
	}
	
	public Adresse getSiegeSocial() {
		return siegeSocial;
	}
	
	public void setSiegeSocial(Adresse siegeSocial) {
		this.siegeSocial = siegeSocial;
	}
}