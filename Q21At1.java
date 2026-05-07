import java.util.Scanner;

public class Q21At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu salário atual:");
        double salarioOriginal = scanner.nextDouble();
        double salarioFinal;

        if (salarioOriginal <= 1000) {
            salarioFinal = salarioOriginal * 1.20;
            System.out.println("\nApós as mudanças, o seu sálario teve um aumento de 20%.\n\nValor atual: " + salarioFinal + " R$");
        } else if (salarioOriginal <= 3000) {
            salarioFinal = salarioOriginal * 1.15;
            System.out.println("\nApós as mudanças, o seu sálario teve um aumento de 15%.\n\nValor atual: " + salarioFinal + " R$");
        } else if (salarioOriginal <= 8000) {
            salarioFinal = salarioOriginal * 1.10;
            System.out.println("\nApós as mudanças, o seu sálario teve um aumento de 10%.\n\nValor atual: " + salarioFinal + " R$");
        } else {
            salarioFinal = salarioOriginal * 1.05;
            System.out.println("\nApós as mudanças, o seu sálario teve um aumento de 5%.\n\nValor atual: " + salarioFinal + " R$");
        }
        
        scanner.close();
    }
}
