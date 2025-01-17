package br.edu.umfg.lsp.legado;

public class AlunoEAD {

    private String ra;
    private  String nome;
    private Double notaFinal;
    private String email;
    private String senha;

    public AlunoEAD(String ra, String nome, Double notaFinal, String email, String senha) {
        this.ra = ra;
        this.nome = nome;
        this.notaFinal = notaFinal;
        this.email = email;
        this.senha = senha;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
