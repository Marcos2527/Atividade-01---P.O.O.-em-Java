import java.util.Scanner;

public class Q13At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.println("Informe o número 1: ");
        numero1 = scanner.nextInt();

        System.out.println("Informe o número 2: ");
        numero2 = scanner.nextInt();

        System.out.println("Informe o número 3: ");
        numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior número é o 1° (" + numero1 + ")");
        } if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior número é o 2° (" + numero2 + ")");
        } if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("O maior número é o 3° (" + numero3 + ")");
        } else {
            if (numero1 == numero2 && numero2 == numero3) {
                System.out.println("Todos os números são iguais a: " + numero1);
            } if (numero1 == numero2) {
                System.out.println("O 1° e o 2° são iguais (" + numero1 + ")");
            } if (numero1 == numero3) {
                System.out.println("O 1° e o 3° são iguais (" + numero1 + ")");
            } else {
                System.out.println("O 2° e o 3° são iguais (" + numero2 + ")");
            }
        }

        scanner.close();
    }
}
