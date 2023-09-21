package ex01;

import ex01.Veiculo;

public class Carro extends Veiculo {
    double taxaPorQuilometro = 0.20;
    @Override
    public void calcularCustoViagem(int distancia) {
        double custo = taxaPorQuilometro * distancia;
        System.out.println("Você deverá pagar "  + custo + " ao motorista" );
    }
}
