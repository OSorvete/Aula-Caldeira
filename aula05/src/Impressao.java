public class Impressao {
    private String nome;
    private String numeroPaginas;

    public Impressao (String nome, String numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroPaginas(String numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

}
