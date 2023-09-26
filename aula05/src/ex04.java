import java.util.ArrayList;
import java.util.Scanner;

public class ex04 {
    public static void main (String[]  args){
        {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Compra> ListadeCompras = new ArrayList<Compra>();
            String nome;
            String dataDeValidade;
            int percorre = 1;

            do
            {
                System.out.println("Digite o nome da compra");
                nome = scanner.nextLine();
                System.out.println("Digite a data de validade da compra");
                dataDeValidade = scanner.nextLine();

                ListadeCompras.add(new Compra(nome, dataDeValidade));

                System.out.println("Deseja continuar inserindo compras? (1) Sim | (Outros valores) Não");
                percorre = scanner.nextInt();
                scanner.nextLine();
            }while (percorre == 1);

            for (Compra item : ListadeCompras) {
                item.retornaTudo();
            }

            System.out.println("Deseja excluir uma compra? (1) Sim | (Outros valores) Não");
            int excluir = scanner.nextInt();

            if(excluir == 1){
                System.out.println("Digite o número da tarefa que deseja excluir:");
                for(int i=0; i<ListadeCompras.size(); i++){
                    System.out.println((i+1) + ". " + ListadeCompras.get(i).getNome());
                }

                int indice = scanner.nextInt();
                if(indice > 0 && indice <= ListadeCompras.size()){
                    ListadeCompras.remove(indice-1);
                    System.out.println("Tarefa excluída com sucesso!");
                } else {
                    System.out.println("Número de tarefa inválido!");
                }
            }

            for (Compra item : ListadeCompras) {
                item.retornaTudo();
            }
        }
    }
    }
