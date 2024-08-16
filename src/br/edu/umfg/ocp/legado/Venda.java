package br.edu.umfg.ocp.legado;

import java.util.ArrayList;

public class Venda {

    private TipoDeVenda tipoVenda;

    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Venda(TipoDeVenda tipoVenda){
        this.tipoVenda = tipoVenda;
    }

    public void addProduto (Produto produto){
        this.produtos.add(produto);
    }

    public  void removeProduto(Produto produto){
        this.produtos.remove(produto);
    }

    @Override
    public String toString() {
        String result = "TIPO DE VENDA: " + this.tipoVenda + "\n";
        Double totalVenda = 0.0;

        for(Produto p : this.produtos){
            totalVenda += p.getValor();
            result += p.getDescricao() + " | R$" + p.getValor() + "\n";
        }
        result += "TOTAL DA VENDA: R$" + totalVenda + "\n";
        result+= calcularImposto(totalVenda);
        return result;
    }

    private String calcularImposto(Double totalVenda) {

        totalVenda += totalVenda * 0.165; // PIS
        totalVenda += totalVenda * 0.765; // ICMS

        if (TipoDeVenda.Parana.equals(this.tipoVenda)) {
            totalVenda += totalVenda * 0.19;
        } else if (TipoDeVenda.SaoPaulo.equals(tipoVenda)) {
            totalVenda += totalVenda * 0.18;
        } else if (TipoDeVenda.SantaCatarina.equals(tipoVenda)) {
            totalVenda += totalVenda * 0.17;
        }

        return "TOTAL VENDA COM IMPOSTO: R$" + totalVenda;
    }

}
