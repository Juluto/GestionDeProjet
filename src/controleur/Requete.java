package controleur;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import modele.*;
import enumeration.ECorpsMetier;

public class Requete {
	
	public static void requete(EntityManagerFactory emf, EntityManager em) {
		projetsEnCours(emf, em);
		avancementProjet(emf, em, 12);
		countProjetEtaScol(emf, em);
		entrepriseMetier(emf, em, ECorpsMetier.plombier);
	}
	
	
	
	// requete 2
	public static void projetsEnCours(EntityManagerFactory emf, EntityManager em) {
		Query q1 = em.createNamedQuery("Projet.findEnCours");
		List<Projet> lesProjets = q1.getResultList();
		for ( Projet unProjet : lesProjets)
			System.out.println("Projet : " + unProjet.getNom());
	}
	
	// requete 3
	public static void avancementProjet(EntityManagerFactory emf, EntityManager em, int reference) {
		Query q1 = em.createNamedQuery("Projet.findAvance");
		q1.setParameter("reference", reference);
		List<Projet> lesProjets = q1.getResultList();
		for ( Projet unProjet : lesProjets)
			System.out.println("Projet de référence : " + unProjet.getRefProjet() + " et d'avancement : " + unProjet.getAvancement());
	}
	
	// requete 4
	public static void countProjetEtaScol(EntityManagerFactory emf, EntityManager em) {
		Query q1 = em.createNamedQuery("EtablissementScolaire.countEtaScol");
		List<EtablissementScolaire> lesEtablissementScolaire = q1.getResultList();
		System.out.println("Nombre de projet portant sur un établissement scolaire : " + lesEtablissementScolaire.size());
		}
	
	// requete 5
		public static void entrepriseMetier(EntityManagerFactory emf, EntityManager em, ECorpsMetier metier ) {
			Query q1 = em.createNamedQuery("Entreprise.findplomberie");
			q1.setParameter("metier", metier);
			List<Entreprise> lesEntreprises = q1.getResultList();
			for ( Entreprise uneEntreprise : lesEntreprises)
				System.out.println("Entreprise : " + uneEntreprise.getNom());
		}
		
}
