package com.Client.Voiture.Metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.Client.Client.entities.Voiture;
import com.Client.Voiture.Dao.IvoitureDao;
@Transactional
public class VoitureMetierImpl implements IvoitureMetier {
   
	private IvoitureDao dao;
	
	public void setDao(IvoitureDao dao) {
		this.dao = dao;
	}

	@Override
	public void addVoiture(Voiture v) {
	dao.addVoiture(v);
	}

	@Override
	public List<Voiture> getvoitures() {
		// TODO Auto-generated method stub
		return dao.getvoitures();
	}

}
