package br.edu.scl.ifsp.ads.cadastroEduardoLucas;

public class Formulario {
    private String nomeCompleto;
    private String telefone;
    private String email;
    private boolean inscritoListaEmail;
    private String sexo;
    private String cidade;
    private String uf;

    public Formulario(String nomeCompleto, String telefone, String email, boolean inscritoListaEmail,
                      String sexo, String cidade, String uf) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.inscritoListaEmail = inscritoListaEmail;
        this.sexo = sexo;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Nome: " + nomeCompleto +
                "\nTelefone: " + telefone +
                "\nEmail: " + email +
                "\nInscrito na lista de emails: " + (inscritoListaEmail ? "Sim" : "Não") +
                "\nSexo: " + sexo +
                "\nCidade: " + cidade +
                "\nUF: " + uf;
    }
}
