package com.gestionVoiture.gestionVoiture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionVoiture.ClientMetier.IclientMetier;
import com.gestionVoiture.entities.Client;

@Controller//anotation Spring
public class ClientControler {
    @Autowired //injection
	private IclientMetier metierClient;
    
    @RequestMapping(value="/index")//url 
    public String index(Model model){//notre model
    	model.addAttribute("client",metierClient.getClients());
    	return "index";//page.jsp
    }
    @RequestMapping(value="/adaming")//url
    public String voiture(){//methode return page jsp
    	
    	return "voiture";//page.jsp;
    }
    @RequestMapping(value="/insert")
    public String save(Model model,Client c){
    	metierClient.addClient(c);
    	model.addAttribute("client",metierClient.getClients());
    	return "index";
    }
    @RequestMapping(value="/delete")
    public String save(Model model,Long idClient ){
    	metierClient.deleteClient(idClient);
    	model.addAttribute("client",metierClient.getClients());
    	return "index";
    }
	
	
	
}
