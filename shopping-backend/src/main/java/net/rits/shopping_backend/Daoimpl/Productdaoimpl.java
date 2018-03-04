package net.rits.shopping_backend.Daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.rits.shopping_backend.Dao.productdao;
import net.rits.shopping_backend.Dto.product;

@Component
@Transactional
public class Productdaoimpl implements productdao {
	
 @Autowired
 SessionFactory sessionfactory;

	@Override
	public product getproduct(int productid) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		
		return (product)session.get(product.class,productid); 
	}

	@Override
	public List<product> productList() {
		
		Session session = sessionfactory.getCurrentSession();
		
		List<product> list = session.createQuery("from product").list();
		return list;
	}

	@Override
	public boolean add(product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<product> listActiveProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<product> listActiveProductsByCategory(int categoryid) {
		// TODO Auto-generated method stub
		return null;
	}

}
