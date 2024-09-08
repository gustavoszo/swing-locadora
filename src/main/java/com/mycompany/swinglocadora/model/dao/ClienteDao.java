package com.mycompany.swinglocadora.model.dao;

import com.mycompany.swinglocadora.model.entities.Cliente;
import java.util.List;

public interface ClienteDao {
    
    void insert(Cliente obj);
    void update(Cliente obj);
    void deleteById(Integer id);
    Cliente findById(Integer id);
    List<Cliente> findAll(String nome);
    
}
