package controleur;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import enumeration.ECorpsMetier;
import modele.Acteur;
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
		nomContacts(emf, em, "General Batiment");
		projetsTermines(emf, em, "General Batiment", true);
		lotsProjetsEnCours(emf, em, "General Batiment", false);
		acteursParticipent(emf, em, 12);
		countLots12(emf, em, 12);
		coutTotalEstime12(emf, em, 12);
		entreprisesMenuiseriesMusee(emf, em);
		dureesProjetsEnCours(emf, em);
		avancementLots12(emf, em, 12);
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
		for (int i = 0; i < entreprise.size(); i++) {
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

	// Requete 3 : Quel est l'avancement du projet de reference "12" ?
	public static void avancementProjet(EntityManagerFactory emf, EntityManager em, int reference) {
		System.out.println();
		System.out.println("Requete 3 : Quel est l'avancement du projet de reference \"12\" ?");
		Query q1 = em.createNamedQuery("Projet.findAvance");
		q1.setParameter("reference", reference);
		List<Projet> lesProjets = q1.getResultList();
		for (Projet unProjet : lesProjets)
			System.out.println("Projet de reference : " + unProjet.getRefProjet() + " et d'avancement : "
					+ unProjet.getAvancement());
	}

	// Requete 4 : Combien de projets portant sur un etablissement scolaire ont ete
	// realise ?
	public static void countProjetEtaScol(EntityManagerFactory emf, EntityManager em) {
		System.out.println();
		System.out.println("Requete 4 : Combien de projets portant sur un etablissement scolaire ont ete realise ?");
		Query q1 = em.createNamedQuery("EtablissementScolaire.countEtaScol");
		long lesEtablissementScolaire = (long) q1.getSingleResult();
		System.out
				.println("Nombre de projet portant sur un etablissement scolaire : " + lesEtablissementScolaire);
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

	// Requete 6 : Quels sont les noms des contacts de l'entreprise "General
	// Batiment" ?
	public static void nomContacts(EntityManagerFactory emf, EntityManager em, String nomEntreprise) {
		System.out.println();
		System.out.println("Requete 6 : Quels sont les noms des contacts de l'entreprise \"General Batiment\" ?");
		Query q1 = em.createNamedQuery("Acteur.getContact");
		q1.setParameter("nomEntreprise", nomEntreprise);
		List<Acteur> contact = q1.getResultList();
		for (Acteur acteur : contact)
			System.out.println("Contact : " + acteur.getNom());
	}

	// Requete 7 : A quels projets termines l'entreprise "General Batiment" a
	// participe ?
	public static void projetsTermines(EntityManagerFactory emf, EntityManager em, String nomEntreprise,
			boolean termine) {
		System.out.println();
		System.out.println("Requete 7 : A quels projets termines l'entreprise \"General Batiment\" a participe ?");
		Query q1 = em.createNamedQuery("Projet.projetsTermines");
		q1.setParameter("nomEntreprise", nomEntreprise);
		q1.setParameter("termine", termine);
		List<Projet> lesProjets = q1.getResultList();
		for (Projet projet : lesProjets)
			System.out.println("Projet : " + projet.getNom());
	}

	// Requete 8 : Quels sont les lots des projets en cours auxquels participe
	// l'entreprise "General Batiment" ?
	public static void lotsProjetsEnCours(EntityManagerFactory emf, EntityManager em, String nomEntreprise,
			boolean termine) {
		System.out.println();
		System.out.println(
				"Requete 8 : Quels sont les lots des projets en cours auxquels participe l'entreprise \"General Batiment\" ?");
		Query q1 = em.createNamedQuery("Lot.lotsProjetsEnCours");
		q1.setParameter("nomEntreprise", nomEntreprise);
		q1.setParameter("termine", termine);
		List<Lot> lesLots = q1.getResultList();
		for (Lot lot : lesLots)
			System.out.println("Lot : " + lot.getNumero());
	}

	// Requete 9 : Quels sont les acteurs (et leur entreprise) participant au projet
	// de reference "12" ?
	public static void acteursParticipent(EntityManagerFactory emf, EntityManager em, int reference) {
		System.out.println();
		System.out.println(
				"Requete 9 : Quels sont les acteurs (et leur entreprise) participant au projet de reference \"12\" ?");
		Query q1 = em.createNamedQuery("Acteur.acteursParticipent");
		q1.setParameter("reference", reference);
		List<Acteur> lesActeurs = q1.getResultList();
		for (Acteur acteur : lesActeurs)
			System.out
					.println("Acteur : " + acteur.getNom() + " dans l'entreprise : " + acteur.getEntreprise().getNom());
	}

	// Requete 10 : Combien de lots a le projet de reference "12" ?
	public static void countLots12(EntityManagerFactory emf, EntityManager em, int reference) {
		System.out.println();
		System.out.println("Requete 10 : Combien de lots a le projet de reference \"12\" ?");
		Query q1 = em.createNamedQuery("Projet.countLots12");
		q1.setParameter("reference", reference);
		long lot = (long) q1.getSingleResult();
		System.out.println("Nombre : " + lot);
	}

	// Requete 11 : Quel est le cout total estime du projet de reference "12" ?
	public static void coutTotalEstime12(EntityManagerFactory emf, EntityManager em, int reference) {
		System.out.println();
		System.out.println("Requete 11 : Quel est le cout total estime du projet de reference \"12\" ?");
		Query q1 = em.createNamedQuery("Projet.coutTotalEstime12");
		q1.setParameter("reference", reference);
		List<Projet> lesProjets = q1.getResultList();
		for (Projet projet : lesProjets)
			System.out.println("Cout total estime : " + projet.getCoutTotalEstime());
	}

	// Requete 12 : Quelles sont les entreprises (et leur adresse) qui ont realisees
	// les menuiseries dans les projet de Musee ?
	public static void entreprisesMenuiseriesMusee(EntityManagerFactory emf, EntityManager em) {
		System.out.println();
		System.out.println(
				"Requete 12 : Quelles sont les entreprises (et leur adresse) qui ont realisees les menuiseries dans les projet de Musee ?");
		Query q1 = em.createNamedQuery("Musee.entreprisesMenuiseriesMusee");
		List<Entreprise> lesEntreprises = q1.getResultList();
		for (Entreprise uneEntreprise : lesEntreprises)
			System.out.println("Entreprise : " + uneEntreprise.getNom() + " et adresse : "
					+ uneEntreprise.getSiegeSocial().getNumero() + " " + uneEntreprise.getSiegeSocial().getRue() + " à "
					+ uneEntreprise.getSiegeSocial().getVille());
	}

	// Requete 13 : Quelles sont les durees estimees des differents projets en cours
	// ?
	public static void dureesProjetsEnCours(EntityManagerFactory emf, EntityManager em) {
		System.out.println();
		System.out.println("Requete 13 : Quelles sont les durees estimees des differents projets en cours ?");
		Date date = new Date();
		Query q1 = em.createNamedQuery("Projet.tempsEstimeProjetEnCours");
		List<Projet> lesProjets = q1.getResultList();
		for (Projet unProjet : lesProjets) {
			Calendar startCalendar = new GregorianCalendar();
			Date startDate = new Date();
			startCalendar.setTime(startDate);
			Calendar endCalendar = new GregorianCalendar();
			endCalendar.setTime(unProjet.getDateFinEstimee());
			int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
			int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
			
			System.out.println("Projet de reference : " + unProjet.getRefProjet() + " et de durée estimée : "
					+ diffMonth + " mois");
			}
		}

	// Requete 14 : Quels sont les avancements des lots (et leur type) du projet de
	// reference "12" ?
	public static void avancementLots12(EntityManagerFactory emf, EntityManager em, int reference) {
		System.out.println();
		System.out.println(
				"Requete 14 : Quels sont les avancements des lots (et leur type) du projet de reference \"12\" ?");
		Query q1 = em.createNamedQuery("Lot.avancementLotDuProjet");
		q1.setParameter("reference", reference);
		List<Lot> lesLots = q1.getResultList();
		for (Lot unLot : lesLots)
			System.out.println("Lot de reference : " + unLot.getNumero() + " , de type : " + unLot.getClass().getSimpleName() + " et d'avancement : "
					+ unLot.getAvancement());
	}
}
