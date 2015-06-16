/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fean.si.poo2.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "evento")
public class Evento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEvento")
    private int id;
    @Column(name = "conteudoEmailEvento")
    private String conteudoEmail;
    @Column(name = "dataInicioEvento")
    private Date dataInicio;
    @Column(name = "dataFimEvento")
    private Date dataFim;
    @Column(name = "localEvento")
    private String local;
    @Column(name = "nomeEvento")
    private String nome;

    public Evento() {
    }

    public Evento(int id, Date dataInicio, Date dataFim, String local, String nome) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.local = local;
        this.nome = nome;
    }

    public Evento(Date dataInicio, Date dataFim, String local, String nome) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.local = local;
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConteudoEmail() {
        return conteudoEmail;
    }

    public void setConteudoEmail(String conteudoEmail) {
        this.conteudoEmail = conteudoEmail;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
}
