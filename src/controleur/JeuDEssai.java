package controleur;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import enumeration.ECharpente;
import enumeration.ECorpsMetier;
import enumeration.EStatut;
import enumeration.ETitre;
import enumeration.ETypeAppart;
import modele.Acteur;
import modele.Adresse;
import modele.Appartement;
import modele.Charpente;
import modele.Dallage;
import modele.Electricite;
import modele.Entreprise;
import modele.Fondation;
import modele.Maconnerie;
import modele.Menuiseries;
import modele.Peinture;
import modele.Platerie;
import modele.Reseaux;
import modele.Terrassement;

public class JeuDEssai {

	public static void jeuDEssai(EntityManagerFactory emf, EntityManager em) {
		ArrayList<Adresse> listAdresse = jeuAdresse(emf, em);
		ArrayList<Entreprise> listEntreprise = jeuEntreprise(emf, em, listAdresse);
		ArrayList<Acteur> listActeur = jeuActeur(emf, em, listEntreprise);
		ArrayList<Appartement> listAppartement = jeuAppartement(emf, em);
		ArrayList<Terrassement> listTerrassement = jeuTerrassement(emf, em, listEntreprise);
		ArrayList<Dallage> listDallage = jeuDallage(emf, em, listEntreprise);
		ArrayList<Menuiseries> listMenuiseries = jeuMenuiseries(emf, em, listEntreprise);
		ArrayList<Fondation> listFondation = jeuFondation(emf, em, listEntreprise);
		ArrayList<Maconnerie> listMaconnerie = jeuMaconnerie(emf, em, listEntreprise);
		ArrayList<Platerie> listPlaterie = jeuPlaterie(emf, em, listEntreprise);
		ArrayList<Electricite> listElectricite = jeuElectricite(emf, em, listEntreprise);
		ArrayList<Reseaux> listReseaux = jeuReseaux(emf, em, listEntreprise);
		ArrayList<Peinture> listPeinture = jeuPeinture(emf, em, listEntreprise);
		ArrayList<Charpente> listCharpente = jeuCharpente(emf, em, listEntreprise);
	}

