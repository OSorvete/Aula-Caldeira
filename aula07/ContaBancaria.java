package aula07;

public class ContaBancaria {
    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double saca(double Valor) throws SaldoInsuficienteException {
        if (Valor > this.saldo) {
            throw new SaldoInsuficienteException("NÃO HÁ SALDO SUFICIENTE!");
        } else {
            this.saldo -= Valor;
        }
        return this.saldo;
    }
}