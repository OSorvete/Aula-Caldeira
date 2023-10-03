package aula07;
import java.util.Scanner;


public class ex05 {

    public static void main (String[] args) throws IdadeInvalida {
        try{
            int idade = ChecaIdade();
            System.out.println(idade);
        } catch(IdadeInvalida Error){
            System.out.println(Error);
        }

} private static int ChecaIdade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();
        if (idade == 0 || idade < 0 || idade > 150){
            throw new IdadeInvalida("Idade INVÁLIDA");}
        return idade;
    }}
