package com.mycompany.swinglocadora.model.entities;

import com.mycompany.swinglocadora.model.entities.Ator;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private Integer id_filme;
    private String titulo;
    private String genero;
    private String sinopse;
    private int duracao;
    private List<Item>itens = new ArrayList<Item>();
    private List<Ator>atores = new ArrayList<Ator>();
    
    public Filme(){};
    
    public Filme(String titulo, String genero, String sinopse, Integer duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }
    
    public Filme(Integer id_filme, String titulo, String genero, String sinopse, Integer duracao) {
        this.id_filme = id_filme;
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }

    public Integer getId_filme() {
        return id_filme;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getDuracao() {
        return duracao;
    }

    public List<Item> getItens() {
        return itens;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setId_filme(Integer id_filme) {
        this.id_filme = id_filme;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
    
    
}