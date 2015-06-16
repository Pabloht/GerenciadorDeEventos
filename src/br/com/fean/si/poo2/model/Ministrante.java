/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fean.si.poo2.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "ministrante")
public class Ministrante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMinistrante")
    private int id;
    @Column(name = "curriculoMinistrante")
    private String curriculo;
    @Column(name = "emailMinistrante")
    private String email;
    @Column(name = "nomeMinistrante")
    private String nome;
    @Column(name = "telefoneMinistrante")
    private String telefone;

    @ManyToMany(mappedBy = "ministrantes", cascade = CascadeType.ALL)
    private List<Sessao> sessao;

    public Ministrante() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Sessao> getSessao() {
        return sessao;
    }

    public void setSessao(List<Sessao> sessao) {
        this.sessao = sessao;
    }

}
