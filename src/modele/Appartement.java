package modele;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import enumeration.ETypeAppart;

@Entity
public class Appartement implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int niveau;
	private int surface;
	private ETypeAppart type;
	
	public Appartement(int id, int niveau, int surface, ETypeAppart type) {
		super();
		this.id = id;
		this.niveau = niveau;
		this.surface = surface;
		this.type = type;
	}
	
	public Appartement() {
		super();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNiveau() {
		return niveau;
	}
	
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	public int getSurface() {
		return surface;
	}
	
	public void setSurface(int surface) {
		this.surface = surface;
	}
	
	public ETypeAppart getType() {
		return type;
	}
	
	public void setType(ETypeAppart type) {
		this.type = type;
	}
	
	
}