import java.util.Scanner;

public class Q6At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do raio do círculo:");
        double raio = scanner.nextDouble();

        double area = raio * raio * 3.14159;

        System.out.println("O vaor da área do círculo é: " + area);

        scanner.close();
    }
}