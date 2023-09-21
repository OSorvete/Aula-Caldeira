package ex02;

import ex02.FormaGeometrica;

public class Circulo extends FormaGeometrica {

    private double raio;
    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }
}
