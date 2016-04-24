package com.Client.Voiture.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.Client.Client.entities.Voiture;

public class VoitureDaoImpl implements IvoitureDao {
    @PersistenceContext
	private EntityManager em;
	@Override
	public void addVoiture(Voiture v) {
		em.persist(v);
	}

	@Override
	public List<Voiture> getvoitures() {
		Query query=em.createQuery("from Voiture v");
		return query.getResultList();
	}

}
