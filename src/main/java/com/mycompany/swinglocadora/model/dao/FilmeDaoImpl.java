package com.mycompany.swinglocadora.model.dao;

import com.mycompany.swinglocadora.db.Db;
import com.mycompany.swinglocadora.db.DbException;
import com.mycompany.swinglocadora.model.entities.Ator;
import com.mycompany.swinglocadora.model.entities.Filme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmeDaoImpl implements FilmeDao {

    private Connection conn;
	
    public FilmeDaoImpl() {
	this.conn = Db.getConnection();
    }
    
    @Override
    public void insert(Filme obj) {
      	PreparedStatement st = null;
	try {
            st = conn.prepareStatement(
                "INSERT INTO filmes " +
                "(titulo, genero, sinopse, duracao) " +
		"VALUES " +
		"(?, ?, ?, ?)", 
		Statement.RETURN_GENERATED_KEYS);

            st.setString(1, obj.getTitulo());
            st.setString(2, obj.getGenero());
            st.setString(3, obj.getSinopse());
            st.setInt(4, obj.getDuracao());
            int rowsAffected = st.executeUpdate();
			
            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setId_filme(id);
                }
            } else {
                throw new DbException("Unexpected error! No rows affected!");
            }
            
            // Inserir filmes_atores se exister atores para o filme
            if (!obj.getAtores().isEmpty()) {
                for(Ator ator : obj.getAtores()) {
                    
                    st = conn.prepareStatement("INSERT INTO filmes_atores (id_filme, id_ator) "
                            + "VALUES(?, ?)");
                    
                    st.setInt(1, obj.getId_filme());
                    st.setInt(2, ator.getId_ator());
                    st.executeUpdate();
                }
            }
            
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(st);
        }
    }

    @Override
    public void update(Filme obj) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE filmes "
                    + "SET titulo = ?, genero = ?, sinopse = ?, duracao = ? "
                    + "WHERE id_filme = ?");
            
            ps.setString(1, obj.getTitulo());
            ps.setString(2, obj.getGenero());
            ps.setString(3, obj.getSinopse());
            ps.setInt(4, obj.getDuracao());
            ps.setInt(5, obj.getId_filme());
            
            ps.executeUpdate();
            
            // Deletar relacao de filme com atores
            ps = conn.prepareStatement("DELETE FROM filmes_atores WHERE id_filme = " + obj.getId_filme());
            ps.executeUpdate();
            
            // Inserir filmes_atores se exister atores para o filme
            if (!obj.getAtores().isEmpty()) {
                for(Ator ator : obj.getAtores()) {
                    
                    ps = conn.prepareStatement("INSERT INTO filmes_atores (id_filme, id_ator) "
                            + "VALUES(?, ?)");
                    
                    ps.setInt(1, obj.getId_filme());
                    ps.setInt(2, ator.getId_ator());
                    ps.executeUpdate();
                }
            }
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
            st = conn.prepareStatement("DELETE FROM filmes WHERE id_filme = ?");
                    
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(st);
        }
    }

    @Override
    public Filme findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Filme> findAll(String titulo) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM filmes " +
                                    "WHERE titulo LIKE '%" + titulo + "%' ORDER BY titulo");
            
            rs = st.executeQuery();
            List<Filme> list = new ArrayList<Filme>();
			
            while (rs.next()) {
                Filme filme = new Filme();
                filme.setId_filme(rs.getInt("id_filme"));
                filme.setTitulo(rs.getString("titulo"));
                filme.setGenero(rs.getString("genero"));
                filme.setSinopse(rs.getString("sinopse"));
                filme.setDuracao(rs.getInt("duracao"));
                list.add(filme);
            }
            return list;
            
	} catch(SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
    }

    @Override
    public List<Ator> findAtores(Integer id_filme) {
       PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT A.id_ator, A.nome, A.nacionalidade "
                            + "FROM filmes_atores F INNER JOIN atores A USING(id_ator) " +
                                    "WHERE id_filme = " + id_filme);
            
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
