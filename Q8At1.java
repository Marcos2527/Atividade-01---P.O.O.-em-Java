import java.util.Scanner;

public class Q8At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a diatância total percorrida: (em KM)");
        Double distancia = scanner.nextDouble();

        System.out.println("Total de combustível gasto: (em L)");
        Double combustivel = scanner.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.println("O consumo médio de combustível é: " + String.format("%.3f", consumoMedio) + " (valor aproximado)");


        scanner.close();
    }
}
