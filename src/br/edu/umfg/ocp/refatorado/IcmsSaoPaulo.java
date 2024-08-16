package br.edu.umfg.ocp.refatorado;

public class IcmsSaoPaulo extends AbstractImpostoEstadual{

    protected IcmsSaoPaulo(String descricao, double aliquota) {
        super(descricao, aliquota);
    }

    @Override
    public TipoEstado getTipoEstado() {
        return null;
    }
}
