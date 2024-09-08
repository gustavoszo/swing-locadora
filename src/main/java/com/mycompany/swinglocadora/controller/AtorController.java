package com.mycompany.swinglocadora.controller;

import com.mycompany.swinglocadora.model.entities.Ator;
import com.mycompany.swinglocadora.model.exceptions.ValidationException;
import com.mycompany.swinglocadora.model.services.AtorService;
import java.util.List;

public class AtorController {
    
    private AtorService service;
    
    public AtorController() {
        service = new AtorService();
    }
    
    public List<Ator> findAll() {
        return service.findAll();
    }
    
    public List<Ator> findAll(String nome) {
        return service.findAll(nome);
    }
    
    public void delete(Ator ator) {
        service.delete(ator);
    }
    
    public void save(Ator ator) {
        this.validateForm(ator);
        service.saveOrUpdate(ator);
    }
    
    private void validateForm(Ator ator) {
        ValidationException validation = new ValidationException("Validation Fields");
        
        if(ator.getNome() == null || (ator.getNome().length() < 3 || ator.getNome().length()> 255)) {
            validation.setError("nome", "O nome deve ter entre 3 e 255 caracteres");
        } 
        
        if (validation.getErrors().size() > 0) {
            throw validation;
        }
    }
}