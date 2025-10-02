import java.util.List;

public class Agencia {
    public double calcularReceitaPrevista(List<Alugavel> veiculos, int dias) {
        double total = 0.0;
        for (Alugavel v : veiculos) {
            total += v.calcularDiaria(dias);
        }
        return total;
    }
}
