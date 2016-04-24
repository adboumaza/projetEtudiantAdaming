package com.Client.Client.Dao;

import java.util.List;

import com.Client.Client.entities.Client;

public interface IclientDao {
    public void addClient(Client c);
	public void addClient(Client c,Long idAdress);
	public void deleteClient(Long idClient);
	public void updateClient(Client c);
	public List<Client> getClients();
	public List<Client> getClientsParMc(String mc);
	public void addClientToVoiture(Long idVoiture,Long idClient);
	public Client getClient(Long idClient);
}
