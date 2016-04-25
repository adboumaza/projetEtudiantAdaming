package com.gestionVoiture.ClientMetier;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.gestionVoiture.ClientDao.IClientDao;
import com.gestionVoiture.entities.Client;
@Transactional
public class ClientMetierImpl implements IclientMetier {
    private final Logger LOG=Logger.getLogger("ClientMetierImpl");
	
    private IClientDao dao;
	
	public void setDao(IClientDao dao) {
		this.dao = dao;
		LOG.info("dao client injected");
	}

	@Override
	public Client addClient(Client c) {
		// TODO Auto-generated method stub
		return dao.addClient(c);
	}

	@Override
	public void updateClient(Client c) {
		dao.updateClient(c);
	}

	@Override
	public void deleteClient(Long idClient) {
		dao.deleteClient(idClient);
	}

	@Override
	public Client getClient(Long idClient) {
		// TODO Auto-generated method stub
		return dao.getClient(idClient);
	}

	@Override
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return dao.getClients();
	}

	@Override
	public List<Client> getClientParMc(String mc) {
		// TODO Auto-generated method stub
		return dao.getClientParMc(mc);
	}

	@Override
	public Client addClient(Client c, Long idAdress) {
		// TODO Auto-generated method stub
		return dao.addClient(c, idAdress);
	}

	@Override
	public void addClientToVoiture(Long idVoiture, Long idClient) {
		dao.addClientToVoiture(idVoiture, idClient);
	}

}
