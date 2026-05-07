import java.util.Scanner;

public class Q9At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a medida A:");
        Double a = scanner.nextDouble();
        System.out.println("Informe a medida B:");
        Double b = scanner.nextDouble();
        System.out.println("Informe a medida C:");
        Double c = scanner.nextDouble();

        Double areaQuadrado = a * a;
        Double areaTriangulo = ( a * b ) / 2;
        Double areaTrapezio = ( ( a * b ) * c) / 2;


        System.out.println("Área do Triângulo Retangulo: " + String.format("%.4f", areaTriangulo) );
        System.out.println("Área do Quadrado: " + String.format("%.4f", areaQuadrado));
        System.out.println("Área do Trapézio: " + String.format("%.4f", areaTrapezio));
        System.out.println("(Valores aproximados)");

        scanner.close();
    }
}
