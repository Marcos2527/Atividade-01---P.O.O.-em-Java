import java.util.Scanner;

public class Q22At1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a hora inicial do jogo:");
        int horaInicial = sc.nextInt();

        System.out.println("Informe a hora final do jogo:");
        int horaFinal = sc.nextInt();

        // Essa logica também foi a IA que fez...
        if (horaInicial < 0 || horaInicial > 23 || horaFinal < 0 || horaFinal > 23) {
            System.out.println("Hora invalida, foi superior a 1 ou superior a 24");
        } else {
            int duracao;

            if (horaFinal > horaInicial) {
                duracao = horaFinal - horaInicial;
            } else {
                duracao = 24 - horaInicial + horaFinal;
            }

            System.out.println("O jogo durou: " + duracao + " horas");
        }

        sc.close();
    }
}