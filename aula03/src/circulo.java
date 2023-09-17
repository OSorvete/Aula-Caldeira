public class circulo {
        double raio;

        public double calcularArea(){
        return double areaDoCirculo = 3.14 * (raio * raio);
        }
        public double calcularCircunferencia(){
            return double circunferenciaDoCirculo = 2 * 3.14 * (raio * raio);
        }

        public double definirRaio(double novoRaio){
            if (raio < 0) System.out.println("Valor inválido!");
            return this.raio = novoRaio;
        }


    }

}
