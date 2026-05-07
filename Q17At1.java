import java.util.Scanner;

public class Q17At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a distância do primeiro lançamento: (valor em Metros)");
        double dist1 = scanner.nextDouble();

        System.out.println("Informe a distância do segundo lançamento: (valor em Metros)");
        double dist2 = scanner.nextDouble();

        System.out.println("Informe a distância do terceiro lançamento: (valor em Metros)");
        double dist3 = scanner.nextDouble();

        if (dist1 >= dist2 && dist1 >= dist3) {
            System.out.println("A maior distância foi: " + dist1 + " Metros");
        } 
        else if (dist2 >= dist3) {
            System.out.println("A maior distância foi: " + dist2 + " Metros");
        } 
        else {
            System.out.println("A maior distância foi: " + dist3 + " Metros");
        }

        scanner.close();
    }
}