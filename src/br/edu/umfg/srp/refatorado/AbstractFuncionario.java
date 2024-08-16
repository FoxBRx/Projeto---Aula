package br.edu.umfg.srp.refatorado;

public abstract class AbstractFuncionario {
    private String nome;
    private  double salario;

    protected AbstractFuncionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract String calcSalario();

    protected  String getNome(){
        return this.nome;
    }

    protected  double getSalario(){
        return this.salario;
    }
}
