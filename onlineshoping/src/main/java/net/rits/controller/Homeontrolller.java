package net.rits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homeontrolller {
	
	@RequestMapping(value={"/","/home"})   
	public String homePage(Model model){
		model.addAttribute("title","Home");
		model.addAttribute("clickhome","true");
		return "page";
	}
	
	@RequestMapping("/about")
	public String aboutPage(Model model){
		model.addAttribute("title","About");
		model.addAttribute("clickabout","true");
		return "about";
	}
	
	@RequestMapping("/contact")
	public String contactPage(Model model){
		model.addAttribute("title","Contact");
		model.addAttribute("clickcontact","true");
		return "contact";
	}
}
