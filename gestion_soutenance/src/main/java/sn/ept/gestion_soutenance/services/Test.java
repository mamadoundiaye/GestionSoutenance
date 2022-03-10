package sn.ept.gestion_soutenance.services;

import java.util.List;

import sn.ept.gestion_soutenance.entities.Evaluation;
import sn.ept.gestion_soutenance.entities.Personne;

public class Test {

    public static void main(String[] args) {
        EvaluationServiceImpl testEvaluation = new EvaluationServiceImpl();
        PersonneServiceImpl testPersonne = new PersonneServiceImpl();
        List<Evaluation> listEv = testEvaluation.listEvaluation();
        List<Personne> listP = testPersonne.listPersonne();
        System.out.println("essayons maintenant d'afficher la liste des evaluations");
        System.out.println(listEv);
        System.out.println("essayons maintenant d'afficher la liste des personnes");
        System.out.println(listP.get(0).getPrenom());

    }

}
