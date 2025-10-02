public class Caminhao extends Veiculo{
    public Caminhao(String placa, int ano){
        super(placa, ano);
    }
    @Override
    public double calcularDiaria(int dias){
        return 300.0 * dias;
    }
}