import java.util.Scanner;

public class Q1At1 {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Informe o valor da largura:");
        double largura = Scanner.nextDouble();

        System.out.println("Informe o valor do comprimento:");
        double comprimento = Scanner.nextDouble();

        System.out.println("Informe o valor do metro quadrado: ");
        double metroQuadrado = Scanner.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.println("° Area do terreno = " + String.format("%.2f", area));
        System.out.println("° Preco do terreno = " + String.format("%.2f", preco) + " R$");

        Scanner.close();
    }
}
