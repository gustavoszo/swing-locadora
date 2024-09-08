package com.mycompany.swinglocadora.model.dao;

import com.mycompany.swinglocadora.model.entities.Item;
import java.util.List;

public interface ItemDao {
    
    void insert(Item obj);
    void update(Item obj);
    void deleteById(Integer id);
    Item findById(Integer id);
    List<Item> findAll(String titulo);
    
}
