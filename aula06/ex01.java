package aula06;
import java.util.Stack;
import java.util.Scanner;

public class ex01 {
    public static void main (String[] args){
        Stack<Livro> pilhaDeLivros = new Stack<>();

        Livro livro01 = new Livro();
        livro01.setNome("Maria");
        livro01.setCategoria("Maria");

        Livro livro02 = new Livro();
        livro02.setNome("Fernanda");
        livro02.setCategoria("Fernanda");

        pilhaDeLivros.push(livro01);
        pilhaDeLivros.push(livro02);


        Scanner scanner = new Scanner(System.in);
        System.out.println("[1] - Exibir o nome dos livros");
        System.out.println("[2] - Exibir a categoria dos livros");
        System.out.println("[3] - Remover o primeiro livro da lista");
        System.out.println("[4] - Esvaziar lista de livros");
        System.out.println("[5] - Sair do sistema");
        int option = scanner.nextInt();

        switch (option){
            case 1 ->{
                for (Livro livro : pilhaDeLivros){
                System.out.println("Título: " + livro.getNome());
            }}
            case 2 ->{
                for (Livro livro: pilhaDeLivros){
                    System.out.println("Categoria: " + livro.getCategoria());
                }}
            case 3 ->{
                System.out.println("Elemento removido:"  + pilhaDeLivros.pop());
                System.out.println(pilhaDeLivros);
            }
            case 4 -> {
                while(!pilhaDeLivros.empty()){
                    pilhaDeLivros.pop();
                }
                System.out.println(pilhaDeLivros.empty());
            }
            case 5 ->{
                System.out.println("Você escolheu ENCERRAR.");
                scanner.close();
            }
            default -> {
                System.out.println("INVALIDO");
            }
        }





    }
}
