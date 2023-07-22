package br.unipe.boaspraticas.exercicios.solid.sip.animais;

class Ave implements Voar {

    public void comer() {
        System.out.println("A ave está comendo.");
    }

    public void dormir() {
        System.out.println("A ave está dormindo.");
    }

    public void voar() {
        System.out.println("A ave está voando.");
    }

}
