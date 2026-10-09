import java.util.Scanner;

public class EX2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.next();
        System.out.println("Digite o turno do aluno: ");
        String turno = scanner.next();

        saudacao(nome, turno);
    }
    public static void saudacao(String nome, String turno){
        switch (turno.toLowerCase().trim()){
            case "manha":
            case "manhã":
                System.out.println("Bom dia, " + nome + "!");
                break;
            case "tarde":
                System.out.println("Boa tarde, " + nome + "!");
                break;
            case "noite":
                System.out.println("Boa noite, " + nome + "!");
                break;
            default:
                System.out.println("Turno inválido");
                break;
        }
    }
}
