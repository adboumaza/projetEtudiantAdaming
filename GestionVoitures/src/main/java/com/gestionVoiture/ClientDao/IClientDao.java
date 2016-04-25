package com.gestionVoiture.ClientDao;

import java.util.List;

import com.gestionVoiture.entities.Client;
/*interface Dao*/
public interface IClientDao {

	public Client addClient(Client c);
	public void updateClient(Client c);
	public void deleteClient(Long idClient);
	public Client getClient(Long idClient);
	public List<Client> getClients();
	public List<Client> getClientParMc(String mc);
	public Client addClient(Client c,Long idAdress);
    public void addClientToVoiture(Long idVoiture,Long idClient);
	
}
