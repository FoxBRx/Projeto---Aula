package br.edu.umfg.srp.refatorado;

public class Vendedor extends AbstractFuncionario {
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String calcSalario() {
        return "Nome: " + getNome() +
                "Salario Base: R$" + getSalario() +
                "Salario Final: R$" + (getSalario() * 1.1);
    }
}
