import java.util.Scanner;
import java.util.Arrays;

public class ex01 {
    public static void main (String[] args){
        int[] n = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, escolha 5 números");
        for(int i=0;i<5;i++){
            n[i] = scanner.nextInt();}
        int sum = Arrays.stream(n).sum();
        int media = sum/n.length;
        System.out.println("A média dos números é " + media);
    }}
