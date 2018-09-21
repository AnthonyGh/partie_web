package fr.m2iformation.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import fr.m2iformation.models.Spectacle;
import fr.m2iformation.persistence.entity.Customer;
import fr.m2iformation.persistence.entity.Person;
import fr.m2iformation.persistence.service.IPersonService;



@Controller
public class AccueilControllers {

	@Autowired
	private IPersonService servicePersonne;
	
//	private static List<Spectacle> spectacles = new ArrayList<>();
//
//	static {
//		spectacles.add(new Spectacle("Sabrina", 25, "Place de la concorde"));
//		spectacles.add(new Spectacle("Anthony", 24, "Place de la concordes"));
//		spectacles.add(new Spectacle("Mohamed", 26, "Place de la concord"));
//	}
	


	@GetMapping("/person")
	public String pageListe(Model model, Integer id) {
		Person personne = servicePersonne.findPersonById(1);
		model.addAttribute("personne", personne);
		return "person";
	}
	
	@GetMapping("/login")
	public String pageLogin(@ModelAttribute Customer customer, Model model) {
		
		model.addAttribute("customer", customer);
		return "login";
	}
	
//	@GetMapping("/list")
//	public String pageListe(Model model) {
//		List<Spectacle> spectacles = serviceSpectacle.findAll();
//		model.addAttribute("spectacles", spectacles);
//		return "list";
//	}

}
