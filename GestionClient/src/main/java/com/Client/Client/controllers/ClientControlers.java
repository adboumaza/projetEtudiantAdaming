package com.Client.Client.controllers;
//commit aghiles
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Client.Client.Metier.IclientMetier;
import com.Client.Voiture.Metier.IvoitureMetier;
/*test git*/
@Controller
public class ClientControlers {
    @Autowired
	private IclientMetier metierClient;
    @Autowired
    private IvoitureMetier metierVoiture;
    
    @RequestMapping(value="/index")
    public String index(Model model){
    	model.addAttribute("client",metierClient.getClients());
    	return "index";
    }
    @RequestMapping(value="/voiture")
    public String voiture(Model model){
    	model.addAttribute("voiture",metierVoiture.getvoitures());
    	return "voiture";
    }
    
    
    
	
}
