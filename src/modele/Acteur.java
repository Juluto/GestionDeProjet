package modele;

import java.util.Vector;

import enumeration.EStatut;
import enumeration.ETitre;

public class Acteur {
	private Object nom;
	private ETitre titre;
	private EStatut statut;
	public Entreprise unnamed_Entreprise_;
	public Vector<Projet> participe = new Vector<Projet>();
}