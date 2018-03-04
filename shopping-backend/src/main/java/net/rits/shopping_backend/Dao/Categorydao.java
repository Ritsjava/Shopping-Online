package net.rits.shopping_backend.Dao;

import java.util.List;

import net.rits.shopping_backend.Dto.Category;

public interface Categorydao {

	public List<Category> list();
	
	public Category getCategory(int id);
	
	public void saveCategory(Category category);
}
