package com.mycompany.swinglocadora.model.dao;

import com.mycompany.swinglocadora.db.Db;
import com.mycompany.swinglocadora.db.DbException;
import com.mycompany.swinglocadora.model.entities.Ator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AtorDaoImpl implements AtorDao {
    
    private Connection conn;
	
    public AtorDaoImpl() {
	this.conn = Db.getConnection();
    }
    
    @Override
    public void insert(Ator obj) {
       PreparedStatement st = null;
       ResultSet rs = null;
       try {
           st = conn.prepareStatement("INSERT INTO atores(nome, nacionalidade) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);
           st.setString(1, obj.getNome());
           st.setString(2, obj.getNacionalidade());
           
           int rowsAffected = st.executeUpdate();
           if (rowsAffected > 0) {
               rs = st.getGeneratedKeys();
               if (rs.next()) {
                   int id = rs.getInt(1);
                   obj.setId_ator(id);
               }
           } else {
               throw new DbException("Unexpected error! No rows affected");
           }
       } catch (SQLException e) {
           throw new DbException(e.getMessage());
       } finally {
           Db.closeStatement(st);
           Db.closeResultSet(rs);
       }
    }

    @Override
    public void update(Ator obj) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE atores "
                    + "SET nome = ?, nacionalidade = ? "
                    + "WHERE id_ator = ?");
            
            ps.setString(1, obj.getNome());
            ps.setString(2, obj.getNacionalidade());
            ps.setInt(3, obj.getId_ator());
            
            ps.executeUpdate();
        } catch(SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(ps);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM atores WHERE id_ator = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            
        } catch(SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(ps);
        }
    }

    @Override
    public Ator findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Ator> findAll(String nome) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM atores " +
                                    "WHERE nome LIKE '%" + nome + "%' ORDER BY nome");
            
            rs = st.executeQuery();
            List<Ator> list = new ArrayList<Ator>();
			
            while (rs.next()) {
                Ator ator = new Ator();
                ator.setId_ator(rs.getInt("id_ator"));
                ator.setNome(rs.getString("nome"));
                ator.setNacionalidade(rs.getString("nacionalidade"));
                list.add(ator);
            }
            return list;
            
	} catch(SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
    }

    public List<Ator> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM atores ORDER BY nome");
            
            rs = st.executeQuery();
            List<Ator> list = new ArrayList<Ator>();
			
            while (rs.next()) {
                Ator ator = new Ator();
                ator.setId_ator(rs.getInt("id_ator"));
                ator.setNome(rs.getString("nome"));
                ator.setNacionalidade(rs.getString("nacionalidade"));
                list.add(ator);
            }
            return list;
            
	} catch(SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
    }
    
}
