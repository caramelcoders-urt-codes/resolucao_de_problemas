import java.util.Scanner;

public class ProblemaAbelha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Forneça a profundidade N da colmeia
        int n = sc.nextInt();

        System.out.println(n == 1 ? 1 : (n - 1) * 3);
    }
}
