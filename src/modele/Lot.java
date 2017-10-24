package modele;

import java.util.Vector;

public class Lot {
	private Object numero;
	private Object dateDebut;
	private Object dureeEstimee;
	private Object coutEstime;
	private Object avancement;
	private Object coutReel;
	private Object dateFinReel;
	public Vector<Entreprise> realise = new Vector<Entreprise>();
	public Entreprise responsable;
}