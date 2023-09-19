class ContaCorrente extends Conta implements Tributavel {
    int saldo = 4300;

    public double calculaTributos() {
        return saldo * 0.1;
    }

    private int seguroDeVida(){
        return saldo - 42;
    }
}
