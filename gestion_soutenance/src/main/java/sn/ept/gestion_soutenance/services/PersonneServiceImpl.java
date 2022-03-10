/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.gestion_soutenance.services;

import java.util.List;
import sn.ept.gestion_soutenance.dao.PersonneDAOImpl;
import sn.ept.gestion_soutenance.dao.PersonneDAO;
import sn.ept.gestion_soutenance.entities.Personne;

/**
 *
 * @author ssidibe
 */
public class PersonneServiceImpl implements PersonneService {

    private PersonneDAO PersonneDAO;

    public PersonneServiceImpl() {
        PersonneDAO = new PersonneDAOImpl();
    }

    @Override
    public List<Personne> listPersonne() {
        return PersonneDAO.listPersonnes();
    }

}
