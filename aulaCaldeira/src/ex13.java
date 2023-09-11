import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual número você quer fatorar?");
        number = input.nextInt();
        if (number < 0){
            System.out.println("número inválido");
        }
        int numberFactor = number * number;
        System.out.println ("O seu número fatorado é " + numberFactor);
    }

}
