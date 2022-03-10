package sn.ept.gestion_soutenance.dao;

import java.util.List;
import sn.ept.gestion_soutenance.entities.Personne;

public interface PersonneDAO {

    public List<Personne> listPersonnes();

    public void addPersonne(Personne personne);
}