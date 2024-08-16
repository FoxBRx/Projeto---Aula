package br.edu.umfg.srp;

import br.edu.umfg.srp.legado.Funcionario;
import br.edu.umfg.srp.legado.TipoFuncionario;
import br.edu.umfg.srp.refatorado.Estagiario;
import br.edu.umfg.srp.refatorado.Vendedor;

public class PrincipioDeResponsabilidadeUnica {
    public static void ExecutarLegado(){

        Funcionario estagiario = new Funcionario(TipoFuncionario.Estagiario, "Estagiário", 600.00);

        Funcionario vendedor = new Funcionario(TipoFuncionario.Vendedor, "Vendedor", 2500.00);

        System.out.println(estagiario.getSalario());
        System.out.println(vendedor.getSalario());


    }


    public static void ExecutarRefatorado() {

        Estagiario estagiario = new Estagiario("Estagiário", 600.00);

        Vendedor vendedor = new Vendedor("Pablo", 2500.00);

        System.out.println(estagiario.calcSalario());
        System.out.println(vendedor.calcSalario());

    }
}
