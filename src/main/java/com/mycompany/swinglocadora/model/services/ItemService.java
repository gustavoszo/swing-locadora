package com.mycompany.swinglocadora.model.services;

import com.mycompany.swinglocadora.model.dao.DaoFactory;
import com.mycompany.swinglocadora.model.dao.ItemDao;
import com.mycompany.swinglocadora.model.entities.Item;
import java.util.List;

public class ItemService {
    
    private ItemDao dao = DaoFactory.getItemDao();
	
    public List<Item> findAll(String titulo) {
	return dao.findAll(titulo);
    }
    
    public void saveOrUpdate(Item item) {
        if (item.getId_item() == null) {
            dao.insert(item); 
        } else {
            dao.update(item); 
        }
    }

    public void delete(Item item) {
	dao.deleteById(item.getId_item());
    }
    
}
