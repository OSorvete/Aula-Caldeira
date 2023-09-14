import java.util.Scanner;
import java.util.Arrays;
public class ex5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Digite uma palavra");
        String string = scanner.next();
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length / 2; i++){
            System.out.println(array[i]);
        }
    }
}
