public class Retangulo extends Formas{
    protected double base;
    protected double altura;
    
    public Retangulo(String cor, double base, double altura){
        super(cor);
        this.base = base;
        this.altura = altura;
        
    }
    @Override
    public double CalcularArea(){
        return base * altura;
        
    }

}