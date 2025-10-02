public class Circulo extends Formas{
    protected double raio;
    protected double PI;

    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
        this.PI = 3.1416;

    }
    @Override
    public double CalcularArea(){
        return PI * (raio*raio);
    }
}