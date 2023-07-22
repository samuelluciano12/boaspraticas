package br.unipe.boaspraticas.exercicios.solid.lsp.formas;

class Rectangle extends Shape implements Formas{
    private int width;
    private int height;
    public void getArea(double width,double height) {

    }
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public void draw() {
        // Desenhar um retângulo
    }


}
