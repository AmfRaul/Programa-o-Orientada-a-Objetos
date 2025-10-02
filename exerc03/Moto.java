public class Moto extends Veiculo{
    public Moto(String placa, int ano){
        super(placa, ano);
    }
    @Override
    public double calcularDiaria(int dias){
        return 200.0 * dias;
    }
}