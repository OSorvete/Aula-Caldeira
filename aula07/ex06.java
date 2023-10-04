package aula07;

public class ex06 {
    public static void main(String[] args) {
        try {
            ContaBancaria conta01 = new ContaBancaria(200);
            conta01.saca(1000);
            System.out.println(conta01.saldo);
        } catch (SaldoInsuficienteException Error) {
            throw new RuntimeException(Error);
        }
    }
}