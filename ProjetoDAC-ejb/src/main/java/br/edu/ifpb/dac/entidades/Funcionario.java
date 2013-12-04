package br.edu.ifpb.dac.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author filipe
 */
@Entity
public class Funcionario extends PessoaFisica implements Serializable {

    @Id
    private Long matricula;
    @Column(length = 50)
    private String cargo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataAdmissao;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Telefone> telefone = new ArrayList<>();
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Email> emails = new ArrayList<>();
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Pedido> pedidos = new ArrayList<>();

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }
}
