package modele;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

import enumeration.EStatut;
import enumeration.ETitre;

@Entity
public class Acteur implements Serializable {
	@Id
	private String nom;
	private ETitre titre;
	private EStatut statut;
	public Entreprise entreprise;
	public ArrayList<Projet> participe = new ArrayList<Projet>();

	public Acteur(String nom, ETitre titre, EStatut statut, Entreprise entreprise, ArrayList<Projet> participe) {
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

	public ArrayList<Projet> getParticipe() {
		return participe;
	}

	public void setParticipe(ArrayList<Projet> participe) {
		this.participe = participe;
	}
	
	

}