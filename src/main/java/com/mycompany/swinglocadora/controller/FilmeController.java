package com.mycompany.swinglocadora.controller;

import com.mycompany.swinglocadora.model.entities.Ator;
import com.mycompany.swinglocadora.model.entities.Filme;
import com.mycompany.swinglocadora.model.services.FilmeService;
import java.util.List;

public class FilmeController {
    
    private FilmeService service;
    
    public FilmeController() {
            this.service = new FilmeService();
    }
       
    public boolean save(Filme filme) {
        if (filme.getTitulo() != null && filme.getTitulo().length() != 0 && filme.getGenero() != null && filme.getGenero().length() != 0 && filme.getSinopse() != null && filme.getSinopse().length() != 0 && filme.getDuracao() > 0) {
            service.saveOrUpdate(filme);
            return true;
        }
        return false;
    }
    
    public List<Filme> findAll(String titulo) {
        return service.findAll(titulo);
    }
    
    public void delete(Filme filme) {
        service.delete(filme);
    }
    
    public List<Ator> findAllAtores(Filme filme) {
        return service.findAllAtores(filme);
    }
    
}
