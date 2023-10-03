package aula07;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MensagemDeErro {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números inteiros");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println(n1);
        System.out.println(n2);

        } catch(InputMismatchException e){
            System.out.println("FORMATO INVÁLIDO.");
        }

    }
}
