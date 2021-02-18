package com.sid.communeback.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pays {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomPays;
	
	@OneToMany(mappedBy = "pays")
	private Collection<Commune> communes = new ArrayList<Commune>();
	
	@OneToMany(mappedBy = "pays")
	private Collection<Etablissements> etablissements=new ArrayList<Etablissements>();
	
	
	@JsonIgnore
	public Collection<Etablissements> getEtablissements() {
		return etablissements;
	}
	public void setEtablissements(Collection<Etablissements> etablissements) {
		this.etablissements = etablissements;
	}
	@JsonIgnore
	public Collection<Commune> getCommunes() {
		return communes;
	}
	public void setCommunes(Collection<Commune> communes) {
		this.communes = communes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	
	public Pays(String nomPays) {
		super();
		this.nomPays = nomPays;
	}
	
	public Pays() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
