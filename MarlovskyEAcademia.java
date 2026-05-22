import java.util.Scanner;

public class MarlovskyEAcademia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();
        int r = sc.nextInt();

        int nNovo = n-(p - 1)*(r - 1);

        if (nNovo < p) {
            System.out.println(0);
            return;
        }

        int[][] dp = new int[nNovo + 1][p + 1];
        int mod = 100000007;

        for (int i = 0; i <= nNovo; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= Math.min(i, p); j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % mod;
            }
        }

        System.out.println(dp[nNovo][p]);
    }
}