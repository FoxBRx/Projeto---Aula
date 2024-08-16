package br.edu.umfg.lsp;

import br.edu.umfg.lsp.legado.AlunoEAD;
import br.edu.umfg.lsp.legado.AlunoPresencial;
import br.edu.umfg.lsp.refatorado.AbstractAluno;
import br.edu.umfg.lsp.refatorado.AlunoEADRefatorado;
import br.edu.umfg.lsp.refatorado.AlunoPresencialRefatorado;

public class PrincipioDeSubstituicaoDeLiskov {
    public static void executarLegado() {

        AlunoPresencial alunoPresencial = new AlunoPresencial("001", "TSTE 1",  8.7);
        AlunoEAD alunoEAD = new AlunoEAD("0002", "TESTE 2",  9.3, "teste@.com","123Mudar@");

        System.out.println("RA | Nome | Nota Final");
        System.out.println(alunoPresencial.getRa() + " | " + alunoPresencial.getNome() + " | " + alunoPresencial.getNotaFinal());
        System.out.println(alunoEAD.getRa() + " | " + alunoEAD.getNome() + " | " + alunoEAD.getNotaFinal());

    }

    public static void executarRefatorado() {
        AlunoPresencialRefatorado alunoPresencialRefatorado = new AlunoPresencialRefatorado("001", "TESTE 1",  8.7);
        AlunoEADRefatorado alunoEADRefatorado = new AlunoEADRefatorado("0002", "TESTE 2",  9.3, "teste@.com", "123Mudar@");

        System.out.println("RA | Nome | Nota Final");
        imprimir(alunoPresencialRefatorado);
        imprimir(alunoEADRefatorado);
    }



    private static void imprimir (AbstractAluno aluno){
        System.out.println(aluno.getRa() + " | " + aluno.getNome() + " | " + aluno.getNotaFinal());
    }



}
