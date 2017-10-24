package modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("BATIMENTPUBLIC")
public abstract class BatimentPublic extends Projet {
	private String ministere;

	public BatimentPublic(String ministere) {
		super();
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