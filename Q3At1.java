import java.util.Scanner;

public class Q3At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String nome1 = scanner.nextLine();
        System.out.println("Informe a sua idade:");
        double idade1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Informe o nome do seu amigo:");
        String nome2 = scanner.nextLine();
        System.out.println("Informe a idade do seu amigo:");
        double idade2 = scanner.nextDouble();

        double media = (idade1 + idade2) / 2;

        System.out.println("A média da idade de " + nome1 + " e " + nome2 + " é: " + media);
        
        scanner.close();
    }
}
