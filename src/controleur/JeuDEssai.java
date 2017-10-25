package controleur;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import enumeration.ECorpsMetier;
import enumeration.EStatut;
import enumeration.ETitre;
import enumeration.ETypeAppart;
import modele.Acteur;
import modele.Adresse;
import modele.Appartement;
import modele.Entreprise;

public class JeuDEssai {
	
	public static void jeuDEssai(EntityManagerFactory emf, EntityManager em) {
		ArrayList<Adresse> listAdresse = jeuAdresse(emf, em);
		ArrayList<Entreprise> listEntreprise = jeuEntreprise(emf, em, listAdresse);
		ArrayList<Acteur> listActeur = jeuActeur(emf, em, listEntreprise);
		ArrayList<Appartement> listAppartement = jeuAppartement(emf, em);
	}
	
	public static ArrayList<Acteur> jeuActeur(EntityManagerFactory emf, EntityManager em, ArrayList<Entreprise> listEntreprise) {
		ArrayList<Acteur> listActeur = new ArrayList<Acteur>();
		listActeur.add(new Acteur("actArchi1", ETitre.architecte, EStatut.BIM_Manager, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actArchi2", ETitre.architecte, EStatut.chef_d_equipe, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actArchi3", ETitre.architecte, EStatut.directeur, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actArchi4", ETitre.architecte, EStatut.responsable, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actArchi5", ETitre.architecte, EStatut.employe, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actDocteur1", ETitre.docteur, EStatut.chef_d_equipe, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actDocteur2", ETitre.docteur, EStatut.responsable, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actIng1", ETitre.ingenieur, EStatut.BIM_Manager, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actIng2", ETitre.ingenieur, EStatut.employe, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actIng3", ETitre.ingenieur, EStatut.employe, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actIng4", ETitre.ingenieur, EStatut.responsable, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actTech1", ETitre.technicien, EStatut.chef_d_equipe, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actTech2", ETitre.technicien, EStatut.employe, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actTech3", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(0), null));
		listActeur.add(new Acteur("actTech4", ETitre.technicien, EStatut.ouvrier, listEntreprise.get(0), null));
		Set<Acteur> set = new HashSet<Acteur>(listActeur);
		em.getTransaction().begin();
		Entreprise entreprise = em.find(Entreprise.class, 1);
		entreprise.setActeur(set);
		em.getTransaction().commit();
		Iterator<Acteur> iterator = listActeur.listIterator();
		while (iterator.hasNext()) {
			em.getTransaction().begin();
			em.persist(iterator.next());
			em.getTransaction().commit();
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
	
	public static ArrayList<Entreprise> jeuEntreprise(EntityManagerFactory emf, EntityManager em, ArrayList<Adresse> listAdresse) {
		ArrayList<Entreprise> listEntreprise = new ArrayList<Entreprise>();
		listEntreprise.add(new Entreprise(0, "Blizzard", ECorpsMetier.couvreur, "0123456789", null, listAdresse.get(12)));
		listEntreprise.add(new Entreprise(0, "Cave a Vin", ECorpsMetier.plombier, "0385410267", null, listAdresse.get(1)));
		listEntreprise.add(new Entreprise(0, "Artem", ECorpsMetier.macon, "0214960248", null, listAdresse.get(2)));
		listEntreprise.add(new Entreprise(0, "Carrefour", ECorpsMetier.carreleur, "0348961752", null, listAdresse.get(3)));
		listEntreprise.add(new Entreprise(0, "Electrodrole", ECorpsMetier.electricien, "0321478569", null, listAdresse.get(4)));
		listEntreprise.add(new Entreprise(0, "Serre a Rien", ECorpsMetier.serrurier, "0287459632", null, listAdresse.get(5)));
		listEntreprise.add(new Entreprise(0, "Mario et Luigi", ECorpsMetier.plombier, "0149632578", null, listAdresse.get(6)));
		listEntreprise.add(new Entreprise(0, "Platre", ECorpsMetier.platrier, "0125479635", null, listAdresse.get(7)));
		listEntreprise.add(new Entreprise(0, "Peinturier", ECorpsMetier.peintre, "0458963784", null, listAdresse.get(8)));
		listEntreprise.add(new Entreprise(0, "Menuisieur", ECorpsMetier.menuisier, "0548963274", null, listAdresse.get(9)));
		listEntreprise.add(new Entreprise(0, "Electrichien", ECorpsMetier.electricien, "0478246395", null, listAdresse.get(10)));
		listEntreprise.add(new Entreprise(0, "Portuguese", ECorpsMetier.charpentier, "0148523796", null, listAdresse.get(11)));
		listEntreprise.add(new Entreprise(0, "Car l'heure", ECorpsMetier.carreleur, "0245896324", null, listAdresse.get(13)));
		listEntreprise.add(new Entreprise(0, "Platre riait", ECorpsMetier.platrier, "0247896324", null, listAdresse.get(0)));
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
	
	
	public void  ProjetsEnCours() {
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
