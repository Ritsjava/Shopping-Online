package net.rits.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.rits.shopping_backend.Dao.productdao;
import net.rits.shopping_backend.Dto.product;

@Controller
@RequestMapping("/jason/data")
public class Jasoncontroller {

	@Autowired
	productdao productdao;

	@RequestMapping("/all/product")
	@ResponseBody
	public List<product> productList() {

		List<product> productlist = productdao.productList();

		return productlist;

	}

//	@RequestMapping("/category/{id}/products")
//	@ResponseBody
//	public product productByCategory(@PathVariable("id") int id) {
//
//		
//
//		return productlist;
//
//	}
}
