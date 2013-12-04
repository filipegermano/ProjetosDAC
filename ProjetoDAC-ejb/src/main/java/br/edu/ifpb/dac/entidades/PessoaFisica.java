package br.edu.ifpb.dac.entidades;

import java.util.Calendar;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author filipe
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class PessoaFisica extends Pessoa {

    private char sexo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataNascimento;
    private String cpf;

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
