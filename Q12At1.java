import java.util.Scanner;

public class Q12At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do coeficiente A: ");  
        double a = scanner.nextDouble();

        System.out.print("Informe o valor do coeficiente B: ");
        double b = scanner.nextDouble();

        System.out.print("Informe o valor do coeficiente C: ");
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);

        // Eu me lembro do conteúdo professor, "ou" = //
        if (delta < 0 || a == 0) {
            System.out.println("Não há raízes reais nessa equação");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Valor da primeira raiz = " + String.format("%.2f", x1));
            System.out.println("Valor da segunda raiz = " + String.format("%.2f", x2));
        }

        scanner.close();
    }
}
