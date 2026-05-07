import java.util.Scanner;

public class Q2At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da base: \n");
        double base = scanner.nextDouble();

        System.out.print("Informe o valor da altura: \n");
        double altura = scanner.nextDouble();

        double perimetro = (base * 2) + (altura * 2);
        double area = base * altura;
        double diagonal = Math.hypot(base, altura);

        System.out.println("° Valor do Perimetro = " + String.format("%.4f", perimetro));
        System.out.println("° Valor da Área = " + String.format("%.4f", area));
        System.out.println("° Valor da Diagonal = " + String.format("%.4f", diagonal) + " (Valor aproximado)");

        scanner.close();
    }
}
