package modele;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import enumeration.EStatut;
import enumeration.ETitre;

@Entity
public class Acteur implements Serializable {
	@Id
	private String nom;
	private ETitre titre;
	private EStatut statut;
	@ManyToOne
	private Entreprise entreprise;
	@ManyToMany
	private Set<Projet> participe = new HashSet<Projet>();
	
	public Acteur(String nom, ETitre titre, EStatut statut, Entreprise entreprise, Set<Projet> participe) {
		super();
		this.nom = nom;
		this.titre = titre;
		this.statut = statut;
		this.entreprise = entreprise;
		this.participe = participe;
	}

	public Acteur() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ETitre getTitre() {
		return titre;
	}

	public void setTitre(ETitre titre) {
		this.titre = titre;
	}

	public EStatut getStatut() {
		return statut;
	}

	public void setStatut(EStatut statut) {
		this.statut = statut;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public Set<Projet> getParticipe() {
		return participe;
	}

	public void setParticipe(Set<Projet> participe) {
		this.participe = participe;
	}
	
	

}