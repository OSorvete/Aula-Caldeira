import java.util.Scanner;

public class ex2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite um número maior: ");
        int biggerNumber = scanner.nextInt();

        System.out.println ("Digite um número menor: ");
        int smallestNumber = scanner.nextInt();

        for( int i = smallestNumber; i <= biggerNumber; i++){
            System.out.println("os números compreendidos entre um " + "intervalo fornecido"+ i);
        }
    }
}
