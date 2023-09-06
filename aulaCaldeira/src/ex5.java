public class ex5 {
    public static void main(String args[]){
        int idade = 19;

        if(idade < 16){
            System.out.println("não pode votar");
        } else if (idade <= 17 || idade > 65) {
            System.out.println("O voto é facultativo");
        } else
            System.out.println("O voto é obrigatório");
    }


}
