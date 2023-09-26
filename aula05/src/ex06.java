import java.util.LinkedList;
import java.util.Scanner;

public class ex06 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Reserva> Reservas = new LinkedList<Reserva>();

        int percorre = 1;

        do {
            System.out.println ("Digite o seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o seu cpf: ");
            String cpf = scanner.nextLine();
            System.out.println("Digite seu dia de entrada: ");
            String dataDeEntrada = scanner.nextLine();
            System.out.println("Digite seu dia de saída:");
            String dataDeSaida = scanner.nextLine();

            Reservas.addLast(new Reserva(nome,cpf,dataDeEntrada,dataDeSaida));

            System.out.println ("Deseja pegar outra reserva? 1 - sim (Outro valor) - não");
            percorre = scanner.nextInt();
        } while (percorre == 1);

        System.out.println("Deseja cancelar sua reserva? 1 - sim (outro valor) - não");
        int excluirReserva = scanner.nextInt();

        if (excluirReserva == 1){
            System.out.println("Digite o número da reserva que deseja exluir.");
            for(int i=0; i<Reservas.size(); i++){
                System.out.println((i+1) + ". " + Reservas.get(i).getDataDeEntrada());
            }

            int indice = scanner.nextInt();
            if(indice > 0 && indice <= Reservas.size()){
                Reservas.remove(indice-1);
                System.out.println("Reserva cancelada com sucesso!");
            } else {
                System.out.println("Reserva inválida.");
            }
        }
        System.out.println("Lista de reservas:");
        for (Reserva item : Reservas) {
            System.out.println("Nome: " + item.getNome());
            System.out.println("Data de entrada: " + item.getDataDeEntrada());
            System.out.println("CPF: " + item.getCpf());
        }
    }
        }


