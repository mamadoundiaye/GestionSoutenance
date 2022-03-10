/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.gestion_soutenance.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.entities.Personne;

/**
 *
 * @author ssidibe
 */
public class PersonneDAOImpl implements PersonneDAO {

    @Override
    public List<Personne> listPersonnes() {

        EntityManager em = DbConfig.getInstance().getEm();
        Query q = em.createNamedQuery("Personne.findAll");
        return q.getResultList();

    }

    @Override
    public void addPersonne(Personne Personne) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
