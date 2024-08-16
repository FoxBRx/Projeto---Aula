package br.edu.umfg.srp.refatorado;

public class Estagiario extends AbstractFuncionario{

    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String calcSalario() {
        return "Nome: " + getNome() +
        "Salario Base: R$" + getSalario() +
        "Salario Final: R$" + getSalario();
    }


}