	public static ArrayList<Acteur> jeuActeur(EntityManagerFactory emf, EntityManager em,
			ArrayList<Entreprise> listEntreprise) {
		ArrayList<Acteur> listActeur = new ArrayList<Acteur>();
		listActeur.add(new Acteur("actArchi1", ETitre.architecte, EStatut.BIM_Manager, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actArchi2", ETitre.architecte, EStatut.chef_d_equipe, listEntreprise.get(1), null));
		listActeur.add(new Acteur("actArchi3", ETitre.architecte, EStatut.directeur, listEntreprise.get(2), null));
		listActeur.add(new Acteur("actArchi4", ETitre.architecte, EStatut.responsable, listEntreprise.get(3), null));
		listActeur.add(new Acteur("actArchi5", ETitre.architecte, EStatut.employe, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actArchi6", ETitre.architecte, EStatut.employe, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actArchi7", ETitre.architecte, EStatut.employe, listEntreprise.get(1), null));
		listActeur.add(new Acteur("actArchi8", ETitre.architecte, EStatut.employe, listEntreprise.get(1), null));
		listActeur.add(new Acteur("actArchi9", ETitre.architecte, EStatut.employe, listEntreprise.get(2), null));
		listActeur.add(new Acteur("actArchi10", ETitre.architecte, EStatut.employe, listEntreprise.get(2), null));
		listActeur.add(new Acteur("actArchi11", ETitre.architecte, EStatut.employe, listEntreprise.get(3), null));
		listActeur.add(new Acteur("actArchi12", ETitre.architecte, EStatut.employe, listEntreprise.get(3), null));
		listActeur.add(new Acteur("actDocteur1", ETitre.docteur, EStatut.chef_d_equipe, listEntreprise.get(4), null));
		listActeur.add(new Acteur("actDocteur2", ETitre.docteur, EStatut.responsable, listEntreprise.get(5), null));
		listActeur.add(new Acteur("actDocteur3", ETitre.docteur, EStatut.chef_d_equipe, listEntreprise.get(6), null));
		listActeur.add(new Acteur("actDocteur4", ETitre.docteur, EStatut.responsable, listEntreprise.get(7), null));
		listActeur.add(new Acteur("actDocteur5", ETitre.docteur, EStatut.chef_d_equipe, listEntreprise.get(8), null));
		listActeur.add(new Acteur("actDocteur6", ETitre.docteur, EStatut.responsable, listEntreprise.get(9), null));
		listActeur.add(new Acteur("actIng1", ETitre.ingenieur, EStatut.BIM_Manager, listEntreprise.get(10), null));
		listActeur.add(new Acteur("actIng2", ETitre.ingenieur, EStatut.employe, listEntreprise.get(4), null));
		listActeur.add(new Acteur("actIng3", ETitre.ingenieur, EStatut.employe, listEntreprise.get(4), null));
		listActeur.add(new Acteur("actIng4", ETitre.ingenieur, EStatut.responsable, listEntreprise.get(11), null));
		listActeur.add(new Acteur("actIng5", ETitre.ingenieur, EStatut.employe, listEntreprise.get(5), null));
		listActeur.add(new Acteur("actIng6", ETitre.ingenieur, EStatut.employe, listEntreprise.get(5), null));
		listActeur.add(new Acteur("actIng7", ETitre.ingenieur, EStatut.employe, listEntreprise.get(6), null));
		listActeur.add(new Acteur("actIng8", ETitre.ingenieur, EStatut.employe, listEntreprise.get(6), null));
		listActeur.add(new Acteur("actIng9", ETitre.ingenieur, EStatut.employe, listEntreprise.get(7), null));
		listActeur.add(new Acteur("actIng10", ETitre.ingenieur, EStatut.employe, listEntreprise.get(7), null));
		listActeur.add(new Acteur("actIng11", ETitre.ingenieur, EStatut.employe, listEntreprise.get(8), null));
		listActeur.add(new Acteur("actIng12", ETitre.ingenieur, EStatut.employe, listEntreprise.get(8), null));
		listActeur.add(new Acteur("actIng13", ETitre.ingenieur, EStatut.employe, listEntreprise.get(9), null));
		listActeur.add(new Acteur("actIng14", ETitre.ingenieur, EStatut.employe, listEntreprise.get(9), null));
		listActeur.add(new Acteur("actIng15", ETitre.ingenieur, EStatut.employe, listEntreprise.get(10), null));
		listActeur.add(new Acteur("actIng16", ETitre.ingenieur, EStatut.employe, listEntreprise.get(10), null));
		listActeur.add(new Acteur("actTech1", ETitre.technicien, EStatut.chef_d_equipe, listEntreprise.get(12), null));
		listActeur.add(new Acteur("actTech2", ETitre.technicien, EStatut.employe, listEntreprise.get(11), null));
		listActeur.add(new Acteur("actTech3", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(11), null));
		listActeur.add(new Acteur("actTech4", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(12), null));
		listActeur.add(new Acteur("actTech5", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(12), null));
		listActeur.add(new Acteur("actTech6", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(13), null));
		listActeur.add(new Acteur("actTech7", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(13), null));
		listActeur.add(new Acteur("actTech8", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(14), null));
		listActeur.add(new Acteur("actTech9", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(14), null));
		listActeur.add(new Acteur("actTech10", ETitre.technicien, EStatut.chef_d_equipe, listEntreprise.get(13), null));
		listActeur.add(new Acteur("actTech11", ETitre.technicien, EStatut.chef_d_equipe, listEntreprise.get(14), null));
		Iterator<Acteur> iterator = listActeur.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}

		Set<Acteur> setActeur;
		ArrayList<Acteur> listActeurFilter = new ArrayList<Acteur>();
		for (int i = 0; i < listEntreprise.size(); i++) {
			for (int j = 0; j < listActeur.size(); j++) {
				if (listActeur.get(j).getEntreprise().equals(listEntreprise.get(i))) {
					listActeurFilter.add(listActeur.get(j));
				}
			}
			setActeur = new HashSet<Acteur>(listActeurFilter);
			em.getTransaction().begin();
			Entreprise entreprise = em.find(Entreprise.class, i + 1);
			entreprise.setActeur(setActeur);
			em.getTransaction().commit();
			listActeurFilter.clear();
		}
		return listActeur;
	}

	public static ArrayList<Adresse> jeuAdresse(EntityManagerFactory emf, EntityManager em) {
		ArrayList<Adresse> listAdresse = new ArrayList<Adresse>();
		listAdresse.add(new Adresse(0, 25, "rue des Capucins", 54000, "Nancy"));
		listAdresse.add(new Adresse(0, 12, "rue des Sapins", 57000, "Metz"));
		listAdresse.add(new Adresse(0, 2, "rue des Macaques", 68700, "Wattwiller"));
		listAdresse.add(new Adresse(0, 182, "rue de Rivoli", 75000, "Paris"));
		listAdresse.add(new Adresse(0, 25, "rue Saint-Pierre", 13005, "Marseille"));
		listAdresse.add(new Adresse(0, 1, "rue Saint Dizier", 49440, "Angrie"));
		listAdresse.add(new Adresse(0, 78, "rue des Projets", 18600, "Vereaux"));
		listAdresse.add(new Adresse(0, 85, "rue de la Marmotte", 71990, "Saint-Prix"));
		listAdresse.add(new Adresse(0, 24, "rue Sergent Blandan", 40280, "Bretagne-de-Marsan"));
		listAdresse.add(new Adresse(0, 36, "quaies des Orfevres", 11220, "Tournissan"));
		listAdresse.add(new Adresse(0, 89, "rue des Fleurs", 15190, "Saint-Amandin"));
		listAdresse.add(new Adresse(0, 47, "rue de la Place Carnot", 32160, "Tasque"));
		listAdresse.add(new Adresse(0, 12, "rue de Blizzard", 39800, "Barretaine"));
		listAdresse.add(new Adresse(0, 25, "rue des arbres", 68490, "Hombourg"));
		listAdresse.add(new Adresse(0, 25, "rue de toto", 17540, "Bouhet"));
		Iterator<Adresse> iterator = listAdresse.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}
		return listAdresse;
	}

