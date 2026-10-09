import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = lerNumero(scan);
        int comeco;
        int fim;

        do {
            comeco = lerLimite(scan, "inicial");
            fim = lerLimite(scan, "final");

            if (comeco < 0 || fim < 0 || comeco > fim) {
                System.out.println("Limites inválidos. Eles devem ser não negativos, e o inicial deve ser menor ou igual ao final.");
            }
        } while (comeco < 0 || fim < 0 || comeco > fim);

        apresentarTabuada(numero, comeco, fim);
    }

    public static int lerNumero(Scanner scan) {
        System.out.print("Digite um número inteiro: ");
        return scan.nextInt();
    }

    public static int lerLimite(Scanner scan, String tipo) {
        System.out.print("Digite o limite " + tipo + ": ");
        return scan.nextInt();
    }

    public static void apresentarTabuada(int numero, int comeco, int fim) {
        for (int multiplicador = comeco; multiplicador <= fim; multiplicador++) {
            System.out.println(numero + " x " + multiplicador + " = " + numero * multiplicador);
        }
    }
}

