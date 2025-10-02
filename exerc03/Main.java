import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Veiculo carro1 = new Carro("ABC-1234", 2020);
        Veiculo moto1 = new Moto("XYZ-5678", 2019);
        Veiculo caminhao1 = new Caminhao("DEF-9012", 2018);

        List<Alugavel> veiculos = new ArrayList<>();
        veiculos.add(carro1);
        veiculos.add(moto1);
        veiculos.add(caminhao1);

        Agencia agencia = new Agencia();

        int dias = 5; 
        double receita = agencia.calcularReceitaPrevista(veiculos, dias);

        System.out.println("Receita prevista para " + dias + " dias: R$ " + receita);
    }
}
