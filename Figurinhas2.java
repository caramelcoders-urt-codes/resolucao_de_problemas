import java.util.Scanner;

public class Figurinhas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de testes: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Digite a quantidade de figurinhas (F1): ");
            int f1 = sc.nextInt();
            System.out.println("Digite a quantidade de figurinhas (F2): ");
            int f2 = sc.nextInt();
            int maiorDivisor = calcularMDC(f1,f2);
            System.out.println(maiorDivisor);
        }
    }
    public static int calcularMDC(int num1, int num2){
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
