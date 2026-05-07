import java.util.Scanner;

public class Q11At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a Nota 2: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Sua média final é: " + media + " Aprovado");
        } else {
            System.out.println("Sua média final é: " + media + " REPROVADO");
        }

        scanner.close();
    }
}
