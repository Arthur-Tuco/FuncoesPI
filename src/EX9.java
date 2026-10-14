import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Digite um número entre 0 e 92: ");
            numero = scan.nextInt();
        }while (numero < 0 || numero > 92);

        long resultado = lerFibonacci(numero);
        System.out.println("F(" + numero + ")=" + resultado);
    }
    public static long lerFibonacci(int posicao) {
        if (posicao == 0) {
            return 0;
        }
        if (posicao == 1) {
            return 1;
        }
        long anterior = 0;
        long atual = 1;
        for (int i = 2; i <= posicao; i++) {
            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }return atual;
    }
}
