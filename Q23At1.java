import java.util.Scanner;

public class Q23At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da coordenada X:");
        double x = scanner.nextDouble();

        System.out.println("Informe o valor da coordenada Y:");
        double y = scanner.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("O ponto se encontra na Origem");
        } if (x == 0) {
            System.out.println("O ponto se encontra na Reta Y");
        } if (x == 0) {
            System.out.println("O ponto se encontra na Reta X");
        } 

         else {
            if (y > 0) {
                if (x > 0) {
                    System.out.println("O ponto se encontra no 1° quadrante");
                } else {
                    System.out.println("O ponto se encontra no 2° quadrante");
                }
            } else {
                if (x < 0) {
                    System.out.println("O ponto se encontra no 3° quadrante");
                } else {
                    System.out.println("O ponto se encontra no 4° quadrante");
                }
            }
        }

        scanner.close();
    }
}