	public static ArrayList<Entreprise> jeuEntreprise(EntityManagerFactory emf, EntityManager em,
			ArrayList<Adresse> listAdresse) {
		ArrayList<Entreprise> listEntreprise = new ArrayList<Entreprise>();
		listEntreprise
				.add(new Entreprise(0, "Blizzard", ECorpsMetier.couvreur, "0123456789", null, listAdresse.get(12)));
		listEntreprise
				.add(new Entreprise(0, "Cave a Vin", ECorpsMetier.plombier, "0385410267", null, listAdresse.get(1)));
		listEntreprise.add(new Entreprise(0, "Artem", ECorpsMetier.macon, "0214960248", null, listAdresse.get(2)));
		listEntreprise
				.add(new Entreprise(0, "Carrefour", ECorpsMetier.carreleur, "0348961752", null, listAdresse.get(3)));
		listEntreprise.add(
				new Entreprise(0, "Electrodrole", ECorpsMetier.electricien, "0321478569", null, listAdresse.get(4)));
		listEntreprise
				.add(new Entreprise(0, "Serre a Rien", ECorpsMetier.serrurier, "0287459632", null, listAdresse.get(5)));
		listEntreprise.add(
				new Entreprise(0, "Mario et Luigi", ECorpsMetier.plombier, "0149632578", null, listAdresse.get(6)));
		listEntreprise.add(new Entreprise(0, "Platre", ECorpsMetier.platrier, "0125479635", null, listAdresse.get(7)));
		listEntreprise
				.add(new Entreprise(0, "Peinturier", ECorpsMetier.peintre, "0458963784", null, listAdresse.get(8)));
		listEntreprise
				.add(new Entreprise(0, "Menuisieur", ECorpsMetier.menuisier, "0548963274", null, listAdresse.get(9)));
		listEntreprise.add(
				new Entreprise(0, "Electrichien", ECorpsMetier.electricien, "0478246395", null, listAdresse.get(10)));
		listEntreprise.add(
				new Entreprise(0, "Portuguese", ECorpsMetier.charpentier, "0148523796", null, listAdresse.get(11)));
		listEntreprise
				.add(new Entreprise(0, "Car l'heure", ECorpsMetier.carreleur, "0245896324", null, listAdresse.get(13)));
		listEntreprise
				.add(new Entreprise(0, "Platre riait", ECorpsMetier.platrier, "0247896324", null, listAdresse.get(0)));
		listEntreprise.add(new Entreprise(0, "Toto", ECorpsMetier.peintre, "0485963247", null, listAdresse.get(14)));
		Iterator<Entreprise> iterator = listEntreprise.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}
		return listEntreprise;
	}

	public static ArrayList<Appartement> jeuAppartement(EntityManagerFactory emf, EntityManager em) {
		ArrayList<Appartement> listAppartement = new ArrayList<Appartement>();
		listAppartement.add(new Appartement(0, 0, 45, ETypeAppart.t1));
		listAppartement.add(new Appartement(0, 0, 40, ETypeAppart.t1));
		listAppartement.add(new Appartement(0, 1, 25, ETypeAppart.studio));
		listAppartement.add(new Appartement(0, 1, 30, ETypeAppart.studio));
		listAppartement.add(new Appartement(0, 1, 50, ETypeAppart.t1));
		listAppartement.add(new Appartement(0, 1, 60, ETypeAppart.t2));
		listAppartement.add(new Appartement(0, 2, 80, ETypeAppart.t3));
		listAppartement.add(new Appartement(0, 2, 80, ETypeAppart.t3));
		listAppartement.add(new Appartement(0, 2, 75, ETypeAppart.t2));
		listAppartement.add(new Appartement(0, 2, 60, ETypeAppart.t2));
		listAppartement.add(new Appartement(0, 3, 90, ETypeAppart.t4));
		listAppartement.add(new Appartement(0, 3, 45, ETypeAppart.t1));
		listAppartement.add(new Appartement(0, 3, 35, ETypeAppart.t1));
		listAppartement.add(new Appartement(0, 3, 40, ETypeAppart.t1));
		listAppartement.add(new Appartement(0, 4, 45, ETypeAppart.t1));
		listAppartement.add(new Appartement(0, 4, 85, ETypeAppart.t4));
		listAppartement.add(new Appartement(0, 4, 100, ETypeAppart.t4));
		listAppartement.add(new Appartement(0, 4, 45, ETypeAppart.t1));

		Iterator<Appartement> iterator = listAppartement.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}
		return listAppartement;
	}

	public static ArrayList<Terrassement> jeuTerrassement(EntityManagerFactory emf, EntityManager em,
			ArrayList<Entreprise> listEntreprise) {
		Date dateDebut1 = new Date(117, 10, 13);
		Date dateDebut2 = new Date(116, 8, 20);
		Date dateDebut3 = new Date(117, 3, 5);
		Date dateDebut4 = new Date(117, 4, 12);

		Date dateFin3 = new Date(117, 5, 5);
		Date dateFin4 = new Date(117, 8, 12);

		ArrayList<Terrassement> listTerrassement = new ArrayList<Terrassement>();

		Set<Entreprise> setEntreprise1 = new HashSet<Entreprise>();
		setEntreprise1.add(listEntreprise.get(0));
		setEntreprise1.add(listEntreprise.get(1));
		listTerrassement.add(new Terrassement(0, dateDebut1, 4, 150000, "enCours", 200000, null, setEntreprise1,
				listEntreprise.get(0), 200));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(2));
		setEntreprise2.add(listEntreprise.get(3));
		listTerrassement.add(new Terrassement(0, dateDebut2, 5, 160000, "enCours", 180000, null, setEntreprise2,
				listEntreprise.get(2), 150));

		Iterator<Terrassement> iterator = listTerrassement.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}
		return listTerrassement;
	}
	
	public static ArrayList<Dallage> jeuDallage(EntityManagerFactory emf, EntityManager em,
			ArrayList<Entreprise> listEntreprise) {
		Date dateDebut1 = new Date(117, 7, 4);
		Date dateDebut2 = new Date(116, 2, 20);
		Date dateDebut3 = new Date(117, 4, 6);
		Date dateDebut4 = new Date(117, 8, 16);

		Date dateFin3 = new Date(117, 6, 8);
		Date dateFin4 = new Date(117, 9, 16);

		ArrayList<Dallage> listDallage = new ArrayList<Dallage>();

		Set<Entreprise> setEntreprise1 = new HashSet<Entreprise>();
		setEntreprise1.add(listEntreprise.get(10));
		setEntreprise1.add(listEntreprise.get(11));
		setEntreprise1.add(listEntreprise.get(12));
		listDallage.add(new Dallage(0, dateDebut1, 6, 200000, "enCours", 220000, null, setEntreprise1,
				listEntreprise.get(10), 220));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(6));
		setEntreprise2.add(listEntreprise.get(7));
		listDallage.add(new Dallage(0, dateDebut2, 7, 170000, "enCours", 180000, null, setEntreprise2,
				listEntreprise.get(2), 130));

		Iterator<Dallage> iterator = listDallage.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}
		return listDallage;
	}
	
	public static ArrayList<Menuiseries> jeuMenuiseries(EntityManagerFactory emf, EntityManager em,
			ArrayList<Entreprise> listEntreprise) {
		Date dateDebut1 = new Date(117, 6, 4);
		Date dateDebut2 = new Date(116, 3, 22);
		Date dateDebut3 = new Date(117, 7, 15);
		Date dateDebut4 = new Date(117, 6, 22);

		Date dateFin3 = new Date(117, 8, 5);
		Date dateFin4 = new Date(117, 3, 22);

		ArrayList<Menuiseries> listMenuiseries = new ArrayList<Menuiseries>();

		Set<Entreprise> setEntreprise1 = new HashSet<Entreprise>();
		setEntreprise1.add(listEntreprise.get(5));
		setEntreprise1.add(listEntreprise.get(4));
		listMenuiseries.add(new Menuiseries(0, dateDebut1, 2, 120000, "enCours", 150000, null, setEntreprise1,
				listEntreprise.get(5), 10, 4, 2));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(12));
		listMenuiseries.add(new Menuiseries(0, dateDebut2, 7, 160000, "enCours", 200000, null, setEntreprise2,
				listEntreprise.get(12), 7, 3, 1));

		Iterator<Menuiseries> iterator = listMenuiseries.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}
		return listMenuiseries;
	}
	
	public static ArrayList<Fondation> jeuFondation(EntityManagerFactory emf, EntityManager em,
			ArrayList<Entreprise> listEntreprise) {
		Date dateDebut1 = new Date(117, 1, 23);
		Date dateDebut2 = new Date(116, 9, 2);
		Date dateDebut3 = new Date(117, 6, 24);
		Date dateDebut4 = new Date(117, 7, 2);

		Date dateFin3 = new Date(117, 12, 25);
		Date dateFin4 = new Date(117, 9, 23);

		ArrayList<Fondation> listFondation = new ArrayList<Fondation>();

		Set<Entreprise> setEntreprise1 = new HashSet<Entreprise>();
		setEntreprise1.add(listEntreprise.get(14));
		setEntreprise1.add(listEntreprise.get(13));
		listFondation.add(new Fondation(0, dateDebut1, 4, 150000, "enCours", 200000, null, setEntreprise1,
				listEntreprise.get(0), 180));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(11));
		setEntreprise2.add(listEntreprise.get(3));
		setEntreprise2.add(listEntreprise.get(4));
		listFondation.add(new Fondation(0, dateDebut2, 5, 160000, "enCours", 180000, null, setEntreprise2,
				listEntreprise.get(2), 170));

		Iterator<Fondation> iterator = listFondation.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}
		return listFondation;
	}
	
	public static ArrayList<Maconnerie> jeuMaconnerie(EntityManagerFactory emf, EntityManager em,
			ArrayList<Entreprise> listEntreprise) {
		Date dateDebut1 = new Date(117, 2, 7);
		Date dateDebut2 = new Date(116, 9, 4);
		Date dateDebut3 = new Date(117, 7, 17);
		Date dateDebut4 = new Date(117, 3, 22);

		Date dateFin3 = new Date(117, 8, 13);
		Date dateFin4 = new Date(117, 9, 16);

		ArrayList<Maconnerie> listMaconnerie = new ArrayList<Maconnerie>();

		Set<Entreprise> setEntreprise1 = new HashSet<Entreprise>();
		setEntreprise1.add(listEntreprise.get(8));
		setEntreprise1.add(listEntreprise.get(9));
		listMaconnerie.add(new Maconnerie(0, dateDebut1, 10, 300000, "enCours", 300000, null, setEntreprise1,
				listEntreprise.get(9), 300, 7));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(5));
		setEntreprise2.add(listEntreprise.get(7));
		listMaconnerie.add(new Maconnerie(0, dateDebut2, 7, 200000, "enCours", 190000, null, setEntreprise2,
				listEntreprise.get(7), 150, 4));

		Iterator<Maconnerie> iterator = listMaconnerie.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}
		return listMaconnerie;
	}
	
	public static ArrayList<Platerie> jeuPlaterie(EntityManagerFactory emf, EntityManager em,
			ArrayList<Entreprise> listEntreprise) {
		Date dateDebut1 = new Date(117, 3, 8);
		Date dateDebut2 = new Date(116, 7, 14);
		Date dateDebut3 = new Date(117, 8, 4);
		Date dateDebut4 = new Date(117, 6, 1);

		Date dateFin3 = new Date(117, 8, 15);
		Date dateFin4 = new Date(117, 9, 14);

		ArrayList<Platerie> listPlaterie = new ArrayList<Platerie>();

		Set<Entreprise> setEntreprise1 = new HashSet<Entreprise>();
		setEntreprise1.add(listEntreprise.get(12));
		setEntreprise1.add(listEntreprise.get(13));
		listPlaterie.add(new Platerie(0, dateDebut1, 4, 170000, "enCours", 200000, null, setEntreprise1,
				listEntreprise.get(12), 210, 300));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(10));
		setEntreprise2.add(listEntreprise.get(11));
		listPlaterie.add(new Platerie(0, dateDebut2, 5, 160000, "enCours", 180000, null, setEntreprise2,
				listEntreprise.get(10), 150, 210));

		Iterator<Platerie> iterator = listPlaterie.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}
		return listPlaterie;
	}
	
	public static ArrayList<Electricite> jeuElectricite(EntityManagerFactory emf, EntityManager em,
			ArrayList<Entreprise> listEntreprise) {
		Date dateDebut1 = new Date(117, 2, 2);
		Date dateDebut2 = new Date(116, 4, 20);
		Date dateDebut3 = new Date(117, 1, 14);
		Date dateDebut4 = new Date(117, 5, 12);

		Date dateFin3 = new Date(117, 10, 15);
		Date dateFin4 = new Date(117, 4, 20);

		ArrayList<Electricite> listElectricite = new ArrayList<Electricite>();

		Set<Entreprise> setEntreprise1 = new HashSet<Entreprise>();
		setEntreprise1.add(listEntreprise.get(4));
		setEntreprise1.add(listEntreprise.get(13));
		listElectricite.add(new Electricite(0, dateDebut1, 4, 160000, "enCours", 170000, null, setEntreprise1,
				listEntreprise.get(4), 2, 40));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(3));
		setEntreprise2.add(listEntreprise.get(7));
		listElectricite.add(new Electricite(0, dateDebut2, 5, 160000, "enCours", 170000, null, setEntreprise2,
				listEntreprise.get(7), 3, 20));

		Iterator<Electricite> iterator = listElectricite.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}
		return listElectricite;
	}
	
	public static ArrayList<Reseaux> jeuReseaux(EntityManagerFactory emf, EntityManager em,
			ArrayList<Entreprise> listEntreprise) {
		Date dateDebut1 = new Date(117, 2, 14);
		Date dateDebut2 = new Date(116, 3, 7);
		Date dateDebut3 = new Date(117, 6, 25);
		Date dateDebut4 = new Date(117, 7, 23);

		Date dateFin3 = new Date(117, 7, 5);
		Date dateFin4 = new Date(117, 8, 12);

		ArrayList<Reseaux> listReseaux = new ArrayList<Reseaux>();

		Set<Entreprise> setEntreprise1 = new HashSet<Entreprise>();
		setEntreprise1.add(listEntreprise.get(12));
		setEntreprise1.add(listEntreprise.get(13));
		listReseaux.add(new Reseaux(0, dateDebut1, 4, 160000, "enCours", 160000, null, setEntreprise1,
				listEntreprise.get(12), 200));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(14));
		setEntreprise2.add(listEntreprise.get(3));
		listReseaux.add(new Reseaux(0, dateDebut2, 5, 150000, "enCours", 140000, null, setEntreprise2,
				listEntreprise.get(14), 170));

		Iterator<Reseaux> iterator = listReseaux.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}
		return listReseaux;
	}
	
	public static ArrayList<Peinture> jeuPeinture(EntityManagerFactory emf, EntityManager em,
			ArrayList<Entreprise> listEntreprise) {
		Date dateDebut1 = new Date(117, 4, 12);
		Date dateDebut2 = new Date(116, 2, 27);
		Date dateDebut3 = new Date(117, 3, 25);
		Date dateDebut4 = new Date(117, 7, 9);

		Date dateFin3 = new Date(117, 8, 25);
		Date dateFin4 = new Date(117, 9, 2);

		ArrayList<Peinture> listPeinture = new ArrayList<Peinture>();

		Set<Entreprise> setEntreprise1 = new HashSet<Entreprise>();
		setEntreprise1.add(listEntreprise.get(9));
		setEntreprise1.add(listEntreprise.get(2));
		listPeinture.add(new Peinture(0, dateDebut1, 4, 180000, "enCours", 190000, null, setEntreprise1,
				listEntreprise.get(2), 200));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(10));
		setEntreprise2.add(listEntreprise.get(11));
		setEntreprise2.add(listEntreprise.get(12));
		listPeinture.add(new Peinture(0, dateDebut2, 5, 160000, "enCours", 160000, null, setEntreprise2,
				listEntreprise.get(11), 170));

		Iterator<Peinture> iterator = listPeinture.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}
		return listPeinture;
	}
	
	public static ArrayList<Charpente> jeuCharpente(EntityManagerFactory emf, EntityManager em,
			ArrayList<Entreprise> listEntreprise) {
		Date dateDebut1 = new Date(117, 4, 5);
		Date dateDebut2 = new Date(116, 1, 20);
		Date dateDebut3 = new Date(117, 9, 13);
		Date dateDebut4 = new Date(117, 8, 23);

		Date dateFin3 = new Date(117, 9, 12);
		Date dateFin4 = new Date(117, 10, 25);

		ArrayList<Charpente> listCharpente = new ArrayList<Charpente>();

		Set<Entreprise> setEntreprise1 = new HashSet<Entreprise>();
		setEntreprise1.add(listEntreprise.get(14));
		setEntreprise1.add(listEntreprise.get(13));
		listCharpente.add(new Charpente(0, dateDebut1, 4, 110000, "enCours", 120000, null, setEntreprise1,
				listEntreprise.get(14), ECharpente.traditionnelle));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(8));
		setEntreprise2.add(listEntreprise.get(9));
		listCharpente.add(new Charpente(0, dateDebut2, 5, 90000, "enCours", 100000, null, setEntreprise2,
				listEntreprise.get(8), ECharpente.toitPlat));

		Iterator<Charpente> iterator = listCharpente.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}
		return listCharpente;
	}

	public void ProjetsTermines() {
		lotissementTermine();
		immeubleTermine();
		hopitalTermine();
		maisonTermine();
	}

	public void lotissementTermine() {

	}

	public void immeubleTermine() {

	}

	public void hopitalTermine() {

	}

	public void maisonTermine() {

	}

	public void ProjetsEnCours() {
		etablissementScolaireEnCours();
		immeubleEnCours();
		museeEnCours();
	}

	private void museeEnCours() {

	}

	private void immeubleEnCours() {

	}

	private void etablissementScolaireEnCours() {

	}
}
