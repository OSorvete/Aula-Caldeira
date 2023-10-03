package aula07;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex04 {
    public static void main (String[] args){
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("MENU");
                System.out.println("1- DIVISAO");
                System.out.println("2- MULTIPLICACAO");
                System.out.println("3- ADICAO");
                System.out.println("4- SUBTRACAO");
                int option = scanner.nextInt();
                System.out.println("Digite dois números inteiros");
                int n1 = scanner.nextInt();
                int n2 = scanner.nextInt();

                Calculadora calculadora = null;

                switch (option){
                    case 1 -> {
                        calculadora = calculadora.Divisao;
                    break;}
                    case 2 -> { calculadora =calculadora.Multiplicacao;
                    break;}
                    case 3 -> { calculadora = calculadora.Adicao;
                    break;}
                    case 4 -> {
                        calculadora = calculadora.Subtracao;
                    break;}
                    default -> System.out.println("OPERACÃO INVÁLIDA");
                } try {
                    double Resultado = calculadora.calcular(n1, n2);
                    System.out.println(Resultado);
                } catch (NumberFormatException Error) {
                    System.out.println("Erro:" + Error);;
                }


            } catch(InputMismatchException e){
                System.out.println("FORMATO INVÁLIDO.");
            }}}


