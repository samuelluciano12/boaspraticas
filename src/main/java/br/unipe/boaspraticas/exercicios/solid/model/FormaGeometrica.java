package br.unipe.boaspraticas.exercicios.solid.model;

import br.unipe.boaspraticas.exercicios.solid.ocp.formas.CalcularArea;

public abstract class FormaGeometrica implements CalcularArea {
    public abstract double AreaCalculada();
}