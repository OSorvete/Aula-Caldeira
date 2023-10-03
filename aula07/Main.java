package aula07;
import java.util.Locale;
import java.util.Scanner;

public class Main {
enum diaDaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO;

} public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Qual dia da semana?");
        String option = scanner.nextLine();
        option = option.toUpperCase();

        switch(option){
            case "SEGUNDA" -> System.out.println("ekwhfu");
            case "TERCA" -> System.out.println("ekfjr");
            case "QUARTA" -> System.out.println("frknfrk");
            case "QUINTA" -> System.out.println("erkfrejk");
            case "SEXTA" -> System.out.println("fjrkfe");
            case "SABADO" -> System.out.println("efkjhfr");
            case "DOMINGO" -> System.out.println("ejfrueifh");
            default -> System.out.println("INVALIDO");
        }

    }
}


