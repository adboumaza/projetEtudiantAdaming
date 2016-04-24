package com.Client.Client;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Client.Client.Metier.ClientMetierImpl;
import com.Client.Client.Metier.IclientMetier;
import com.Client.Client.entities.Client;

public class ClientTest {
    private static ClassPathXmlApplicationContext context;
    private static IclientMetier metier;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		metier=(IclientMetier) context.getBean("clientMetier");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Test
	public void testAddClient() {
		Client c= new Client("a", "prenomClient", 25);
		Client c1= new Client("a", "prenomClient", 25);
		metier.addClient(c);
		metier.addClient(c1);
		assertNotNull(c.getIdClient());
		assertNotNull(c1.getIdClient());
	}

	@Test
	public void testDeleteClient() {
		List<Client> tab1=metier.getClients();
		metier.deleteClient(1L);
		List<Client> tab2=metier.getClients();
		assertTrue(tab1.size()-1==tab2.size());
	}

	@Test
	public void testUpdateClient() {
	 Client c=metier.getClient(1L);
	 c.setAge(30);
	 metier.updateClient(c);
	 assertTrue(c.getAge()==30);
	}

	@Test
	public void testGetClients() {
		List<Client> clients=metier.getClients();
		assertTrue(clients.size()>0);
	}

	@Test
	public void testGetClientsParMc() {
		List<Client> tab=metier.getClientsParMc("b");
		for(Client c:tab){
			assertTrue(c.getNomClient().contains("a"));
		}
	}

	@Test
	public void testAddClientToVoiture() {
		fail("Not yet implemented");
	}

}
