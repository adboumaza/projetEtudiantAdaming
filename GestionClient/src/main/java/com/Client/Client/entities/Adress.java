package com.Client.Client.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Auteur:boumaza adel
 * Date:24/04/2016
 * class:Adress
 * package:com.Client.Client.entities
 * Version:01;
 * ref-uml:3;
 * sprint:1;
 * ref-userStories:3;
 * association:
 * */
@Entity
public class Adress {
	
    /***********************Adtributes***************************/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAdress;
	private String rue;
	private int codePostal;
	/************gettersandSetters*******************************/
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
	/************Contructeures***********************************/
	public Adress(String rue, int codePostal) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
	}
	public Adress() {
		// TODO Auto-generated constructor stub
	}
}
