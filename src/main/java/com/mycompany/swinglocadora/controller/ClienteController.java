package com.mycompany.swinglocadora.controller;

import com.mycompany.swinglocadora.model.entities.Cliente;
import com.mycompany.swinglocadora.model.exceptions.ValidationException;
import com.mycompany.swinglocadora.model.services.ClienteService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class ClienteController {
    
    private ClienteService service;
    
    public ClienteController() {
        service = new ClienteService(); 
    }
    
    public List<Cliente> findAll(String nome) {
        return service.findAll(nome);
    }
    
    public void deletar(Cliente cliente) {
        service.delete(cliente);
    }
    
    public void save(Cliente cliente) {
        validateForm(cliente);
        service.saveOrUpdate(cliente);
    }
    
    private void validateForm(Cliente cliente) {
        ValidationException validation = new ValidationException("Validation Fields");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        
        if(cliente.getNome() == null || (cliente.getNome().length() < 3 || cliente.getNome().length()> 255)) {
            validation.setError("nome", "O nome deve ter entre 3 e 255 caracteres");
        } 
        
        if(!this.validateCpf(cliente.getCpf())) {
            validation.setError("cpf", "CPF inválido");
        }
         
        if (cliente.getDtNascimento() == null) {
            validation.setError("dtNascimento", "Preencha a data");
        } else {
            String data = sdf.format(cliente.getDtNascimento());
            if(!validateData(data)) {
                validation.setError("dtNascimento", "Data inválida");
            }
        }
        
        if(cliente.getEmail() == null || cliente.getEmail().isEmpty()) {
            validation.setError("email", "Endereço de e-mail inválido");
        }
        
        if(cliente.getEndereco() == null || cliente.getEndereco().isEmpty()) {
            validation.setError("endereco", "Endereço inválido");
        }
        
        if (validation.getErrors().size() > 0) {
            throw validation;
        }
    }
    
    private boolean validateCpf(String cpf) {
        if(cpf.length() != 11) return false;
        
        for (int i=0; i<cpf.length(); i++) {
            if (!Character.isDigit(cpf.charAt(i))) return false;
        }
        return true;
    }
    
    private boolean validateData(String data) {
        if(data.length() != 10) return false;
        
        for (int i=0; i<data.length(); i++) {
            if (!Character.isDigit(data.charAt(i))) {
                if (i != 2 && i != 5) return false;
            }
        }
        return true;
    }
      
              
}
