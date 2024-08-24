import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] dp = new int[41][2];
        dp[0][0] = 1; // fibonacci(0) 호출 시 0이 호출되는 횟수
        dp[0][1] = 0; // fibonacci(1) 호출 시 1이 호출되는 횟수
        dp[1][0] = 0; // fibonacci(1) 호출 시 0이 호출되는 횟수
        dp[1][1] = 1; // fibonacci(1) 호출 시 1이 호출되는 횟수

        for(int i=2; i<=40; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n][0] + " " + dp[n][1]);
        }
    }
}
