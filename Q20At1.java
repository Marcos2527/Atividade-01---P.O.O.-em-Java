import java.util.Scanner;

public class Q20At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Informe o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.println("Informe o segundo número: ");
        numero2 = scanner.nextInt();

        // Essa logica foi a IA que fez...
        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("\nOs números são multiplos");
        } else {
            System.out.println("\nOs números não são múltiplos");
        }

        scanner.close();
    }
}

