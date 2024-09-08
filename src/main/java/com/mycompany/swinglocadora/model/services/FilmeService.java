package com.mycompany.swinglocadora.model.services;

import com.mycompany.swinglocadora.model.dao.DaoFactory;
import com.mycompany.swinglocadora.model.dao.FilmeDao;
import com.mycompany.swinglocadora.model.entities.Ator;
import com.mycompany.swinglocadora.model.entities.Filme;
import java.util.List;

public class FilmeService {
    
    private FilmeDao dao = DaoFactory.getFilmeDao();
	
    public List<Filme> findAll(String titulo) {
	return dao.findAll(titulo);
    }
    
    public void saveOrUpdate(Filme filme) {
        if (filme.getId_filme() == null) {
            dao.insert(filme); 
        } else {
            dao.update(filme); 
        }
    }

    public void delete(Filme filme) {
	dao.deleteById(filme.getId_filme());
    }

    public List<Ator> findAllAtores(Filme filme) {
	return dao.findAtores(filme.getId_filme());
    }
    
}
