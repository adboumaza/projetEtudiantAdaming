package com.gestionVoiture.ClientDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionVoiture.entities.Adress;
import com.gestionVoiture.entities.Client;
import com.gestionVoiture.entities.Voiture;

public class ClientDaoImpl implements IClientDao {
	@PersistenceContext
    private EntityManager em;
	@Override
	public Client addClient(Client c) {
		em.persist(c);
		return c;
	}

	@Override
	public void updateClient(Client c) {
		em.merge(c);
	}

	@Override
	public void deleteClient(Long idClient) {
		Client c=em.find(Client.class,idClient);
		em.remove(c);
	}

	@Override
	public Client getClient(Long idClient) {
		Client c=em.find(Client.class,idClient);
		return c;
	}

	@Override
	public List<Client> getClients() {
		Query query=em.createQuery("from Client");
		return query.getResultList();
	}

	@Override
	public List<Client> getClientParMc(String mc) {
		Query query=em.createQuery("from Client c where c.nomClient like :X");
		query.setParameter("x","%"+mc+"%");
		return query.getResultList();
	}

	@Override
	public Client addClient(Client c, Long idAdress) {
		Adress a=em.find(Adress.class,idAdress);
		c.setAdress(a);
		em.persist(c);
		return c;
	}//kfhjfhf

	@Override
	public void addClientToVoiture(Long idVoiture, Long idClient) {
		Voiture v=em.find(Voiture.class,idVoiture);
		Client c=em.find(Client.class,idClient);
		c.getVoitures().add(v);
		v.getClients().add(c);
	}

}
