import java.util.Scanner;

public class Q4At1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de X:");
        int x = scanner.nextInt();

        System.out.println("Informe o valor de Y:");
        int y = scanner.nextInt();

        int soma = x + y;

        System.out.println("O valor da soma de X e Y é: " + soma);

        scanner.close();
    }
}