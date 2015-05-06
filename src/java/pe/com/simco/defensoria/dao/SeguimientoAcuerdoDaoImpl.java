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
import pe.com.simco.defensoria.model.SeguimientoAcuerdo;

/**
 *
 * @author carlos
 */
@Stateless
public class SeguimientoAcuerdoDaoImpl implements SeguimientoAcuerdoDao {

    @PersistenceContext(unitName = "AutomaticaAlertaEJBPU")
    private EntityManager em;

    @Override
    public List<SeguimientoAcuerdo> listarPendientes() {
        List<SeguimientoAcuerdo> lista = null;
        StringBuilder jpql = new StringBuilder();
        jpql.append("select o from SeguimientoAcuerdo o");
        Query query = em.createQuery(jpql.toString());
        lista = query.getResultList();
        return lista;
    }

}
