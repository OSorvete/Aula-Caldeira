import java.util.Scanner;

public class ex7 {
    public static void main (String[] args){
        int wage;
        int age;
        int mininumWage = 2000;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu salário");
        wage = input.nextInt();
        System.out.println("Digite sua idade");
        age = input.nextInt();

        if (age < 18 || wage < mininumWage){
            System.out.println ("Você não pode comprar um carro!");
        } else {
            System.out.println ("Bem-vindo, qual carro gostaria?");
        }

    }

}
