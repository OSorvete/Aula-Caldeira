import java.util.Scanner;
public class ex9 {
    public static void main (String args[]){
        int currentDate = 2023;
        int birthDate;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        birthDate = input.nextInt();
        System.out.println("Você nasceu em: " + (currentDate - birthDate));



    }
}

