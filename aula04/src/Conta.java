

public class Conta {
    int saldo;
    private double sacar(double valor){
        return this.saldo - valor;
    }
    private double depositar (double valor){
        return this.saldo - valor;
    }
    private void obterSaldo(){
        System.out.println(this.saldo);
    }


}
