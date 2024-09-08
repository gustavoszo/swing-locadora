package com.mycompany.swinglocadora.model.services;

import com.mycompany.swinglocadora.model.dao.ClienteDao;
import com.mycompany.swinglocadora.model.dao.DaoFactory;
import com.mycompany.swinglocadora.model.entities.Cliente;
import java.util.List;

public class ClienteService {
    
    private ClienteDao dao = DaoFactory.getClienteDao();
	
    public List<Cliente> findAll(String nome) {
	return dao.findAll(nome);
    }
    
    public void saveOrUpdate(Cliente cliente) {
        if (cliente.getId_cliente() == null) {
            dao.insert(cliente); 
        } else {
            dao.update(cliente); 
        }
    }

    public void delete(Cliente cliente) {
	dao.deleteById(cliente.getId_cliente());
    }
    
}
