package br.edu.umfg.ocp.refatorado;

import java.util.ArrayList;

public class ProdutoRefatorado {
    private String descricao;
    private Double valor;

    private ArrayList<AbstractImpostoEstadual> impostosEstaduais = new ArrayList<AbstractImpostoEstadual>();
    private ArrayList<AbstractImpostoFederal> impostosFederais = new ArrayList<AbstractImpostoFederal>();

    public ProdutoRefatorado(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public ProdutoRefatorado(String descricao, Double valor,
                             ArrayList<AbstractImpostoFederal> impostosFederais,
                             ArrayList<AbstractImpostoEstadual> impostosEstaduais) {

        this.descricao = descricao;
        this.valor = valor;
        this.impostosEstaduais.addAll(impostosEstaduais);
        this.impostosFederais.addAll(impostosFederais);
        // Utilizar o addAll, para referenciar ao objeto criado ArrayList no construtor
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void addImpostoFederal(AbstractImpostoFederal imposto) {
       this.impostosFederais.add(imposto);
   }

   public void removeImpostoFederal(AbstractImpostoFederal imposto) {
       this.impostosFederais.remove(imposto);
   }

   public void addImpostoEstadual(AbstractImpostoEstadual imposto) {
       this.impostosEstaduais.add(imposto);
   }

   public void removeImpostoEstadual(AbstractImpostoEstadual imposto) {
       this.impostosEstaduais.remove(imposto);
   }

   public Double getValorImpostosFederais() {
       final double totalImpostos[] = {0.0};

       this.impostosFederais
               .stream() // Stream serve para percorrer o ArrayList
               .forEach(x -> {totalImpostos[0] += (this.valor / 100) * x.getAliquota();}); // Soma o valor dos impostos
       return totalImpostos[0];
   }

   public Double getValorImpostosEstaduais(TipoEstado tipoEstado) {
       double totalImpostosFinal[] = {0.0};


       // forma legada
        /*Double totalImpostos = 0.0;

        for (Integer i = 0; i < this.impostosEstaduais.size(); i++){
            if (tipoEstado.equals(this.impostosEstaduais.get(i).getTipoEstado()))
                totalImpostos += ((this.valor / 100)
                        * this.impostosEstaduais.get(i).getAliquota());
        }

        totalImpostos = 0.0;

        for (AbstractImpostoEstadual imposto : this.impostosEstaduais){
            if (tipoEstado.equals(imposto.getTipoEstado())){
                totalImpostos += ((this.valor / 100) * imposto.getAliquota());
            }
        }*/

       this.impostosEstaduais
               .stream() // Stream serve para percorrer o ArrayList
               .filter(x -> tipoEstado.equals(x.getTipoEstado())) // Filter serve para filtrar o ArrayList
               .forEach(y -> { // forEach serve para percorrer o ArrayList
                   totalImpostosFinal[0] +=
                           ((this.valor / 100) * y.getAliquota()); // Soma o valor dos impostos
               });

       return totalImpostosFinal[0];

   }

}
