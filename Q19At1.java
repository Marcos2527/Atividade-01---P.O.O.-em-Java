import java.util.Scanner;

public class Q19At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("  TABELA:\n1 - 5.00 R$\n2 - 3.50 R$\n3 - 4.80 R$\n4 - 8.90 R$\n5 - 7.32 R$\n\nInforme o produto:");
        int escolha = scanner.nextInt();

        System.out.println("Informe a quantidade do produto:");
        int quantidade = scanner.nextInt();

        switch (escolha) {
            case 1:
                double valorA = quantidade * 5.00;
                System.out.println("\nO valor a ser pago é: " + String.format("%.2f", valorA) + " R$");
                break;

            case 2:
                double valorB = quantidade * 3.50;
                System.out.println("\nO valor a ser pago é: " + String.format("%.2f", valorB) + " R$");
                break;

            case 3:
                double valorC = quantidade * 4.80;
                System.out.println("\nO valor a ser pago é: " + String.format("%.2f", valorC) + " R$");
                break;

            case 4:
                double valorD = quantidade * 8.90;
                System.out.println("\nO valor a ser pago é: " + String.format("%.2f", valorD) + " R$");
                break;

            case 5:
                double valorE = quantidade * 7.32;
                System.out.println("\nO valor a ser pago é: " + String.format("%.2f", valorE) + " R$");
                break;

            default:
                System.out.println("\nProduto ou quantidade invalida(s)!");
                break;
        }
        scanner.close();
    }
}
