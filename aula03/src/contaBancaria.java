import java.time.Year;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
public class contaBancaria {
    Date hour = new Date();
    public String currentTimeString = new SimpleDateFormat("HH:mm:ss").format(hour);
    public int currentTime = Integer.parseInt(String.valueOf(currentTimeString.charAt(0)) + String.valueOf(currentTimeString.charAt(1)));
    private String nome;
    private String cpf;
    private int identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;




    public void saque (double valor){
        this.saldo = saldo - valor;
        if (saldo < valor){
            System.out.println("O Saldo não é suficiente!");
        }
    }

    public void deposito (double valor){
        this.saldo = saldo + valor;
    }

    public double retornaSaldo(){
         return this.saldo;
    }

    public void pix (double valor){
        this.saldo = saldo - valor;
        if (retornaHorario() > 19){
            System.out.println("horário não permitido!");
        }
    }

    public void transferencia (contaBancaria destino, double valor){
    }

    public int retornaHorario(){
        return this.currentTime;
    }

    public void retornaInformacoes(){
    }
}


