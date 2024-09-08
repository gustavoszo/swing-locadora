package com.mycompany.swinglocadora.model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    private Integer id_cliente;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private Date dtNascimento;
    private List<Item>itens = new ArrayList<Item>();
    
    public Cliente(){}
    
    public Cliente(String nome, String cpf, String email, String endereco, Date dtNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.dtNascimento = dtNascimento;
    }
    
    public Cliente(Integer id, String nome, String cpf, String email, String endereco, Date dtNascimento) {
        this.id_cliente = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.dtNascimento = dtNascimento;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
    
}
