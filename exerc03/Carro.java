public class Carro extends Veiculo{

    public Carro(String placa, int ano){
        super(placa, ano);
    }
    @Override
    public double calcularDiaria(int dias){
        return 140.0 * dias;
    }

}