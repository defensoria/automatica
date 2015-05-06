/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.simco.defensoria.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import pe.com.simco.defensoria.model.Canal;

/**
 *
 * @author carlos
 */
@Stateless
public class CanalDAOImpl implements CanalDAO{
    
    @PersistenceContext(unitName = "AutomaticaAlertaEJBPU")
    private EntityManager em;

    @Override
    public List<Canal> listaCanales() {
        StringBuilder jpql = new StringBuilder();
	jpql.append("select o from Canal o ");
        jpql.append("order by o.id ");
        Query query = em.createQuery(jpql.toString());  
        List<Canal> lista = query.getResultList();
        return lista;
    }
    
}
