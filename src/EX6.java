import java.util.Scanner;

public class EX6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int menor = 0;
        boolean primerioNumero = true;

        do {
            System.out.println("Digite um numero (0 para sair): ");
            numero = scan.nextInt();

            if (numero != 0) {
                if (primerioNumero) {
                    maior = numero;
                    menor = numero;
                    primerioNumero = false;
                }else {
                    maior = maiorNumero(maior, numero);
                    menor = menorNumero(menor, numero);
                }
            }
        }while (numero != 0);
            if(primerioNumero){
                System.out.println("Nenhum número informado");
            }else {
                System.out.println("Maior número: " + maior);
                System.out.println("Menor número: " + menor);
            }
    }
    public static int maiorNumero(int atual, int novo){
        if(novo > atual){
            return novo;
        }
        return atual;
    }
    public static int menorNumero(int atual, int novo){
        if(novo < atual){
            return novo;
        }
        return atual;
    }
}
