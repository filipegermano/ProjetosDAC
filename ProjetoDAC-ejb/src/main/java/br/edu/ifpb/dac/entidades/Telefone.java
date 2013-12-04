package br.edu.ifpb.dac.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author filipe
 */
@Entity
public class Telefone implements Serializable {

    @Id
    private Integer id;
    @Column(length = 2)
    private String codCidade;
    @Column(length = 10)
    private String numero;

    public String getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(String codCidade) {
        this.codCidade = codCidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
