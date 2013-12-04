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
public class Email implements Serializable {
    @Id
    private Integer id;
    @Column(length = 10)
    private String tipo;
    @Column(length = 40)
    private String email;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
