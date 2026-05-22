import java.util.Arrays;
import java.util.Scanner;

public class MarlusEaFila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = sc.nextInt();
        int[] vetor = new int[dia];

        for (int i = 0; i < dia; i++) {
            vetor[i] = sc.nextInt();
        }

        Arrays.sort(vetor);

        for (int i = 0; i < dia; i++) {
            if (i > 0)
                System.out.print(" ");

            System.out.print(vetor[i]);
        }

        sc.close();
    }
}