/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.negocio;

import br.edu.ifpb.dac.entidades.Produto;
import javax.ejb.Local;

/**
 *
 * @author filipe
 */
@Local
public interface FachadaLocal {
    
    public void cadastraProduto(Produto produto);
    
}
