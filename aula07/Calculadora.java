package aula07;
public enum Calculadora implements calculavel {

    Subtracao{
    public int calcular( int n1, int n2){
        return n1 - n2;
    }},

    Adicao{
     public int calcular(int n1, int n2){
        return n1 + n2;
    }},

    Divisao{
    public int calcular( int n1, int n2){
        return n1/n2;
    }},

    Multiplicacao{
    public int calcular( int n1, int n2){
        return n1 * n2;
    }}
}
