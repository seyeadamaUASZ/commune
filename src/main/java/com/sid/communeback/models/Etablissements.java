package com.sid.communeback.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Etablissements {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomCommercial;
	private String numsiret;
	private String typeetablissement;
	private String categorie;
	private String raison;
	
	@ManyToOne
	@JoinColumn(name="pays")
	private Pays pays;
	
	
	
	public Pays getPays() {
		return pays;
	}
	public void setPays(Pays pays) {
		this.pays = pays;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomCommercial() {
		return nomCommercial;
	}
	public void setNomCommercial(String nomCommercial) {
		this.nomCommercial = nomCommercial;
	}
	public String getNumsiret() {
		return numsiret;
	}
	public void setNumsiret(String numsiret) {
		this.numsiret = numsiret;
	}
	public String getTypeetablissement() {
		return typeetablissement;
	}
	public void setTypeetablissement(String typeetablissement) {
		this.typeetablissement = typeetablissement;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getRaison() {
		return raison;
	}
	public void setRaison(String raison) {
		this.raison = raison;
	}
	
	public Etablissements(String nomCommercial, String numsiret, String typeetablissement, String categorie,
			String raison) {
		super();
		this.nomCommercial = nomCommercial;
		this.numsiret = numsiret;
		this.typeetablissement = typeetablissement;
		this.categorie = categorie;
		this.raison = raison;
	}
	public Etablissements() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
