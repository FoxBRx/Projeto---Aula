package br.edu.umfg.isp;

import br.edu.umfg.isp.legado.ContaCorrente;
import br.edu.umfg.isp.legado.ContaPoupanca;

public class PrincipioDeSegregacaoDeInterfaces {
    public static void executarLegado(){
        ContaCorrente contaCorrente = new ContaCorrente("0001", "TESTE 1 ");
        ContaPoupanca contaPoupanca = new ContaPoupanca("0002", "TESTE 2 ");

        contaCorrente.creditar(1000.00);
        contaCorrente.debitar(55.70);

        contaPoupanca.creditar(300.00);
        contaPoupanca.debitar(13.50);


        System.out.println("cc :" + contaCorrente.getSaldo());
        System.out.println("CP :" + contaPoupanca.getSaldo());

    }
    public static void executarRefatorado(){

    }
}


