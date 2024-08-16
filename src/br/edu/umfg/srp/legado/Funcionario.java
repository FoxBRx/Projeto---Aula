package br.edu.umfg.srp.legado;

public class Funcionario {
    private TipoFuncionario tipoFuncionario;
    private String nome;
    private double salario;

    public Funcionario(TipoFuncionario tipoFuncionario, String nome, double salario) {
        this.tipoFuncionario = tipoFuncionario;
        this.nome = nome;
        this.salario = salario;
    }

    public String getSalario(){

        if (tipoFuncionario.Vendedor.equals(this.tipoFuncionario)){
            return "Nome: " + this.nome + "\nSalario Base: R$" + this.salario
                    + "\nSalario Liquido: R$" + (this.salario * 1.1);

        }

        return "Nome: " + this.nome + "\nSalario Base: R$" + this.salario
                + "\nSalario Liquido: R$" + this.salario;

    }


}
