package aula06;
import java.util.*;

public class ex03 {
    TreeMap<String, Agenda> Agenda = new TreeMap<>();

    public void contact(String nome, String numDeTelefone, String endereco, String localidade) {
        Agenda a = new Agenda(numDeTelefone, nome, endereco, localidade);
        Agenda.put(nome, a);
    }

    public Agenda searchContact(String nome) {
        return Agenda.get(nome);
    }

    public Agenda filterLocal(String localidade) {
        for (Agenda contatos : Agenda.values())
            if (contatos.localidade.equalsIgnoreCase(localidade)) {
                System.out.println(contatos.nome+", " + contatos.endereco+", " + contatos.numDeTelefone+". ");
                System.out.println();
            }

    return null;}


        public static void main (String[] args){
        ex03 listaTelefonica = new ex03();

        listaTelefonica.contact("Maria", "3868746", "naosei", "sul");
        listaTelefonica.contact("Maria", "3868746", "naosei", "oeste");
        listaTelefonica.contact("Maria", "3868746", "naosei", "leste");
        listaTelefonica.contact("Maria", "3868746", "naosei", "norte");

        listaTelefonica.filterLocal("norte");



        }




}
