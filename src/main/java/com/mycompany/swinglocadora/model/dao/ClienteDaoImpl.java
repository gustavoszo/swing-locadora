package com.mycompany.swinglocadora.model.dao;

import com.mycompany.swinglocadora.db.Db;
import com.mycompany.swinglocadora.db.DbException;
import com.mycompany.swinglocadora.model.entities.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoImpl implements ClienteDao {
    
    private Connection conn;
	
    public ClienteDaoImpl() {
	this.conn = Db.getConnection();
    }
    
    @Override
    public void insert(Cliente obj) {
       PreparedStatement st = null;
       try {
           st = conn.prepareStatement("INSERT INTO clientes(nome, cpf, email, endereco, dtNascimento)"
                   + " VALUES(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
           st.setString(1, obj.getNome());
           st.setString(2, obj.getCpf());
           st.setString(3, obj.getEmail());
           st.setString(4, obj.getEndereco());
           st.setDate(5, new java.sql.Date(obj.getDtNascimento().getTime()));
           
           int rowsAffected = st.executeUpdate();
           if (rowsAffected > 0) {
               ResultSet rs = st.getGeneratedKeys();
               if (rs.next()) {
                   int id = rs.getInt(1);
                   obj.setId_cliente(id);
               }
           } else {
               throw new DbException("Unexpected error! No rows affected");
           }
       } catch (SQLException e) {
           throw new DbException(e.getMessage());
       } finally {
           Db.closeStatement(st);
       }
    }

    @Override
    public void update(Cliente obj) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE clientes "
                    + "SET nome = ?, cpf = ?, email = ?, endereco = ?, dtNascimento = ? "
                    + "WHERE id_cliente = ?");
            
            ps.setString(1, obj.getNome());
            ps.setString(2, obj.getCpf());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getEndereco());
            ps.setDate(5, new java.sql.Date(obj.getDtNascimento().getTime()));
            ps.setInt(6, obj.getId_cliente());
            
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
            ps = conn.prepareStatement("DELETE FROM clientes WHERE id_cliente = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            
        } catch(SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(ps);
        }
    }

    @Override
    public Cliente findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> findAll(String nome) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM clientes " +
                                    "WHERE nome LIKE '%" + nome + "%' ORDER BY nome");
            
            rs = st.executeQuery();
            List<Cliente> list = new ArrayList<Cliente>();
			
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setDtNascimento(rs.getDate("dtNascimento"));
                list.add(cliente);
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
