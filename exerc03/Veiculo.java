public abstract class Veiculo implements Alugavel{
    protected String placa;
    protected int ano;

    public Veiculo(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca(){
        return placa;
    }

    public int getAno(){
        return ano;
    }

    
}