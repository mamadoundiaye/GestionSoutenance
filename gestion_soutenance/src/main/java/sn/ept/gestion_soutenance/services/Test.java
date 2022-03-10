package sn.ept.gestion_soutenance.services;

import java.util.List;

import sn.ept.gestion_soutenance.entities.Evaluation;

public class Test {

    public static void main(String[] args) {
        EvaluationServiceImpl test = new EvaluationServiceImpl();
        List<Evaluation> listEv = test.listEvaluation();
        System.out.println(listEv);

    }

}
