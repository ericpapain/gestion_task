package com.example.demo.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;
import org.springframework.*;

@Entity
public class Tache implements Serializable{
	@Id
	private String idTache;
	private String nomTache;
	private String desciptionTache;
	private Date dateDebut;
	private Date dateFin;
	private String etatTache;
	
	@ManyToOne
	@JoinColumn(name="CODE_CLIENT")
	private Menbre menbre;
	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdTache() {
		return idTache;
	}

	public void setIdTache(String idTache) {
		this.idTache = idTache;
	}

	public String getNomTache() {
		return nomTache;
	}

	public Tache(String idTache, String nomTache, String desciptionTache, Date dateDebut, Date dateFin,
			String etatTache, Menbre menbre) {
		super();
		this.idTache = idTache;
		this.nomTache = nomTache;
		this.desciptionTache = desciptionTache;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.etatTache = etatTache;
		this.menbre = menbre;
	}

	public Menbre getMenbre() {
		return menbre;
	}

	public void setMenbre(Menbre menbre) {
		this.menbre = menbre;
	}

	public void setNomTache(String nomTache) {
		this.nomTache = nomTache;
	}

	public String getDesciptionTache() {
		return desciptionTache;
	}

	public void setDesciptionTache(String desciptionTache) {
		this.desciptionTache = desciptionTache;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getEtatTache() {
		return etatTache;
	}

	public void setEtatTache(String etatTache) {
		this.etatTache = etatTache;
	}
	
	
}
