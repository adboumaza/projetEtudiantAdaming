package com.Client.Voiture.Metier;

import java.util.List;

import com.Client.Client.entities.Voiture;

public interface IvoitureMetier {
	public void addVoiture(Voiture v);
	public List<Voiture> getvoitures();
}
