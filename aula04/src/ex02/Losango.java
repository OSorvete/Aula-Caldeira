package ex02;

import ex02.FormaGeometrica;

public class Losango extends FormaGeometrica {

    private double diagonalMaior;
    private double diagonalMenor;

    public double calcularArea() {
        return (diagonalMaior * diagonalMenor)/2;
    }
}
