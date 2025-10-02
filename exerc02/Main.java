public class Main{
    public static void main(String args[]){
        Circulo circulo = new Circulo("Amarelo", 4);
        Retangulo retangulo = new Retangulo("Roxo", 4, 5);

        circulo.CalcularArea();
        retangulo.CalcularArea();

        System.out.println(circulo);
        System.out.println(retangulo);
    }
}