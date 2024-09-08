package com.mycompany.swinglocadora.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Ator {
    Integer id_ator;
    String nome;
    String nacionalidade;
    List<Filme>filmes = new ArrayList<Filme>();
    
    public Ator() {}
    
    public Ator(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    
    public Ator(Integer id, String nome, String nacionalidade) {
        this.id_ator = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public Integer getId_ator() {
        return id_ator;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setId_ator(Integer id_ator) {
        this.id_ator = id_ator;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
}
