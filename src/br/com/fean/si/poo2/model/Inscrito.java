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
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "inscrito")
public class Inscrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInscrito")
    private int id;
    @Column(name = "instituicaoInscrito")
    private String instituicao;
    @Column(name = "naturalidadeInscrito")
    private String naturalidade;
    @Column(name = "nomeInscrito")
    private String nome;
    @Column(name = "cpfInscrito")
    private String cpf;
    @Column(name = "dataNascimentoInscrito")
    private Date dataNascimento;
    @Column(name = "emailInscrito")
    private String email;

    @ManyToMany(mappedBy = "inscritos", cascade = CascadeType.ALL)
    private List<Sessao> sessao;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String Instituicao) {
        this.instituicao = Instituicao;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Sessao> getSessao() {
        return sessao;
    }

    public void setSessao(List<Sessao> sessao) {
        this.sessao = sessao;
    }

}
