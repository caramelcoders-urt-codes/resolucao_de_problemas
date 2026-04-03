import java.util.Scanner;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial = 0, horaFinal = 0;
        int minutoInicial = 0, minutoFinal = 0;
        int hInicialMinutos = 0, hFinalMinutos = 0;
        int totalHoras = 0, totalMinutos = 0;
        int duracaoMin = 0;

        horaInicial = sc.nextInt();
        minutoInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        minutoFinal = sc.nextInt();

        hInicialMinutos = horaInicial*60+minutoInicial;
        hFinalMinutos = horaFinal*60+minutoFinal;

        if(hInicialMinutos >= hFinalMinutos) {
            duracaoMin = 24*60-hInicialMinutos+hFinalMinutos;
            totalHoras = duracaoMin/60;
            totalMinutos = duracaoMin%60;
        } else if (hInicialMinutos < hFinalMinutos) {
            duracaoMin = hFinalMinutos - hInicialMinutos;
            totalHoras = duracaoMin/60;
            totalMinutos = duracaoMin%60;
        }

        System.out.printf("O JOGO DUROU %d HORAS(S) E %d MINUTO(S)\n", totalHoras, totalMinutos);
    }
}
