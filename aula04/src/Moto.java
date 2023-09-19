public class Moto extends Veiculo{
    double taxaPorQuilometro = 0.15;
    @Override
    public void calcularCustoViagem(int distancia) {
        double custo = taxaPorQuilometro * distancia;
        System.out.println("Você deve pagar " + custo + "ao motorista");
    }
}
