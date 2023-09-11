import java.util.Scanner;
public class ex10 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos graus está hoje?");
        int celsius = scanner.nextInt();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " graus são " + fahrenheit + " Fahrenheit");
    }
}
