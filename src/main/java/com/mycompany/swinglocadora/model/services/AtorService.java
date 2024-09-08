package com.mycompany.swinglocadora.model.services;

import com.mycompany.swinglocadora.model.dao.AtorDao;
import com.mycompany.swinglocadora.model.dao.DaoFactory;
import com.mycompany.swinglocadora.model.entities.Ator;
import java.util.List;

public class AtorService {
    
    private AtorDao dao = DaoFactory.getAtorDao();
	
    public List<Ator> findAll(String nome) {
	return dao.findAll(nome);
    }
    
    public List<Ator> findAll() {
	return dao.findAll();
    }
    
    public void saveOrUpdate(Ator ator) {
        if (ator.getId_ator() == null) {
            dao.insert(ator); 
        } else {
            dao.update(ator); 
        }
    }

    public void delete(Ator ator) {
	dao.deleteById(ator.getId_ator());
    }
    
}
