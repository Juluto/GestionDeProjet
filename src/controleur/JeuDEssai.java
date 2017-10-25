package controleur;

import java.util.ArrayList;
import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import modele.Adresse;

public class JeuDEssai {
	
	public static void jeuDEssai(EntityManagerFactory emf, EntityManager em) {
		jeuAdresse(emf, em);
	}
	
	public void jeuActeur() {
		
	}

	public static void jeuAdresse(EntityManagerFactory emf, EntityManager em) {
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
		em.close();
		emf.close();
	}
	
	public void jeuEntreprise() {
		
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
