package modele;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresse implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int numero;
	private String rue;
	private int cP;
	private String ville;
	
	public Adresse(int id, int numero, String rue, int cP, String ville) {
		super();
		this.id = id;
		this.numero = numero;
		this.rue = rue;
		this.cP = cP;
		this.ville = ville;
	}
	
	public Adresse() {
		super();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getRue() {
		return rue;
	}
	
	public void setRue(String rue) {
		this.rue = rue;
	}
	
	public int getcP() {
		return cP;
	}
	
	public void setcP(int cP) {
		this.cP = cP;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
}