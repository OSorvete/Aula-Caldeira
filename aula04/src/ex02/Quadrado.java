package ex02;

public class Quadrado extends FormaGeometrica{
    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
