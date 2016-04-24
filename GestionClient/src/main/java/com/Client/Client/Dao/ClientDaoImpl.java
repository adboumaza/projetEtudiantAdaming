package com.Client.Client.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.Client.Client.entities.Adress;
import com.Client.Client.entities.Client;
import com.Client.Client.entities.Voiture;

public class ClientDaoImpl implements IclientDao {
	@PersistenceContext
    private EntityManager em;
	@Override
	public void addClient(Client c, Long idAdress) {
		Adress a=em.find(Adress.class,idAdress);
		c.setAdress(a);
		em.persist(a);
	}

	@Override
	public void deleteClient(Long idClient) {
		Client c=em.find(Client.class,idClient);
		em.remove(c);
	}

	@Override
	public void updateClient(Client c) {
		em.merge(c);
	}

	@Override
	public List<Client> getClients() {
		Query query=em.createQuery("from Client c");
		return query.getResultList();
	}

	@Override
	public List<Client> getClientsParMc(String mc) {
		Query query=em.createQuery("from Client c where c.nomClient like :x");
		query.setParameter("x","%"+mc+"%");
		return query.getResultList();
	}

	@Override
	public void addClientToVoiture(Long idVoiture, Long idClient) {
		Client c=em.find(Client.class,idClient);
		Voiture v=em.find(Voiture.class,idVoiture);
		c.getVoitures().add(v);
		v.getClients().add(c);
	}

	@Override
	public void addClient(Client c) {
		em.persist(c);
	}

	@Override
	public Client getClient(Long idClient) {
		Client c=em.find(Client.class,idClient);
		return c;
	}

}
