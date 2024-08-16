package br.edu.umfg.ocp.refatorado;

public class IcmsSantaCatarina extends AbstractImpostoEstadual {

    public IcmsSantaCatarina() {
        super("ICMS Santa Catarina", 0.18);
    }

    @Override
    public TipoEstado getTipoEstado() {
        return TipoEstado.SantaCatarina;
    }
}
