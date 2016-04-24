package com.Client.Client.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/*
 * Auteur:boumaza adel
 * Date:24/04/2016
 * class:Voiture
 * package:com.Client.Client.entities
 * Version:01;
 * ref-uml:2;
 * sprint:1;
 * ref-userStories:3;
 * association:List<Clients>
 * */
@Entity
public class Voiture {
	/***********************Adtributes***************************/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVoiture;
	private String nomVoiture;
	/************association*************************************/
	@ManyToMany(mappedBy="voitures")
	private List<Client> clients= new ArrayList<Client>();
	/************gettersandSetters*******************************/
	public Long getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}
	public String getNomVoiture() {
		return nomVoiture;
	}
	public void setNomVoiture(String nomVoiture) {
		this.nomVoiture = nomVoiture;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	/************Contructeures***********************************/
	public Voiture() {
		// TODO Auto-generated constructor stub
	}
	public Voiture(String nomVoiture) {
		super();
		this.nomVoiture = nomVoiture;
	}
	
}
