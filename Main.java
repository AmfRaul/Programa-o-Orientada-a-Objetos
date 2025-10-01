public class Main {
    public static void main(String[] args) {
        Cachorro ca = new Cachorro("Toto");
        Gato ga = new Gato("Mutsinha");

        System.out.println("Cachorro: " + ca.nome);
        ca.emitirSom();

        System.out.println("Gato: " + ga.nome);
        ga.emitirSom();
    }
}
