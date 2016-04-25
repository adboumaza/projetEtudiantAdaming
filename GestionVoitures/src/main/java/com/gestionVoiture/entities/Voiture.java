package com.gestionVoiture.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/*Auteur:Boumaza Adel
 * nom Projet:titainc
 *date:25/04/2016
 *Package:com.gestionVoiture.entities
 *Class:Voiture.
 *version:1.
 *ref-UML:1
 *sprint:1
 *ref-userStories:15f21.
 *association:List<Client>
 * 
 * */
@Entity
public class Voiture implements Serializable {
	/* attributes */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVoiture;
	private String marqueVoiture;
	/* association */
	@ManyToMany(mappedBy="voitures")
	private List<Client> clients= new ArrayList<Client>();
	/* getEtSet */
	public Long getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}
	public String getMarqueVoiture() {
		return marqueVoiture;
	}
	public void setMarqueVoiture(String marqueVoiture) {
		this.marqueVoiture = marqueVoiture;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	/* constructors */
	public Voiture() {
		// TODO Auto-generated constructor stub
	}
	public Voiture(String marqueVoiture) {
		super();
		this.marqueVoiture = marqueVoiture;
	}
}
