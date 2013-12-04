package br.edu.ifpb.dac.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author filipe
 */
@Entity
public class Cliente extends PessoaFisica implements Serializable {

    @Id
    private Integer id;
    @Column(length = 10)
    private String tipo;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Telefone> telefones = new ArrayList<>();
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Email> emails = new ArrayList<>();
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Pedido> pedidos = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Telefone> getTelefone() {
        return telefones;
    }

    public void setTelefone(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
