package ex03;

import ex03.Conta;

public class ContaPoupança extends Conta implements Tributavel {
   int saldo;
    public double calculaTributos() {
        return 0;
    }
}
