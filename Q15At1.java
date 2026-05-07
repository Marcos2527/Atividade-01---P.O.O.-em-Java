import java.util.Scanner;

public class Q15At1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantidade, unidade, valorPago, troco;

        System.out.println("Informe o valor de uma unidade do produto:");
        quantidade = scanner.nextDouble();

        System.out.println("Informe a quantidade comprada:");
        unidade = scanner.nextDouble();

        System.out.println("Informe o valor pago (R$):");
        valorPago = scanner.nextDouble();

        troco = valorPago -(unidade * quantidade);

        if (troco > 0){
            System.out.println("Troco: " + troco + " R$");
        }else{
            System.out.println("Ainda falta pagar: " + troco + " R$");
        }

        scanner.close();
  }
}