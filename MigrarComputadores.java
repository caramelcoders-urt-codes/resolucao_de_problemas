import java.util.Scanner;

public class MigrarComputadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 0; i < v; i++) {
            if (v > c) {
                if (c > 0) {
                    System.out.print(1);
                    c--;
                } else
                    System.out.print(0);
            } else {
                if (c % v != 0) {
                    System.out.print(c / v + 1);
                    c--;
                } else {
                    System.out.print(c / v);
                }
            }
            if (i != v - 1)
                System.out.print(" ");
        }
    }
}
