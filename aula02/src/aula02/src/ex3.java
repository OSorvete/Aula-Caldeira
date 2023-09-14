import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        int guess;
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Você é um soldado espartano, Leônidas aparece em meio ao seu bando e pergunta:");
            System.out.println("Quantos soldados iremos derrotar?");
            guess = scanner.nextInt();

            if (guess > 3000) {
                System.out.println("Um pouco menos!");
            } else if (guess < 3000) {
                System.out.println("Um pouco mais!");
            } else {
                System.out.println("ISSOOOOOOO!");
                break;
            }
        }

    }
}
