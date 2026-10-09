public class EX1 {
    public static void main(String[] args) {

        System.out.println("Rotina: ");

        tomarBanho();
        escovarDente();
        refeicao("Café da manhã");
        dirigir("Casa", "Trabalho");

        refeicao("Almoço");
        escovarDente();

        dirigir("Trabalho", "Casa");
        tomarBanho();
        escovarDente();
    }

    public static void tomarBanho() {
        System.out.println("\nTomar banho: ");
        System.out.println("1. Entrar no chuveiro");
        System.out.println("2. Usar sabonete e xampu");
        System.out.println("3. Enxaguar e enxugar");
    }

    public static void escovarDente() {
        System.out.println("\nEscovar dente: ");
        System.out.println("Colocar pasta de dente na escova");
        System.out.println("Escovar os dentes e a língua");
        System.out.println("Enxaguar a boca");
    }

    public static void refeicao(String tipoRefeicao) {
        System.out.println("\n" + tipoRefeicao);
        System.out.println("Servir a refeição");
        System.out.println("Comer");
        System.out.println("Limpar a mesa");
    }

    public static void dirigir(String origem, String destino) {
        System.out.println("\nDirigir: ");
        System.out.println("Entrar no carro na origem (" + origem + ")");
        System.out.println("Dirigir até destino (" + destino + ")");
        System.out.println("Estacionar carro");
    }
}