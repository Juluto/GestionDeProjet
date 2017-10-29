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
import enumeration.EEtaScolaire;
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
import modele.EtablissementScolaire;
import modele.Fondation;
import modele.Immeuble;
import modele.Lot;
import modele.Maconnerie;
import modele.Menuiseries;
import modele.Musee;
import modele.Peinture;
import modele.Platerie;
import modele.Projet;
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
		projetsEnCours(emf, em, listAdresse, listAppartement, listTerrassement, listDallage, listMenuiseries,
				listActeur, listFondation, listMaconnerie, listPlaterie, listElectricite, listReseaux, listPeinture,
				listCharpente);
		projetsTermines(emf, em, listAdresse, listAppartement, listTerrassement, listDallage, listMenuiseries,
				listActeur, listFondation, listMaconnerie, listPlaterie, listElectricite, listReseaux, listPeinture,
				listCharpente);
	}

	public static ArrayList<Acteur> jeuActeur(EntityManagerFactory emf, EntityManager em,
			ArrayList<Entreprise> listEntreprise) {
		ArrayList<Acteur> listActeur = new ArrayList<Acteur>();
		listActeur.add(new Acteur("actArchi1", ETitre.architecte, EStatut.BIM_Manager, listEntreprise.get(0),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi2", ETitre.architecte, EStatut.chef_d_equipe, listEntreprise.get(1),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi3", ETitre.architecte, EStatut.directeur, listEntreprise.get(2),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi4", ETitre.architecte, EStatut.responsable, listEntreprise.get(3),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi5", ETitre.architecte, EStatut.employe, listEntreprise.get(0),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi6", ETitre.architecte, EStatut.employe, listEntreprise.get(0),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi7", ETitre.architecte, EStatut.employe, listEntreprise.get(1),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi8", ETitre.architecte, EStatut.employe, listEntreprise.get(1),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi9", ETitre.architecte, EStatut.employe, listEntreprise.get(2),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi10", ETitre.architecte, EStatut.employe, listEntreprise.get(2),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi11", ETitre.architecte, EStatut.employe, listEntreprise.get(3),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi12", ETitre.architecte, EStatut.employe, listEntreprise.get(3),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi13", ETitre.architecte, EStatut.BIM_Manager, listEntreprise.get(15),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi14", ETitre.architecte, EStatut.employe, listEntreprise.get(15),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi15", ETitre.architecte, EStatut.directeur, listEntreprise.get(16),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi16", ETitre.architecte, EStatut.responsable, listEntreprise.get(17),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi17", ETitre.architecte, EStatut.BIM_Manager, listEntreprise.get(18),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi18", ETitre.architecte, EStatut.BIM_Manager, listEntreprise.get(19),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actArchi19", ETitre.architecte, EStatut.employe, listEntreprise.get(18),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actDocteur1", ETitre.docteur, EStatut.chef_d_equipe, listEntreprise.get(4),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actDocteur2", ETitre.docteur, EStatut.responsable, listEntreprise.get(5),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actDocteur3", ETitre.docteur, EStatut.chef_d_equipe, listEntreprise.get(6),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actDocteur4", ETitre.docteur, EStatut.responsable, listEntreprise.get(7),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actDocteur5", ETitre.docteur, EStatut.chef_d_equipe, listEntreprise.get(8),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actDocteur6", ETitre.docteur, EStatut.responsable, listEntreprise.get(9),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actDocteur7", ETitre.docteur, EStatut.chef_d_equipe, listEntreprise.get(23),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actDocteur8", ETitre.docteur, EStatut.responsable, listEntreprise.get(23),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng1", ETitre.ingenieur, EStatut.BIM_Manager, listEntreprise.get(10),
				new HashSet<Projet>()));
		listActeur.add(
				new Acteur("actIng2", ETitre.ingenieur, EStatut.employe, listEntreprise.get(4), new HashSet<Projet>()));
		listActeur.add(
				new Acteur("actIng3", ETitre.ingenieur, EStatut.employe, listEntreprise.get(4), new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng4", ETitre.ingenieur, EStatut.responsable, listEntreprise.get(11),
				new HashSet<Projet>()));
		listActeur.add(
				new Acteur("actIng5", ETitre.ingenieur, EStatut.employe, listEntreprise.get(5), new HashSet<Projet>()));
		listActeur.add(
				new Acteur("actIng6", ETitre.ingenieur, EStatut.employe, listEntreprise.get(5), new HashSet<Projet>()));
		listActeur.add(
				new Acteur("actIng7", ETitre.ingenieur, EStatut.employe, listEntreprise.get(6), new HashSet<Projet>()));
		listActeur.add(
				new Acteur("actIng8", ETitre.ingenieur, EStatut.employe, listEntreprise.get(6), new HashSet<Projet>()));
		listActeur.add(
				new Acteur("actIng9", ETitre.ingenieur, EStatut.employe, listEntreprise.get(7), new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng10", ETitre.ingenieur, EStatut.employe, listEntreprise.get(7),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng11", ETitre.ingenieur, EStatut.employe, listEntreprise.get(8),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng12", ETitre.ingenieur, EStatut.employe, listEntreprise.get(8),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng13", ETitre.ingenieur, EStatut.employe, listEntreprise.get(9),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng14", ETitre.ingenieur, EStatut.employe, listEntreprise.get(9),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng15", ETitre.ingenieur, EStatut.employe, listEntreprise.get(10),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng16", ETitre.ingenieur, EStatut.employe, listEntreprise.get(10),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng17", ETitre.ingenieur, EStatut.employe, listEntreprise.get(16),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng18", ETitre.ingenieur, EStatut.employe, listEntreprise.get(16),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng19", ETitre.ingenieur, EStatut.employe, listEntreprise.get(18),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng20", ETitre.ingenieur, EStatut.BIM_Manager, listEntreprise.get(20),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng21", ETitre.ingenieur, EStatut.employe, listEntreprise.get(20),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng22", ETitre.ingenieur, EStatut.employe, listEntreprise.get(20),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng23", ETitre.ingenieur, EStatut.responsable, listEntreprise.get(22),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actIng24", ETitre.ingenieur, EStatut.employe, listEntreprise.get(22),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech1", ETitre.technicien, EStatut.chef_d_equipe, listEntreprise.get(12),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech2", ETitre.technicien, EStatut.employe, listEntreprise.get(11),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech3", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(11),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech4", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(12),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech5", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(12),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech6", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(13),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech7", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(13),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech8", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(14),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech9", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(14),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech10", ETitre.technicien, EStatut.chef_d_equipe, listEntreprise.get(13),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech11", ETitre.technicien, EStatut.chef_d_equipe, listEntreprise.get(14),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech12", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(15),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech13", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(17),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech14", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(17),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech15", ETitre.technicien, EStatut.employe, listEntreprise.get(19),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech16", ETitre.technicien, EStatut.employe, listEntreprise.get(19),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech17", ETitre.technicien, EStatut.chef_d_equipe, listEntreprise.get(21),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech18", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(21),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech19", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(21),
				new HashSet<Projet>()));
		listActeur.add(new Acteur("actTech20", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(23),
				new HashSet<Projet>()));
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
		listAdresse.add(new Adresse(0, 12, "rue de tata", 16380, "Chazelles"));
		listAdresse.add(new Adresse(0, 74, "rue de tutu", 24550, "Lavaur"));
		listAdresse.add(new Adresse(0, 45, "rue de titi", 46800, "Montcuq"));
		listAdresse.add(new Adresse(0, 25, "rue de pissentlit", 54740, "Jevoncourt"));
		listAdresse.add(new Adresse(0, 51, "rue de la menagerie", 62240, "Courset"));
		listAdresse.add(new Adresse(0, 15, "rue de la vie", 05600, "Ceillac"));
		listAdresse.add(new Adresse(0, 26, "rue de la miage", 59222, "Bousies"));
		listAdresse.add(new Adresse(0, 26, "rue des glacis", 41600, "Vouzon"));
		listAdresse.add(new Adresse(0, 32, "rue de la paix", 57930, "Postroff"));
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
		listEntreprise
				.add(new Entreprise(0, "Menuition", ECorpsMetier.menuisier, "0348745961", null, listAdresse.get(15)));
		listEntreprise
				.add(new Entreprise(0, "Menuitieur", ECorpsMetier.menuisier, "0365874129", null, listAdresse.get(16)));
		listEntreprise
				.add(new Entreprise(0, "Menuimenui", ECorpsMetier.menuisier, "0548963274", null, listAdresse.get(17)));
		listEntreprise.add(new Entreprise(0, "Macron", ECorpsMetier.macon, "0145236987", null, listAdresse.get(18)));
		listEntreprise.add(new Entreprise(0, "Macron", ECorpsMetier.macon, "0145236987", null, listAdresse.get(19)));
		listEntreprise.add(
				new Entreprise(0, "Serre u riait", ECorpsMetier.serrurier, "0148596632", null, listAdresse.get(20)));
		listEntreprise
				.add(new Entreprise(0, "Azerty", ECorpsMetier.serrurier, "0365478921", null, listAdresse.get(21)));
		listEntreprise
				.add(new Entreprise(0, "A couvert", ECorpsMetier.couvreur, "0402840293", null, listAdresse.get(22)));
		listEntreprise
				.add(new Entreprise(0, "Couverture", ECorpsMetier.couvreur, "0234683957", null, listAdresse.get(23)));
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
		setEntreprise1.add(listEntreprise.get(3));
		setEntreprise1.add(listEntreprise.get(12));
		listTerrassement.add(new Terrassement(0, dateDebut1, 4, 150000, "enCours", 200000, null, setEntreprise1,
				listEntreprise.get(3), 200));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(3));
		listTerrassement.add(new Terrassement(0, dateDebut2, 5, 160000, "enCours", 180000, null, setEntreprise2,
				listEntreprise.get(3), 150));

		Set<Entreprise> setEntreprise3 = new HashSet<Entreprise>();
		setEntreprise3.add(listEntreprise.get(12));
		listTerrassement.add(new Terrassement(0, dateDebut3, 2, 140000, "termine", 150000, dateFin3, setEntreprise3,
				listEntreprise.get(12), 130));

		Set<Entreprise> setEntreprise4 = new HashSet<Entreprise>();
		setEntreprise4.add(listEntreprise.get(12));
		setEntreprise4.add(listEntreprise.get(3));
		listTerrassement.add(new Terrassement(0, dateDebut4, 2, 130000, "termine", 120000, dateFin4, setEntreprise4,
				listEntreprise.get(12), 120));

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
		setEntreprise1.add(listEntreprise.get(1));
		setEntreprise1.add(listEntreprise.get(6));
		listDallage.add(new Dallage(0, dateDebut1, 6, 200000, "enCours", 220000, null, setEntreprise1,
				listEntreprise.get(1), 220));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(6));
		setEntreprise2.add(listEntreprise.get(1));
		listDallage.add(new Dallage(0, dateDebut2, 7, 170000, "enCours", 180000, null, setEntreprise2,
				listEntreprise.get(6), 130));

		Set<Entreprise> setEntreprise3 = new HashSet<Entreprise>();
		setEntreprise3.add(listEntreprise.get(1));
		listDallage.add(new Dallage(0, dateDebut3, 2, 200000, "termine", 210000, dateFin3, setEntreprise3,
				listEntreprise.get(1), 170));

		Set<Entreprise> setEntreprise4 = new HashSet<Entreprise>();
		setEntreprise4.add(listEntreprise.get(6));
		listDallage.add(new Dallage(0, dateDebut4, 1, 190000, "termine", 200000, dateFin4, setEntreprise4,
				listEntreprise.get(6), 160));

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
		Date dateDebut3 = new Date(116, 7, 15);
		Date dateDebut4 = new Date(116, 6, 22);

		Date dateFin3 = new Date(116, 8, 5);
		Date dateFin4 = new Date(117, 3, 22);

		ArrayList<Menuiseries> listMenuiseries = new ArrayList<Menuiseries>();

		Set<Entreprise> setEntreprise1 = new HashSet<Entreprise>();
		setEntreprise1.add(listEntreprise.get(9));
		setEntreprise1.add(listEntreprise.get(15));
		listMenuiseries.add(new Menuiseries(0, dateDebut1, 2, 120000, "enCours", 150000, null, setEntreprise1,
				listEntreprise.get(15), 10, 4, 2));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(16));
		listMenuiseries.add(new Menuiseries(0, dateDebut2, 7, 160000, "enCours", 200000, null, setEntreprise2,
				listEntreprise.get(16), 7, 3, 1));

		Set<Entreprise> setEntreprise3 = new HashSet<Entreprise>();
		setEntreprise3.add(listEntreprise.get(17));
		setEntreprise3.add(listEntreprise.get(9));
		listMenuiseries.add(new Menuiseries(0, dateDebut3, 1, 100000, "termine", 100000, dateFin3, setEntreprise3,
				listEntreprise.get(17), 2, 4, 2));

		Set<Entreprise> setEntreprise4 = new HashSet<Entreprise>();
		setEntreprise4.add(listEntreprise.get(17));
		setEntreprise4.add(listEntreprise.get(9));
		setEntreprise4.add(listEntreprise.get(15));
		setEntreprise4.add(listEntreprise.get(16));
		listMenuiseries.add(new Menuiseries(0, dateDebut4, 9, 200000, "termine", 220000, dateFin4, setEntreprise4,
				listEntreprise.get(9), 8, 6, 5));

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

		Date dateFin3 = new Date(117, 11, 25);
		Date dateFin4 = new Date(117, 9, 23);

		ArrayList<Fondation> listFondation = new ArrayList<Fondation>();

		Set<Entreprise> setEntreprise1 = new HashSet<Entreprise>();
		setEntreprise1.add(listEntreprise.get(0));
		setEntreprise1.add(listEntreprise.get(22));
		listFondation.add(new Fondation(0, dateDebut1, 4, 150000, "enCours", 200000, null, setEntreprise1,
				listEntreprise.get(0), 180));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(23));
		listFondation.add(new Fondation(0, dateDebut2, 5, 160000, "enCours", 180000, null, setEntreprise2,
				listEntreprise.get(23), 170));

		Set<Entreprise> setEntreprise3 = new HashSet<Entreprise>();
		setEntreprise3.add(listEntreprise.get(0));
		setEntreprise3.add(listEntreprise.get(23));
		listFondation.add(new Fondation(0, dateDebut3, 5, 170000, "termine", 180000, dateFin3, setEntreprise3,
				listEntreprise.get(0), 180));

		Set<Entreprise> setEntreprise4 = new HashSet<Entreprise>();
		setEntreprise4.add(listEntreprise.get(22));
		setEntreprise4.add(listEntreprise.get(23));
		listFondation.add(new Fondation(0, dateDebut4, 2, 110000, "termine", 120000, dateFin4, setEntreprise4,
				listEntreprise.get(22), 100));

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
		setEntreprise1.add(listEntreprise.get(2));
		setEntreprise1.add(listEntreprise.get(18));
		listMaconnerie.add(new Maconnerie(0, dateDebut1, 10, 300000, "enCours", 300000, null, setEntreprise1,
				listEntreprise.get(2), 300, 7));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(18));
		setEntreprise2.add(listEntreprise.get(2));
		listMaconnerie.add(new Maconnerie(0, dateDebut2, 7, 200000, "enCours", 190000, null, setEntreprise2,
				listEntreprise.get(18), 150, 4));

		Set<Entreprise> setEntreprise3 = new HashSet<Entreprise>();
		setEntreprise3.add(listEntreprise.get(19));
		setEntreprise3.add(listEntreprise.get(18));
		listMaconnerie.add(new Maconnerie(0, dateDebut3, 1, 220000, "termine", 210000, dateFin3, setEntreprise3,
				listEntreprise.get(18), 170, 6));

		Set<Entreprise> setEntreprise4 = new HashSet<Entreprise>();
		setEntreprise4.add(listEntreprise.get(19));
		setEntreprise4.add(listEntreprise.get(18));
		setEntreprise4.add(listEntreprise.get(2));
		listMaconnerie.add(new Maconnerie(0, dateDebut4, 6, 250000, "termine", 260000, dateFin4, setEntreprise4,
				listEntreprise.get(2), 210, 7));

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

		Date dateFin3 = new Date(117, 9, 15);
		Date dateFin4 = new Date(117, 9, 14);

		ArrayList<Platerie> listPlaterie = new ArrayList<Platerie>();

		Set<Entreprise> setEntreprise1 = new HashSet<Entreprise>();
		setEntreprise1.add(listEntreprise.get(7));
		listPlaterie.add(new Platerie(0, dateDebut1, 4, 170000, "enCours", 200000, null, setEntreprise1,
				listEntreprise.get(7), 210, 300));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(7));
		listPlaterie.add(new Platerie(0, dateDebut2, 5, 160000, "enCours", 180000, null, setEntreprise2,
				listEntreprise.get(7), 150, 210));

		Set<Entreprise> setEntreprise3 = new HashSet<Entreprise>();
		setEntreprise3.add(listEntreprise.get(7));
		listPlaterie.add(new Platerie(0, dateDebut3, 1, 60000, "termine", 80000, dateFin3, setEntreprise3,
				listEntreprise.get(7), 50, 70));

		Set<Entreprise> setEntreprise4 = new HashSet<Entreprise>();
		setEntreprise4.add(listEntreprise.get(13));
		listPlaterie.add(new Platerie(0, dateDebut4, 3, 100000, "termine", 100000, dateFin4, setEntreprise4,
				listEntreprise.get(13), 80, 90));

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
		listElectricite.add(new Electricite(0, dateDebut1, 4, 160000, "enCours", 170000, null, setEntreprise1,
				listEntreprise.get(4), 2, 40));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(4));
		listElectricite.add(new Electricite(0, dateDebut2, 5, 160000, "enCours", 170000, null, setEntreprise2,
				listEntreprise.get(4), 3, 20));

		Set<Entreprise> setEntreprise3 = new HashSet<Entreprise>();
		setEntreprise3.add(listEntreprise.get(4));
		setEntreprise3.add(listEntreprise.get(10));
		listElectricite.add(new Electricite(0, dateDebut3, 9, 180000, "termine", 170000, null, setEntreprise3,
				listEntreprise.get(10), 4, 21));

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
		setEntreprise1.add(listEntreprise.get(5));
		setEntreprise1.add(listEntreprise.get(20));
		listReseaux.add(new Reseaux(0, dateDebut1, 4, 160000, "enCours", 160000, null, setEntreprise1,
				listEntreprise.get(5), 200));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(5));
		setEntreprise2.add(listEntreprise.get(20));
		listReseaux.add(new Reseaux(0, dateDebut2, 5, 150000, "enCours", 140000, null, setEntreprise2,
				listEntreprise.get(20), 170));

		Set<Entreprise> setEntreprise3 = new HashSet<Entreprise>();
		setEntreprise3.add(listEntreprise.get(5));
		setEntreprise3.add(listEntreprise.get(21));
		listReseaux.add(new Reseaux(0, dateDebut3, 1, 100000, "termine", 110000, dateFin3, setEntreprise3,
				listEntreprise.get(21), 100));

		Set<Entreprise> setEntreprise4 = new HashSet<Entreprise>();
		setEntreprise4.add(listEntreprise.get(5));
		listReseaux.add(new Reseaux(0, dateDebut4, 1, 110000, "termine", 110000, dateFin4, setEntreprise4,
				listEntreprise.get(5), 110));

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
		setEntreprise1.add(listEntreprise.get(8));
		listPeinture.add(new Peinture(0, dateDebut1, 4, 180000, "enCours", 190000, null, setEntreprise1,
				listEntreprise.get(8), 200));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(8));
		setEntreprise2.add(listEntreprise.get(14));
		listPeinture.add(new Peinture(0, dateDebut2, 5, 160000, "enCours", 160000, null, setEntreprise2,
				listEntreprise.get(14), 170));

		Set<Entreprise> setEntreprise3 = new HashSet<Entreprise>();
		setEntreprise3.add(listEntreprise.get(8));
		setEntreprise3.add(listEntreprise.get(14));
		listPeinture.add(new Peinture(0, dateDebut3, 5, 150000, "enCours", 160000, dateFin3, setEntreprise3,
				listEntreprise.get(14), 160));

		Set<Entreprise> setEntreprise4 = new HashSet<Entreprise>();
		setEntreprise4.add(listEntreprise.get(8));
		setEntreprise4.add(listEntreprise.get(14));
		listPeinture.add(new Peinture(0, dateDebut4, 5, 180000, "enCours", 170000, dateFin4, setEntreprise4,
				listEntreprise.get(8), 190));

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

		Date dateFin3 = new Date(117, 10, 12);
		Date dateFin4 = new Date(117, 10, 25);

		ArrayList<Charpente> listCharpente = new ArrayList<Charpente>();

		Set<Entreprise> setEntreprise1 = new HashSet<Entreprise>();
		setEntreprise1.add(listEntreprise.get(11));
		listCharpente.add(new Charpente(0, dateDebut1, 4, 110000, "enCours", 120000, null, setEntreprise1,
				listEntreprise.get(11), ECharpente.traditionnelle));

		Set<Entreprise> setEntreprise2 = new HashSet<Entreprise>();
		setEntreprise2.add(listEntreprise.get(11));
		listCharpente.add(new Charpente(0, dateDebut2, 5, 90000, "enCours", 100000, null, setEntreprise2,
				listEntreprise.get(11), ECharpente.toitPlat));

		Set<Entreprise> setEntreprise3 = new HashSet<Entreprise>();
		setEntreprise3.add(listEntreprise.get(11));
		listCharpente.add(new Charpente(0, dateDebut3, 1, 70000, "termine", 80000, dateFin3, setEntreprise3,
				listEntreprise.get(11), ECharpente.fermette));

		Set<Entreprise> setEntreprise4 = new HashSet<Entreprise>();
		setEntreprise4.add(listEntreprise.get(11));
		listCharpente.add(new Charpente(0, dateDebut4, 2, 100000, "termine", 100000, dateFin4, setEntreprise4,
				listEntreprise.get(11), ECharpente.traditionnelle));

		Iterator<Charpente> iterator = listCharpente.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
		}
		return listCharpente;
	}

	public static void projetsTermines(EntityManagerFactory emf, EntityManager em, ArrayList<Adresse> listAdresse,
			ArrayList<Appartement> listAppartement, ArrayList<Terrassement> listTerrassement,
			ArrayList<Dallage> listDallage, ArrayList<Menuiseries> listMenuiseries, ArrayList<Acteur> listActeur,
			ArrayList<Fondation> listFondation, ArrayList<Maconnerie> listMaconnerie, ArrayList<Platerie> listPlaterie,
			ArrayList<Electricite> listElectricite, ArrayList<Reseaux> listReseaux, ArrayList<Peinture> listPeinture,
			ArrayList<Charpente> listCharpente) {
		lotissementTermine();
		immeubleTermine();
		hopitalTermine();
		maisonTermine();
	}

	public static void lotissementTermine() {

	}

	public static void immeubleTermine() {
		
	}

	public static void hopitalTermine() {

	}

	public static void maisonTermine() {

	}

	public static void projetsEnCours(EntityManagerFactory emf, EntityManager em, ArrayList<Adresse> listAdresse,
			ArrayList<Appartement> listAppartement, ArrayList<Terrassement> listTerrassement,
			ArrayList<Dallage> listDallage, ArrayList<Menuiseries> listMenuiseries, ArrayList<Acteur> listActeur,
			ArrayList<Fondation> listFondation, ArrayList<Maconnerie> listMaconnerie, ArrayList<Platerie> listPlaterie,
			ArrayList<Electricite> listElectricite, ArrayList<Reseaux> listReseaux, ArrayList<Peinture> listPeinture,
			ArrayList<Charpente> listCharpente) {
		etablissementScolaireEnCours(emf, em, listAdresse);
		immeubleEnCours(emf, em, listAdresse, listAppartement, listTerrassement, listDallage, listMenuiseries,
				listFondation);
		museeEnCours(emf, em, listAdresse, listActeur, listFondation, listMaconnerie, listPlaterie, listElectricite,
				listReseaux, listPeinture);
	}

	private static void museeEnCours(EntityManagerFactory emf, EntityManager em, ArrayList<Adresse> listAdresse,
			ArrayList<Acteur> listActeur, ArrayList<Fondation> listFondation, ArrayList<Maconnerie> listMaconnerie,
			ArrayList<Platerie> listPlaterie, ArrayList<Electricite> listElectricite, ArrayList<Reseaux> listReseaux,
			ArrayList<Peinture> listPeinture) {
		Date dateFin = new Date(118, 2, 25);

		Set<Acteur> setActeur = new HashSet<Acteur>();
		setActeur.add(listActeur.get(70));
		setActeur.add(listActeur.get(27));
		setActeur.add(listActeur.get(2));
		setActeur.add(listActeur.get(9));
		setActeur.add(listActeur.get(18));
		setActeur.add(listActeur.get(46));
		setActeur.add(listActeur.get(22));
		setActeur.add(listActeur.get(36));
		setActeur.add(listActeur.get(19));
		setActeur.add(listActeur.get(29));
		setActeur.add(listActeur.get(20));
		setActeur.add(listActeur.get(32));
		setActeur.add(listActeur.get(46));
		setActeur.add(listActeur.get(23));
		setActeur.add(listActeur.get(38));

		Set<Lot> setLot = new HashSet<Lot>();
		setLot.add(listFondation.get(1));
		setLot.add(listMaconnerie.get(0));
		setLot.add(listMaconnerie.get(1));
		setLot.add(listPlaterie.get(0));
		setLot.add(listPlaterie.get(1));
		setLot.add(listElectricite.get(0));
		setLot.add(listElectricite.get(1));
		setLot.add(listReseaux.get(0));
		setLot.add(listReseaux.get(1));
		setLot.add(listPeinture.get(0));

		Musee projetMusee = new Musee(0, "transformation", 789, "enCours", dateFin, 1456000, false, null, setActeur,
				listAdresse.get(2), setLot, "culture", 18);

		em.getTransaction().begin();
		em.persist(projetMusee);
		em.getTransaction().commit();

		ArrayList<Acteur> arrayListActeur = new ArrayList<Acteur>(setActeur);
		for (int i = 0; i < arrayListActeur.size(); i++) {
			em.getTransaction().begin();
			Acteur acteur = em.find(Acteur.class, arrayListActeur.get(i).getNom());
			Set<Projet> setProjet = new HashSet<Projet>(acteur.getParticipe());
			setProjet.add(projetMusee);
			acteur.setParticipe(setProjet);
			em.getTransaction().commit();
		}
	}

	private static void immeubleEnCours(EntityManagerFactory emf, EntityManager em, ArrayList<Adresse> listAdresse,
			ArrayList<Appartement> listAppartement, ArrayList<Terrassement> listTerrassement,
			ArrayList<Dallage> listDallage, ArrayList<Menuiseries> listMenuiseries,
			ArrayList<Fondation> listFondation) {
		Date dateFin = new Date(118, 8, 10);

		Set<Lot> setLot = new HashSet<Lot>();
		setLot.add(listTerrassement.get(0));
		setLot.add(listTerrassement.get(1));
		setLot.add(listDallage.get(0));
		setLot.add(listDallage.get(1));
		setLot.add(listMenuiseries.get(0));
		setLot.add(listMenuiseries.get(1));
		setLot.add(listFondation.get(0));

		Set<Appartement> setAppartement = new HashSet<Appartement>();
		for (int i = 0; i < 8; i++)
			setAppartement.add(listAppartement.get(i));

		Immeuble projetImmeuble = new Immeuble(0, "renovation", 435, "enCours", dateFin, 628000, false, null, null,
				listAdresse.get(1), setLot, 5, setAppartement);
		em.getTransaction().begin();
		em.persist(projetImmeuble);
		em.getTransaction().commit();
	}

	private static void etablissementScolaireEnCours(EntityManagerFactory emf, EntityManager em,
			ArrayList<Adresse> listAdresse) {
		Date dateFin = new Date(118, 6, 10);

		EtablissementScolaire projetEtaScol = new EtablissementScolaire(0, "restructuration", 540, "enCours", dateFin,
				500000, false, null, null, listAdresse.get(0), null, "education", 348, EEtaScolaire.lycee);
		em.getTransaction().begin();
		em.persist(projetEtaScol);
		em.getTransaction().commit();
	}
}
