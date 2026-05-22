import java.util.Scanner;

public class CampoDeAboboras {
    public static void main (String[] args) {

        int n = 0, m = 0, q = 0, ai = 0, aj = 0, bi = 0, bj = 0, soma = 0;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();

        int [][] matriz = new int [n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matriz [i][j] = sc.nextInt();
            }
        }
        int [] v = new int [q];
        for(int k = 0; k < q; k++) {
            ai = sc.nextInt();
            aj = sc.nextInt();
            bi = sc.nextInt();
            bj = sc.nextInt();


            for(int i = ai-1; i < bi; i++) {
                for(int j = aj-1; j < bj; j++) {
                    soma += matriz[i][j];
                }
            }
            v [k] = soma;
            soma = 0;

        }

        for(int k = 0; k < q; k++) {
            System.out.println(v[k]);
        }
    }
}
