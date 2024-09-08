package com.mycompany.swinglocadora.model.entities;

import com.mycompany.swinglocadora.model.entities.Filme;
import com.mycompany.swinglocadora.model.entities.Cliente;
import java.util.Date;

public class Item {
    private Integer id_item;
    private String tipo;
    private double preco;
    private Date dtLocacao;
    private Date dtDevolucao;
    private Filme filme;
    private Cliente cliente;
    
    public Item() {}
    
    public Item(Integer id_filme, String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
        this.filme = new Filme();
        this.filme.setId_filme(id_filme);
    }

    public Item(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }
    
    public Integer getId_item() {
        return id_item;
    }

    public void setId_item(Integer id_item) {
        this.id_item = id_item;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDtLocacao() {
        return dtLocacao;
    }

    public void setDtLocacao(Date dtLocacao) {
        this.dtLocacao = dtLocacao;
    }

    public Date getDtDevolucao() {
        return dtDevolucao;
    }

    public void setDtDevolucao(Date dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
