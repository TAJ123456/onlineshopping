package sam.taj.shoppingbackend.dao;

import java.util.List;

import sam.taj.shoppingbackend.dto.Category;

public interface CategoryDao {
	
List<Category> list();
Category get(int id);
}
