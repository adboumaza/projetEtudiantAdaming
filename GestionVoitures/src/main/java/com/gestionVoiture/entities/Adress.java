package com.gestionVoiture.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*Auteur:Boumaza Adel
 * nom Projet:titainc
 *date:25/04/2016
 *Package:com.gestionVoiture.entities
 *Class:Adress.
 *version:1.
 *ref-UML:1
 *sprint:1
 *ref-userStories:15f21.
 *association:
 * 
 * */
@Entity
public class Adress {
	/* attributes */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAdress;
	private String rue;
	private int codePostal;
	/* getEtSet */
	public Long getIdAdress() {
		return idAdress;
	}
	public void setIdAdress(Long idAdress) {
		this.idAdress = idAdress;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	/* constructors */
	public Adress() {
		// TODO Auto-generated constructor stub
	}
	public Adress(String rue, int codePostal) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
	}
	
}
