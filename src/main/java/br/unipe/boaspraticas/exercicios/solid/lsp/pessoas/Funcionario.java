package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

public class Funcionario extends Pessoa implements FazerSom {
    private double salario;

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    // Sobrescrevendo o método fazerSom() na classe Funcionario

    public void som(String texto) {

    }

    // Método específico da classe Funcionario
    public void calcularSalario() {
        // Lógica para calcular o salário do funcionário
    }
}
