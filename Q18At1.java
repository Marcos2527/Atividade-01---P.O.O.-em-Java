import java.util.Scanner;

public class Q18At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual escala será usada (C/F):");
        String escala = scanner.nextLine();

        switch (escala) {
            case "C":
                System.out.print("Escala escolhida: C\nInforme a temperatura em Celsius: ");
                double c1 = scanner.nextDouble();
                double f1 = (c1 * 9.0 / 5.0) + 32.0;
                System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", f1);
                break;

            case "F":
                System.out.print("Escala escolhida: F\nInforme a temperatura em Fahrenheit: ");
                double f2 = scanner.nextDouble();
                double c2 = (5.0 / 9.0) * (f2 - 32.0);
                System.out.printf("Temperatura equivalente em Celsius: %.2f", c2);
                break;

            default:
                System.out.println("Escala inválida!");
                break;
        }
        scanner.close();
    }
}
