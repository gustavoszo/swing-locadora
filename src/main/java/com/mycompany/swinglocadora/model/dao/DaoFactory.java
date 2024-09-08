package com.mycompany.swinglocadora.model.dao;

public class DaoFactory {
    
    public static FilmeDao getFilmeDao() {
	return new FilmeDaoImpl();
    }
	
    public static AtorDao getAtorDao() {
	return new AtorDaoImpl();
    }
	
    public static ClienteDao getClienteDao() {
	return new ClienteDaoImpl();
    }
	
    public static ItemDao getItemDao() {
	return new ItemDaoImpl();
    }
    
}
