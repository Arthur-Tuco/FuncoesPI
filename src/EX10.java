import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Menu de escolhas abaixo: ");
            System.out.println("1: Calcular média");
            System.out.println("2: Mostrar tabuada de 1 a 10");
            System.out.println("3: Verificar primo");
            System.out.println("4: Calcular fatorial");
            System.out.println("0: Sair");
            escolha = scan.nextInt();
        }while (escolha != 0);

        switch (escolha){
            case 1:
                double n1 = EX3.lerNota(scan, 1);
                double n2 = EX3.lerNota(scan, 2);
                double media = EX3.calcularMedia(n1, n2);
                EX3.apresentarResultado(media);
                break;

            case 2:
                System.out.println("Digite um número inteiro: ");
                int numeroTabuada = scan.nextInt();
                EX5.apresentarTabuada(numeroTabuada, 1, 10);
                break;
            case 3:
                int numeroPrimo;
                do {
                    System.out.println("Digite um número entre -10000 e 10000: ");
                    numeroPrimo = scan.nextInt();
                    if (numeroPrimo < -10000 || numeroPrimo > 10000) {
                        System.out.println("Número inválido!");
                    }
                }while (numeroPrimo < -10000 || numeroPrimo > 10000);
    }
}
}
