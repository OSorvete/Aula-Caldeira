import java.util.Scanner;

public class ex8 {
    public static void main (String[] args){
        int option;
        Scanner input = new Scanner(System.in);

        System.out.println("Olá, por favor, insira uma das opções que mais se encaixam com você.");
        System.out.println("1- Idoso");
        System.out.println("2- Gestante");
        System.out.println("3- Deficiente");
        System.out.println("4- Nenhuma das alternativas.");
        option = input.nextInt();

        switch(option){
            case 1,2,3 -> System.out.println("Você pode entrar na fila prioriária!");
            case 4 -> System.out.println("Você não pode entrar na fila prioritária.");
            default -> System.out.println ("**OPÇÃO INVÁLIDA**");
        }

    }

}
