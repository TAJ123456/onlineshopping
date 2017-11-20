package sam.taj.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import sam.taj.shoppingbackend.dao.CategoryDao;
import sam.taj.shoppingbackend.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories =new ArrayList();
	static{
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television!");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);	
		
		//second category
		category=new Category();
		
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for Mobile!");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);	
		
		//Third category
		
		 category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for laptop!");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);	
	}
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	public Category get(int id) {
		//enhanced for loop
		for(Category category:categories){
			if(category.getId()==id)  return category;
		}
	return null;
	}

}
