package com.gestionVoiture.entities;

import java.io.Serializable;
import java.util.ArrayList;
/*Auteur:Boumaza Adel
 * nom Projet:titainc
 *date:25/04/2016
 *Package:com.gestionVoiture.entities
 *Class:Client.
 *version:1.
 *ref-UML:1
 *sprint:1
 *ref-userStories:15f21.
 *association:List<Voiture>,Adress
 * 
 * */
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
@Entity
public class Client implements Serializable {
	/* attributes */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClient;
	private String nomClient;
	private String prenomClient;
	private int ageClient;
	/* association */
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="Client_Voiture")
	private List<Voiture> voitures = new ArrayList<Voiture>();
	@ManyToOne
	@JoinColumn(name="Id_Adress")
	private Adress adress;

	/* getEtSet */
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

	public int getAgeClient() {
		return ageClient;
	}

	public void setAgeClient(int ageClient) {
		this.ageClient = ageClient;
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

	/* constructors */
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String nomClient, String prenomClient, int ageClient) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.ageClient = ageClient;
	}

}
