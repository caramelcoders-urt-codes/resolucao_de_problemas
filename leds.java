import java.util.Objects;
import java.util.Scanner;

public class leds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            String N = sc.nextLine();
            String[]g = N.split("");
            int cont = 0;
            for(int j = 0; j < g.length; j++){
                if(Objects.equals(g[j], "1")){
                    cont+=2;

                } else if(Objects.equals(g[j], "2") || Objects.equals(g[j], "5") ||
                        Objects.equals(g[j], "3")){
                    cont+=5;
                } else if(Objects.equals(g[j], "4")){
                    cont+=4;
                } else if(Objects.equals(g[j], "9")|| Objects.equals(g[j], "0")||
                        Objects.equals(g[j], "6")){
                    cont+=6;
                } else if(Objects.equals(g[j], "7")){
                    cont+=3;
                } else {
                    cont+=7;
                }
            }
            System.out.println(cont+" leds");
        }
        sc.close();
    }
}
