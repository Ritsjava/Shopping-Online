package net.rits.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import net.rits.shopping_backend.Dao.Categorydao;
import net.rits.shopping_backend.Dto.Category;

@Controller
public class Homeontrolller {

	@Autowired
    Categorydao categoryDao;


	@RequestMapping(value = { "/", "/home" })
	public String homePage(Model model) {
		model.addAttribute("title", "Home");
		model.addAttribute("clickhome", "true");
		System.out.println("///////////////////////////////////////////////////");
		model.addAttribute("categories",categoryDao.list());
		return "page";
	}

	@RequestMapping("/about")
	public String aboutPage(Model model) {
		model.addAttribute("title", "About");
		model.addAttribute("clickabout", "true");
		return "about";
	}

	@RequestMapping("/contact")
	public String contactPage(Model model) {
		model.addAttribute("title", "Contact");
		model.addAttribute("clickcontact", "true");
		return "contact";
	}
	
	@RequestMapping("/allproduct")
	public String productPage(Model model) {
		model.addAttribute("title", "Product");
		model.addAttribute("clickproduct", "true");
		model.addAttribute("categories",categoryDao.list());
		return "product";
	}
	
	@RequestMapping("{id}/categoryproduct")
	public String categoryProductPage(Model model, @PathVariable("id") int id) {
		
	    Category category;
	    category=categoryDao.getCategory(id);
	    model.addAttribute("title","${category.getName()}");
		return "product";
	}
	
	@RequestMapping("/save")
	public void save(){
		Category cat = new Category();
		cat.setName("Laptop");
		cat.setDescription("dkdkdkdkdk");
		cat.setImage_url("lapi.jpg");
		categoryDao.saveCategory(cat);
	}
}
