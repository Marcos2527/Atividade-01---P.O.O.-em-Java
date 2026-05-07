import java.util.Scanner;

public class Q10At1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempo, segundos, minutos;
        double horas;

        System.out.println("Informe o tempo (em segundos): ");
        tempo = scanner.nextInt();

        segundos = tempo;
        minutos = segundos / 60;
        horas = minutos / 60;

        System.out.println("Tempo em segundos: " + segundos + " seg.");
        System.out.println("Tempo em minutos: " + minutos + " min.");
        System.out.println("Tempo em horas: " + String.format("%.2f", horas) + " h.");
        System.out.println("(Valores aproximados)");

        scanner.close();
    }
}
