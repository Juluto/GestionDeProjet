package vue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import controleur.JeuDEssai;
import controleur.Requete;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CONCEPTIONCONSTRUCTION");
		EntityManager em = emf.createEntityManager();
		JeuDEssai.jeuDEssai(emf, em);
		Requete.requete(emf, em);
		em.close();
		emf.close();
	}

}
