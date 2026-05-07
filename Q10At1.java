import java.util.Scanner;

public class Q10At1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tempo (em segundos):");
        int tempo = scanner.nextInt();

        int horas = tempo / 3600;
        int resto = tempo % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        // Essa lógica teve ajuda da IA
        System.out.printf("Tempo: %02d:%02d:%02d\n", horas, minutos, segundos);

        scanner.close();
    }
}
