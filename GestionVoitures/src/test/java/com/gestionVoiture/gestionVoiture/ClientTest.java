package com.gestionVoiture.gestionVoiture;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gestionVoiture.ClientMetier.IclientMetier;
import com.gestionVoiture.entities.Client;

public class ClientTest {
	
	/* ajout commentaire test synchro arnaud */
    
	private static ClassPathXmlApplicationContext context;
	private static IclientMetier metierClient;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		metierClient=(IclientMetier) context.getBean("metierClient");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}
	
	/*test commentaire sabrina*/

	@Test
	public void testAddClientClient() {
		/* test ajout client - arnaud */
		Client c= new Client("Boumaza","adel",29);
		metierClient.addClient(c);
		assertNotNull(c.getIdClient());
	}

	@Test
	public void testUpdateClient() {
		/* test update client - arnaud */
		Client c=metierClient.getClient(1L);
		c.setNomClient("nom modifier");
		metierClient.updateClient(c);
		assertTrue(c.getNomClient().equals("nom modifier"));
	}

	@Test
	public void testDeleteClient() {
		/*test com valerian*/
		List<Client> tab1=metierClient.getClients();//2
		metierClient.deleteClient(1L);
		List<Client> tab2= metierClient.getClients();//1
		assertTrue(tab1.size()-1==tab2.size());
	}

	@Test
	public void testGetClient() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClients() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClientParMc() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddClientClientLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddClientToVoiture() {
		fail("Not yet implemented");
	}

}
