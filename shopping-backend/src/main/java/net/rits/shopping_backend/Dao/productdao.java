package net.rits.shopping_backend.Dao;

import java.util.List;


import net.rits.shopping_backend.Dto.product;

public interface productdao {

	 product getproduct(int productid);
	 
	 List<product> productList();
	 
	 boolean add(product product);
	 boolean update(product product);
	 boolean delete (product product);
	 
	 List<product>listActiveProducts();
	 List<product>listActiveProductsByCategory(int categoryid);
}
