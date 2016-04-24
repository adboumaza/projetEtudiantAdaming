package com.Client.Voiture.Dao;

import java.util.List;

import com.Client.Client.entities.Voiture;

public interface IvoitureDao {

	public void addVoiture(Voiture v);
	public List<Voiture> getvoitures();
}
