package vue;

import java.util.Vector;

public class Projet {
	private Object refProjet;
	private Object nom;
	private Object surfaceTotal;
	private Object avancement;
	private Object dateFinEstimee;
	private Object coutTotalEstime;
	private boolean termine;
	private Object dateFinReelle;
	public Vector<Acteur> participe = new Vector<Acteur>();
	public Adresse localisation;
	public Vector<Lot> est_découpé_en = new Vector<Lot>();
}