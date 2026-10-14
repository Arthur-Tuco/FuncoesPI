import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Menu de escolhas abaixo: ");
            System.out.println("1: Calcular média");
            System.out.println("2: Mostrar tabuada de 1 a 10");
            System.out.println("3: Verificar primo");
            System.out.println("4: Calcular fatorial");
            System.out.println("0: Sair");
            escolha = sc.nextInt();
        }while (escolha != 0);

        switch (escolha){
            case 1:
            double n1 = lerNota(sc, 1);
            double n2 = lerNota(sc, 2);
            double media = calcularMedia(n1, n2);

            apresentarResultado(media);

            case 2:
                (escolha == 2) {}
            case 3:}
    }
    public static double lerNota(Scanner sc, int numeroNota) {
        double nota;
        while (true) {
            System.out.print("Digite a " + numeroNota + "ª nota (entre 0 e 10): ");
            nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                return nota;
            }

            System.out.println("A nota deve estar entre 0 e 10. Tente novamente.");
        }
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
