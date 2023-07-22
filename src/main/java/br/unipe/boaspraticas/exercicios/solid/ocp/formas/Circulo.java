package br.unipe.boaspraticas.exercicios.solid.ocp.formas;

import br.unipe.boaspraticas.exercicios.solid.model.FormaGeometrica;

public class Circulo extends FormaGeometrica {
    private double raio;

    // Construtor, getters e setters omitidos

    public double AreaCalculada(){
        return Math.PI * raio * raio;
    }

}
