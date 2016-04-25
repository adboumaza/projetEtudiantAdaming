package com.gestionVoiture.VoitureDAO;

import com.gestionVoiture.entities.Voiture;

public interface IVoitureDao {
	
	public Voiture addVoiture(Voiture v);
	public void updateVoiture (Voiture v);
	public void deleteVoiture (Long idVoiture);
	public Voiture getVoiture (Long idVoiture);
	

}
