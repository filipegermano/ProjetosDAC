package br.edu.ifpb.dac.entidades;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author filipe
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
