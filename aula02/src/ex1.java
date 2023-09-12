import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        double number1;
        double number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me dê dois números.");
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Qual operacão você deseja realizar?");
        System.out.println("Multiplicacão - Digite 1");
        System.out.println("Divisão - Digite 2");
        System.out.println("Subtracão - Digite 3");
        System.out.println("Adicão - Digite 4");
        System.out.println("Cancelar operacão - Digite n");
        String option1 = scanner.nextLine();

        switch(option1){
            case "1" -> System.out.println("O resultado é: "  + number1 * number2);
            case "2" -> System.out.println("O resultado é: " + number1/number2);
            case "3" -> System.out.println("O resultado é: "  + (number1 - number2));
            case "4" -> System.out.println ("O resultado é: " + (number1 + number2));
            case "n" -> System.out.println ("Operacão CANCELADA.");
        }
    }
}
