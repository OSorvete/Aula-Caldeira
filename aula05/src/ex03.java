import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ex03 {
    public static void main (String[] args){

        List<String> ListaDeTarefas = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************");
        System.out.println("LISTA DE TAREFAS");
        System.out.println("1 - ADICIONAR TAREFA");
        System.out.println("2 - REMOVER TAREFA");
        System.out.println("3 - ENCERRAR");
        System.out.println("*******************");
        String option = scanner.nextLine();


        switch(option){
            case "1" -> {
                System.out.println("Selecione o que gostaria de adicionar");
                String add = scanner.nextLine();
                ListaDeTarefas.add(add);
            }
            case "2" -> {
                System.out.println("Selecione o que quer remover da lista");
                String remove = scanner.nextLine();
                ListaDeTarefas.remove(remove);ß
            }
            case "3" -> scanner.close();
            default -> System.out.println("INVÁLIDO!!");
        }

    }
}
