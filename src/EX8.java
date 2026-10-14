import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        do {
            System.out.println("Digite um numero entre 0 e 20: ");
            numero = scan.nextInt();
        }while(numero < 0 || numero > 20);

        long resultado = lerFatorial(numero);
        System.out.println(numero + "!= " + resultado);
    }
    public static long lerFatorial(int numero) {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
