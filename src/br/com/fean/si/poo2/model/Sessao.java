/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fean.si.poo2.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "sessao")
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dataSessao")
    private Date data;
    @Column(name = "eventoSessao")
    private Evento evento;
    @Column(name = "horaFimSessao")
    private Date horaFim;
    @Column(name = "horaInicioSessao")
    private Date horaInicio;
    @Column(name = "idSessao")
    private int id;
    @Column(name = "localSessao")
    private String local;
    @Column(name = "nomeSessao")
    private String nome;
    @Column(name = "numeroMaximoSessao")
    private int numeroMaximo;
    
    // @OneToMany ou @ManyToOne ??  Coloquei o que achei mais correto, será que ta certo?
    
    @ManyToOne
    @JoinColumn(name="tipoSessao_idSessao")
    private TipoSessao tipoSessao; 
    
     @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable(name="sessao_inscrito", 
      joinColumns=@JoinColumn(name="idInscrito"),
      inverseJoinColumns=@JoinColumn(name="idSessao"))
    private List<Inscrito> inscrito;
    
    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable(name="sessao_ministrante", 
      joinColumns=@JoinColumn(name="idMinistrante"),
      inverseJoinColumns=@JoinColumn(name="idSessao"))
    private List<Ministrante> ministrante;

    public Sessao() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Date getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Date horaFim) {
        this.horaFim = horaFim;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNumeroMaximo() {
        return numeroMaximo;
    }

    public void setNumeroMaximo(int numeroMaximo) {
        this.numeroMaximo = numeroMaximo;
    }

    public TipoSessao getTipoSessao() {
        return tipoSessao;
    }

    public void setTipoSessao(TipoSessao tipoSessao) {
        this.tipoSessao = tipoSessao;
    }

    public List<Inscrito> getInscrito() {
        return inscrito;
    }

    public void setInscrito(List<Inscrito> inscrito) {
        this.inscrito = inscrito;
    }

    public List<Ministrante> getMinistrante() {
        return ministrante;
    }

    public void setMinistrante(List<Ministrante> ministrante) {
        this.ministrante = ministrante;
    }
       
}