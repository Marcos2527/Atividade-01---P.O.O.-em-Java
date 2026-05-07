import java.util.Scanner;

public class Q16At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nível da sua glicose ");
        double glicose = scanner.nextDouble();

        if (glicose <= 100){
            System.out.println("Classificação: NORMAL");

        } if (glicose > 100 && glicose <= 140){
            System.out.println("Classificação: ELEVADO");
        
        } else {
            System.out.println("Classificação: DIABETES");
        }
        scanner.close();
    }
}