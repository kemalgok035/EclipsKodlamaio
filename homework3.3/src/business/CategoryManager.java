package business;

import java.util.ArrayList;
import core.loging.Logger;
import dataAccess.category.CategoryDao;
import entities.Category;
import entities.Course;

public class CategoryManager {
	private ArrayList<Category> categories = new ArrayList<Category>();
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(ArrayList<Category> categories, CategoryDao categoryDao, Logger[] loggers) {

		this.categories = categories;
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category newcategory) throws Exception {
		
		for (Category category : categories) {
			
		      if(newcategory.getCategoryName() == category.getCategoryName()) {
		    	  
		    	  throw new Exception("There is already a category with this name" + " " + newcategory.getCategoryName());
		          
		 }
		}
		
		categories.add(newcategory);
		 categoryDao.add(newcategory);  		
		 for (Logger logger : loggers) {
				
				logger.log(newcategory.getCategoryName());
			}
		
		
		
		
		


	}

}
