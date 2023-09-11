import java.util.Scanner;

public class ex5 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hora");
        int hour = input.nextInt();
        System.out.println("Minuto");
        int minute = input.nextInt();
        System.out.print("Segundo");
        int seconds = input.nextInt();

        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || seconds < 0 || seconds > 59 ){
            System.out.println ("?");
        } else {
            int secondsmidnight = ( hour * 3600) + (minute * 60) + seconds;
            int secondstillmidnight = (24 * 3600) - secondsmidnight;
            System.out.println("Segundos desde a meia noite: " + secondsmidnight);
            System.out.println ("Segundos para a meia noite: " + secondstillmidnight);
        } input.close();
    }
}
