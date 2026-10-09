import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        do {
            numero = lerNumero(scan);

            if (numero != 0) {
                apresentarParidade(numero);
            }
        } while (numero != 0);
    }

    public static int lerNumero(Scanner scan) {
        System.out.print("Digite um número (0 para sair): ");
        return scan.nextInt();
    }

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void apresentarParidade(int numero) {
        if (ehPar(numero)) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }
}
