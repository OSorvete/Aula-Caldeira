import java.util.Scanner;
import java.util.Arrays;

public class ex02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[10];
        System.out.println("Adivinhacão de números!");
        System.out.println("Digite um número de 1 a 100.");
        int guess = scanner.nextInt();
        for(int i=0;i<10;i++){
            n[i] = (int) (Math.random() * 100);}
        if(Arrays.asList(n).contains(guess)){
            System.out.println("Acertou!");
        }
        else {
            System.out.println("Errou!");
        }
    }
}
