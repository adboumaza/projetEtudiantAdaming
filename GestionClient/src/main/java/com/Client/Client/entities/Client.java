package com.Client.Client.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
/*
 * Auteur:boumaza adel
 * Date:24/04/2016
 * class:Client
 * package:com.Client.Client.entities
 * Version:01;
 * ref-uml:1;
 * sprint:1;
 * ref-userStories:2;
 * association:List<Voitures>,Adress.
 * */
@Entity
public class Client {
    /***********************Adtributes***************************/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClient;
	private String nomClient;
	private String prenomClient;
	private int age;
	
	/* Commentaire inséré par Lory.... */
	
	/************association*************************************/
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="Voiture_Client")
	private List<Voiture> voitures=new ArrayList<Voiture>();
	@ManyToOne
	@JoinColumn(name="IdAdress")
	private Adress adress;
	/************gettersandSetters*******************************/
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Voiture> getVoitures() {
		return voitures;
	}
	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}

	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	/************Contructeures***********************************/
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public Client(String nomClient, String prenomClient, int age) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.age = age;
	}
	
	
}
