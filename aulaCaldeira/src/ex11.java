import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra/frase:");
        String phraseOrWord = scanner.nextLine().toLowerCase();
        int vogals = 0;
        for (int i = 0; i < phraseOrWord.length(); i++) {
             char caractere = phraseOrWord.charAt(i);
        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
            vogals++;
        }
        System.out.println("temos " + vogals + " vogais nessa palavra/frase" );
        scanner.close();
    }
}}
