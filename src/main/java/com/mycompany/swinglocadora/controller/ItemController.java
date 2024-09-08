package com.mycompany.swinglocadora.controller;

import com.mycompany.swinglocadora.model.entities.Ator;
import com.mycompany.swinglocadora.model.entities.Item;
import com.mycompany.swinglocadora.model.exceptions.ValidationException;
import com.mycompany.swinglocadora.model.services.ItemService;
import java.util.List;

public class ItemController {
    
    private ItemService service;
    
    public ItemController() {
        service = new ItemService();
    }
    
    public List<Item> findAll(String titulo) {
        return service.findAll(titulo);
    }
    
    public void delete(Item item) {
        service.delete(item);
    }
    
    public void save(Item item) {
        this.validateForm(item);
        service.saveOrUpdate(item);
    }
    
    private void validateForm(Item item) {
        ValidationException validation = new ValidationException("Validation Fields");
        
        if(item.getFilme().getId_filme() == null) {
            validation.setError("filme", "Selecione o filme do item");
        } 
        
        if(item.getTipo() == null || item.getTipo().trim().isEmpty()) {
            validation.setError("tipo", "Informe o tipo");
        } 
        
        if(item.getPreco() == 0) {
            validation.setError("preco", "Preço inválido");
        } 
        
        if (validation.getErrors().size() > 0) {
            throw validation;
        }
    }
}