import java.util.Scanner;
public class ex12 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Converta seu dólar!");
        System.out.println("Quantos dólares você deseja converter?");
        double dolar = scanner.nextDouble();
        System.out.println("Qual a taxa de câmbio hoje em dia?");
        double tax = scanner.nextDouble();
        double convertedMoney = dolar* tax;
        System.out.println("Seu dinheiro em reais vale " + convertedMoney);
    }

}
