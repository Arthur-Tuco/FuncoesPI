import java.util.Scanner;

public class Teste01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("\n1 - Calcular média");
            System.out.println("2 - Mostrar tabuada de 1 a 10");
            System.out.println("3 - Verificar primo");
            System.out.println("4 - Calcular fatorial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    double nota1 = EX3.lerNota(scan, 1);
                    double nota2 = EX3.lerNota(scan, 2);
                    double media = EX3.calcularMedia(nota1, nota2);
                    EX3.apresentarResultado(media);
                    break;
                case 2:
                    System.out.print("Digite um número inteiro: ");
                    int numeroTabuada = scan.nextInt();
                    EX5.apresentarTabuada(numeroTabuada, 1, 10);
                    break;
                case 3:
                    int numeroPrimo;
                    do {
                        System.out.print("Digite um número entre -10000 e 10000: ");
                        numeroPrimo = scan.nextInt();
                        if (numeroPrimo < -10000 || numeroPrimo > 10000) {
                            System.out.println("Número inválido. Tente novamente.");
                        }
                    } while (numeroPrimo < -10000 || numeroPrimo > 10000);

                    if (EX7.ehPrimo(numeroPrimo)) {
                        System.out.println("É primo!");
                    } else {
                        System.out.println("Não é primo!");
                    }
                    break;
                case 4:
                    int numeroFatorial;
                    do {
                        System.out.print("Digite um número entre 0 e 20: ");
                        numeroFatorial = scan.nextInt();
                        if (numeroFatorial < 0 || numeroFatorial > 20) {
                            System.out.println("Número inválido. Tente novamente.");
                        }
                    } while (numeroFatorial < 0 || numeroFatorial > 20);

                    System.out.println(numeroFatorial + "! = " + EX8.lerFatorial(numeroFatorial));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 0);

        scan.close();
    }
}
