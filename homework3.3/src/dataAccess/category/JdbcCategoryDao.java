package dataAccess.category;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		
		System.out.println("Added with JDBC : " + category.getCategoryName());
		
		
	}
	
	
	
	

}
