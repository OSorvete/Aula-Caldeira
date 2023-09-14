import java.util.Arrays;
import java.util.Scanner;
public class ex4 {
    public static void main (String[] args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = prompt.next();
        char[] array = palavra.toCharArray();
        System.out.println(Arrays.toString(array));
        int contador = 0;
        for(int i = 0;i<array.length; i++){
            contador+=1;
        }
        for(int z = contador - 1; z>=0; z--){
            System.out.println(array[z]);
        }
    }
}
