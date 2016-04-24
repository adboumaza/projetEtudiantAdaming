package com.Client.Client.Metier;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.Client.Client.Dao.IclientDao;
import com.Client.Client.entities.Client;
@Transactional
public class ClientMetierImpl implements IclientMetier{
    private final Logger LOG=Logger.getLogger("ClientMetierImpl");
	private IclientDao dao;
	
	
	public void setDao(IclientDao dao) {
		this.dao = dao;
		LOG.info("dao Client Injected");
	}

	@Override
	public void addClient(Client c, Long idAdress) {
		dao.addClient(c, idAdress);
	}

	@Override
	public void deleteClient(Long idClient) {
	dao.deleteClient(idClient);
	}

	@Override
	public void updateClient(Client c) {
	dao.updateClient(c);
	}

	@Override
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return dao.getClients();
	}

	@Override
	public List<Client> getClientsParMc(String mc) {
		// TODO Auto-generated method stub
		return dao.getClientsParMc(mc);
	}

	@Override
	public void addClientToVoiture(Long idVoiture, Long idClient) {
		dao.addClientToVoiture(idVoiture, idClient);
	}

	@Override
	public void addClient(Client c) {
		dao.addClient(c);
		
	}

	@Override
	public Client getClient(Long idClient) {
		// TODO Auto-generated method stub
		return dao.getClient(idClient);
	}

}
