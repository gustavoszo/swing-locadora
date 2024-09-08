package com.mycompany.swinglocadora.model.dao;

import com.mycompany.swinglocadora.model.entities.Ator;
import java.util.List;

public interface AtorDao {
    
    void insert(Ator obj);
    void update(Ator obj);
    void deleteById(Integer id);
    Ator findById(Integer id);
    List<Ator> findAll(String nome);
    List<Ator> findAll();
    
}
