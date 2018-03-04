package net.rits.shopping_backend.Daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import net.rits.shopping_backend.Dao.Categorydao;
import net.rits.shopping_backend.Dto.Category;
@Transactional
@Component("categoryDao")
public class Categorydaoimpl implements Categorydao {

	@Autowired
	SessionFactory sessionFactory;

	private static List<Category> categories = new ArrayList<>();

	@Override
	public List<Category> list() {
     
		Query query=sessionFactory.getCurrentSession().createQuery("from Category");
		
		
		return query.list();
	}

	@Override
	public Category getCategory(int id) {

		for (Category cat : categories) {

			if (cat.getId() == id) {

				return cat;
			}

		}
		return null;
	}

	
	@Override
	public void saveCategory(Category category) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();

	    session.saveOrUpdate(category);

	}

}
