package br.edu.ifpb.dac.negocio;

import br.edu.ifpb.dac.entidades.Produto;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author filipe
 */
@Stateful
public class Fachada implements FachadaLocal {
    @PersistenceContext(unitName = "atividadeDac-PU")
    private EntityManager manager;

    @Override
    public void cadastraProduto(Produto produto) {
        manager.persist(produto);
    }
    
    
    
}
