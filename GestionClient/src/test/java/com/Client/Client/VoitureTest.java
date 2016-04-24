package com.Client.Client;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Client.Client.Metier.IclientMetier;
import com.Client.Client.entities.Voiture;
import com.Client.Voiture.Metier.IvoitureMetier;

public class VoitureTest {

	private static ClassPathXmlApplicationContext context;
	private static IvoitureMetier metier;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		metier = (IvoitureMetier) context.getBean("voitureMetier");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Test
	public void testAddVoiture() {
		Voiture v= new Voiture("BMW");
		metier.addVoiture(v);
		assertNotNull(v.getIdVoiture());
		
	}

	@Test
	public void testGetvoitures() {
		List<Voiture> voitures=metier.getvoitures();
		assertNotNull(voitures.size()>0);
	}

}
