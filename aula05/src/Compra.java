public class Compra {
    private String nome;
    private String dataDeValidade;

    public Compra (String nome, String dataDeValidade){
        this.nome = nome;
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void retornaTudo(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de validade:" + dataDeValidade);
    }
}
