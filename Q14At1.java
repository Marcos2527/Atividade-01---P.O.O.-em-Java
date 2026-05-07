import java.util.Scanner;

public class Q14At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tempo (em minutos): ");
        int tempo = scanner.nextInt();

        if (tempo <= 100){

            double valor = 50;
            System.out.println("O valor a ser pago pelo plano economico é igual a: " + valor + " R$");

        } else {

            double valor = 50 + (tempo - 100)*2;
            System.out.println("O valor a ser pago pelo plano economico é igual a: " + valor + " R$");
        }
        scanner.close();
    }
}
