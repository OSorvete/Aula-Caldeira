package ex02;

import ex02.FormaGeometrica;

public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;
    public double calcularArea() {
        return (base * altura)/2;
    }
}
