import java.util.Scanner;
import java.util.Locale;

public class Q7At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe o valor por hora de trabalho: (em R$)");
        double valorHora = scanner.nextDouble(); 

        System.out.println("Informe a quantidade de horas trabalhadas:");
        int quantidadeHora = scanner.nextInt();

        double pagamento = (double) quantidadeHora * valorHora;

        System.out.println("Com base no seu trabalho, determinamos que o seu pagamento será: " + pagamento + " R$" + " funcionário " + nome);
        scanner.close();
    }
}
