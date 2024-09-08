package com.mycompany.swinglocadora.model.dao;

import com.mycompany.swinglocadora.db.Db;
import com.mycompany.swinglocadora.db.DbException;
import com.mycompany.swinglocadora.model.entities.Filme;
import com.mycompany.swinglocadora.model.entities.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements ItemDao {
    
    private Connection conn;
    
    public ItemDaoImpl() {
        this.conn = Db.getConnection();
    }

    @Override
    public void insert(Item obj) {
       PreparedStatement st = null;
       ResultSet rs = null;
       try {
           st = conn.prepareStatement("INSERT INTO itens(id_filme, tipo, preco) VALUES(?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
           st.setInt(1, obj.getFilme().getId_filme());
           st.setString(2, obj.getTipo());
           st.setDouble(3, obj.getPreco());
           
           int rowsAffected = st.executeUpdate();
           if (rowsAffected > 0) {
               rs = st.getGeneratedKeys();
               if (rs.next()) {
                   int id = rs.getInt(1);
                   obj.setId_item(id);
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
    public void update(Item obj) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE itens "
                    + "SET id_filme = ?, tipo = ?, preco = ? "
                    + "WHERE id_item = ?");
            
            ps.setInt(1, obj.getFilme().getId_filme());
            ps.setString(2, obj.getTipo());
            ps.setDouble(3, obj.getPreco());
            ps.setInt(4, obj.getId_item());
            
            ps.executeUpdate();
        } catch(SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(ps);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("DELETE FROM itens WHERE id_item = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch(SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public Item findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Item> findAll(String titulo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = conn.prepareStatement("SELECT I.id_item, I.tipo, I.preco, F.id_filme, F.titulo "
                    + "FROM itens I, Filmes F "
                    + "WHERE I.id_filme = F.id_filme AND F.titulo LIKE '%" + titulo + "%' ORDER BY F.titulo");
            
            rs = ps.executeQuery();
            List<Item> itens = new ArrayList<Item>();
            
            while (rs.next()) {
               Filme filme = new Filme();
               filme.setId_filme(rs.getInt("id_filme"));
               filme.setTitulo(rs.getString("titulo"));
               
               Item item = new Item();
               item.setId_item(rs.getInt("id_item"));
               item.setTipo(rs.getString("tipo"));
               item.setPreco(rs.getDouble("preco"));
               item.setFilme(filme);
               
               itens.add(item);
            }
            return itens;
            
        } catch(SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(ps);
            Db.closeResultSet(rs);
        }
    }
    
}
