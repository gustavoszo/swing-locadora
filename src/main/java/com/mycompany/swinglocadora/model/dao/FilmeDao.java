package com.mycompany.swinglocadora.model.dao;

import com.mycompany.swinglocadora.model.entities.Ator;
import com.mycompany.swinglocadora.model.entities.Filme;
import java.util.List;

public interface FilmeDao {
    
    void insert(Filme obj);
    void update(Filme obj);
    void deleteById(Integer id);
    Filme findById(Integer id);
    List<Filme> findAll(String nome); 
    List<Ator> findAtores(Integer id);
    
}
