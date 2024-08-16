package br.edu.umfg.ocp.refatorado;

public class AbstractImpostoFederal {

    private String descricao;
    private double aliquota;

    public AbstractImpostoFederal(String descricao, double aliquota) {
        this.descricao = descricao;
        this.aliquota = aliquota;
    }

    public double getAliquota() {
        return aliquota;
    }
}
