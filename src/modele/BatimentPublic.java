package modele;

import java.util.Date;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("BATIMENTPUBLIC")
public abstract class BatimentPublic extends Projet {
	private String ministere;

	public BatimentPublic(int refProjet, String nom, int surfaceTotal, String avancement, Date dateFinEstimee,
			int coutTotalEstime, boolean termine, Date dateFinReelle, Set<Acteur> participe, Adresse localisation,
			Set<Lot> est_decoupe_en, String ministere) {
		super(refProjet, nom, surfaceTotal, avancement, dateFinEstimee, coutTotalEstime, termine, dateFinReelle,
				participe, localisation, est_decoupe_en);
		this.ministere = ministere;
	}

	public BatimentPublic() {
		super();
	}

	public String getMinistere() {
		return ministere;
	}

	public void setMinistere(String ministere) {
		this.ministere = ministere;
	}
	
	
}