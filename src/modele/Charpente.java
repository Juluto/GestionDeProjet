package modele;

import java.util.Date;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import enumeration.ECharpente;

@Entity
@DiscriminatorValue("CHARPENTE")
public class Charpente extends Lot {
	private ECharpente typeCharpente;

	public Charpente(int numero, Date dateDebut, int dureeEstimee, int coutEstime, String avancement, int coutReel,
			Date dateFinReel, Set<Entreprise> realise, Entreprise responsable, ECharpente typeCharpente) {
		super(numero, dateDebut, dureeEstimee, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		this.typeCharpente = typeCharpente;
	}

	public Charpente() {
		super();
	}

	public ECharpente getTypeCharpente() {
		return typeCharpente;
	}

	public void setTypeCharpente(ECharpente typeCharpente) {
		this.typeCharpente = typeCharpente;
	}
	
	
}