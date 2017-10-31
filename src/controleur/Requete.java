package controleur;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import enumeration.ECorpsMetier;
import modele.Entreprise;
import modele.EtablissementScolaire;
import modele.Lot;
import modele.Projet;

public class Requete {

	public static void requete(EntityManagerFactory emf, EntityManager em) {
		cabinetTravaille(emf, em);
		projetsEnCours(emf, em);
		avancementProjet(emf, em, 12);
		countProjetEtaScol(emf, em);
		entrepriseMetier(emf, em, ECorpsMetier.plombier);
	}

	// Requete 1 : Quelles sont les entreprises avec lesquelles le cabinet travaille
	// ?
	public static void cabinetTravaille(EntityManagerFactory emf, EntityManager em) {
		System.out.println();
		System.out.println("Requete 1 : Quelles sont les entreprises avec lesquelles le cabinet travaille ?");
		Query q1 = em.createNamedQuery("Lot.cabinetTravaille");
		List<Lot> cabinetTravaille = q1.getResultList();
		ArrayList<Entreprise> entreprise = new ArrayList<Entreprise>();
		for (Lot unTravail : cabinetTravaille) {
			if (!entreprise.contains(unTravail.getResponsable())) {
				entreprise.add(unTravail.getResponsable());
			}
		}
		for (int i=0;i<entreprise.size();i++) {
			System.out.println("Entreprise : " + entreprise.get(i).getNom());
		}
	}

	// Requete 2 : Quels sont les projets en cours ?
	public static void projetsEnCours(EntityManagerFactory emf, EntityManager em) {
		System.out.println();
		System.out.println("Requete 2 : Quels sont les projets en cours ?");
		Query q1 = em.createNamedQuery("Projet.findEnCours");
		List<Projet> lesProjets = q1.getResultList();
		for (Projet unProjet : lesProjets)
			System.out.println("Projet : " + unProjet.getNom());
	}

	// Requete 3 : Quel est l'avancement du projet de reference 12 ?
	public static void avancementProjet(EntityManagerFactory emf, EntityManager em, int reference) {
		System.out.println();
		System.out.println("Requete 3 : Quel est l'avancement du projet de reference 12 ?");
		Query q1 = em.createNamedQuery("Projet.findAvance");
		q1.setParameter("reference", reference);
		List<Projet> lesProjets = q1.getResultList();
		for (Projet unProjet : lesProjets)
			System.out.println("Projet de référence : " + unProjet.getRefProjet() + " et d'avancement : "
					+ unProjet.getAvancement());
	}

	// Requete 4 : Combien de projets portant sur un etablissement scolaire ont ete
	// realise ?
	public static void countProjetEtaScol(EntityManagerFactory emf, EntityManager em) {
		System.out.println();
		System.out.println("Requete 4 : Combien de projets portant sur un etablissement scolaire ont ete realise ?");
		Query q1 = em.createNamedQuery("EtablissementScolaire.countEtaScol");
		List<EtablissementScolaire> lesEtablissementScolaire = q1.getResultList();
		System.out
				.println("Nombre de projet portant sur un établissement scolaire : " + lesEtablissementScolaire.size());
	}

	// Requete 5 : Quelles sont les entreprises de plomberie ?
	public static void entrepriseMetier(EntityManagerFactory emf, EntityManager em, ECorpsMetier metier) {
		System.out.println();
		System.out.println("Requete 5 : Quelles sont les entreprises de plomberie ?");
		Query q1 = em.createNamedQuery("Entreprise.findplomberie");
		q1.setParameter("metier", metier);
		List<Entreprise> lesEntreprises = q1.getResultList();
		for (Entreprise uneEntreprise : lesEntreprises)
			System.out.println("Entreprise : " + uneEntreprise.getNom());
	}

}
