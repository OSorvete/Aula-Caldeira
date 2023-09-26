public class Reserva {
    String nome;
    String cpf;
    String dataDeEntrada;
    String dataDeSaida;

    public Reserva(String nome, String cpf, String dataDeEntrada, String dataDeSaida){
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeSaida = dataDeSaida;
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataDeEntrada(String dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeSaida(String dataDeSaida) {
        this.dataDeSaida = dataDeSaida;
    }

    public String getDataDeSaida() {
        return dataDeSaida;
    }
}
