import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        do{
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();
        } while (numero < -10000 || numero > 10000);

        boolean primo = ehPrimo(numero);

        if (primo) {
            System.out.println("É primo!");
        }else{
            System.out.println("Não é primo!");
        }
    }
    public static boolean ehPrimo(int numero){
        if  (numero < 2){
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
