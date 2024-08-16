package br.edu.umfg.ocp.legado;

public class Produto {
    private String descricao;
    private double preco;

    public Produto(String descricao, Double valor){
        this.descricao = descricao;
        this.preco = valor;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public double getValor(){
        return this.preco;
    }
}
