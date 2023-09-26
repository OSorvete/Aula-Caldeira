import java.util.Scanner;
import java.util.LinkedList;


public class ex05 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Impressao> Impressoes = new LinkedList<Impressao>();

        int percorre = 1;

        do {
            System.out.println ("Digite o nome da impressão: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o número de páginas que deseja imprimir: ");
            String numeroPaginas = scanner.nextLine();

            Impressoes.addLast(new Impressao(nome,numeroPaginas));

            System.out.println ("Deseja adicionar mais impressões? 1- SIM (Outro valor) - NÃO");
            percorre = scanner.nextInt();
            scanner.nextLine();
        } while (percorre == 1);

        Impressoes.removeFirst();

        for (Impressao item : Impressoes){
            System.out.println("Nome da sua impressão: " + item.getNome());
            System.out.println("Número de páginas da sua impressão: " + item.getNumeroPaginas());
        }
    }}
