import java.util.Scanner;

public class Q5At1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de uma unidade do produto:");
        double quantidade = scanner.nextDouble();

        System.out.println("Informe a quantidade comprada:");
        double unidade = scanner.nextDouble();

        System.out.println("Informe o valor pago (R$):");
        double valorPago = scanner.nextDouble();

        double troco = valorPago -(unidade * quantidade);

        if (troco > 0){
            System.out.println("Troco: " + troco + " R$");
        }else{
            System.out.println("Ainda falta pagar: " + troco + " R$");
        }

        scanner.close();
  }
}