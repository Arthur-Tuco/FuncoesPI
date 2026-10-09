import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1 = lerNota(scan, 1);
        double n2 = lerNota(scan, 2);
        double media = calcularMedia(n1, n2);

        apresentarResultado(media);
    }

    private static double lerNota(Scanner scan, int numeroNota) {
        double nota;

        while (true) {
            System.out.print("Digite a " + numeroNota + "ª nota (entre 0 e 10): ");
            nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                return nota;
            }

            System.out.println("A nota deve estar entre 0 e 10. Tente novamente.");
        }
    }

    private static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    private static void apresentarResultado(double media) {
        System.out.println("Média: " + media);
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Em recuperacao");
        }
    }
}
