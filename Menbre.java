package com.example.demo.Entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Menbre implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMenbre;
	private String nomMenbre;
	private String prenomMenbre;
	private String adresseMenbre;
	private int telefoneMenbre;
	private String emailMenbre;
	private String RoleMenbre;
	
	@OneToMany(mappedBy="menbre",fetch=FetchType.LAZY)
	private Collection<Tache> listTaches;
	
	
	public Collection<Tache> getListTaches() {
		return listTaches;
	}
	public void setListTaches(Collection<Tache> listTaches) {
		this.listTaches = listTaches;
	}
	public Menbre(String nomMenbre, String prenomMenbre, String adresseMenbre, int telefoneMenbre, String emailMenbre,
			String roleMenbre) {
		super();
		this.nomMenbre = nomMenbre;
		this.prenomMenbre = prenomMenbre;
		this.adresseMenbre = adresseMenbre;
		this.telefoneMenbre = telefoneMenbre;
		this.emailMenbre = emailMenbre;
		RoleMenbre = roleMenbre;
	}
	public Menbre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdMenbre() {
		return idMenbre;
	}
	public void setIdMenbre(int idMenbre) {
		this.idMenbre = idMenbre;
	}
	public String getNomMenbre() {
		return nomMenbre;
	}
	public void setNomMenbre(String nomMenbre) {
		this.nomMenbre = nomMenbre;
	}
	public String getPrenomMenbre() {
		return prenomMenbre;
	}
	public void setPrenomMenbre(String prenomMenbre) {
		this.prenomMenbre = prenomMenbre;
	}
	public String getAdresseMenbre() {
		return adresseMenbre;
	}
	public void setAdresseMenbre(String adresseMenbre) {
		this.adresseMenbre = adresseMenbre;
	}
	public int getTelefoneMenbre() {
		return telefoneMenbre;
	}
	public void setTelefoneMenbre(int telefoneMenbre) {
		this.telefoneMenbre = telefoneMenbre;
	}
	public String getEmailMenbre() {
		return emailMenbre;
	}
	public void setEmailMenbre(String emailMenbre) {
		this.emailMenbre = emailMenbre;
	}
	public String getRoleMenbre() {
		return RoleMenbre;
	}
	public void setRoleMenbre(String roleMenbre) {
		RoleMenbre = roleMenbre;
	}

}
