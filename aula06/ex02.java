package aula06;
import java.util.HashMap;
import java.util.Map;


public class ex02 {
    public static void main (String[] args) {
        HashMap<String, Integer> Pessoas = new HashMap<>();
        Pessoas.put("Maria", 17);
        Pessoas.put("José", 67);
        Pessoas.put("Clarissa", 50);
        Pessoas.put("César", 33);
        Pessoas.put("Joel", 68);

        String nomebuscado = "César";

        if(Pessoas.containsKey(nomebuscado)){
            int idade = Pessoas.get(nomebuscado);
            System.out.println(nomebuscado + "tem" + idade + "anos de idade.");
        } else System.out.println("Esse nome não está na lista!");

        for (Map.Entry<String, Integer> be : Pessoas.entrySet()){
            if (be.getValue() > 60)
                System.out.print( be.getKey() + " está na meia idade\n");
            else if (be.getValue() < 60)
                System.out.println( be.getKey() + " não está na meia idade.\n");}}}