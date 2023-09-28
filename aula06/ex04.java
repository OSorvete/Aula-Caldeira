package aula06;
import java.util.*;


public class ex04 {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> produtos = new LinkedHashMap<>();

        produtos.put("morango", 8.50);
        produtos.put("laranja", 3.50);
        produtos.put("abacaxi", 2.90);
        produtos.put("melão", 7.80);
        produtos.put("abobora", 4.50);

        System.out.println("---LISTA DE PRODUTOS---");
        for (Map.Entry<String, Double> entry: produtos.entrySet()){
            String produto = entry.getKey();
            Double preco = entry.getValue();
            System.out.println("Produto: " + produto);
            System.out.println("Preco: " + preco);
        }
    }
}
