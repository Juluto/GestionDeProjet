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
