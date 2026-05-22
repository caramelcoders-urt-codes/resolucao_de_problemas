import java.util.HashMap;
import java.util.Scanner;

public class PerguntasMaisFrequentes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();//tamanho do vet
            int k = sc.nextInt();//quantas vezes aceita a repeticao
            int saida = 0;

            if (n == 0 && k == 0)
                break;
            
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
            for(int val : map.values()){
                if(val >= k)
                    saida++;
            }

            System.out.println(saida);
        }
    }
}
