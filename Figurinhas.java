import java.util.HashSet;
import java.util.Scanner;

public class Figurinhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashSet<Integer> figurinhas = new HashSet<>();
        int saida = 0;

        int[] v = new int[m];

        for(int i = 0; i < m; i++){
            v[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++){
            if(!figurinhas.contains(v[i])){
                saida++;
                figurinhas.add(v[i]);
            }
        }

        System.out.print(n-saida);
    }
}
