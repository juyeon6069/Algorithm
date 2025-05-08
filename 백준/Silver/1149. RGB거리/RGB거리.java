import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] cost = new int[N+1][3];
        int[][] dp = new int[N+1][3];
        for(int i=1; i<N+1; i++){
            for(int j=0; j<3; j++){
                cost[i][j] = sc.nextInt();
            }    
        }

        dp[1][0] = cost[1][0];
        dp[1][1] = cost[1][1];
        dp[1][2] = cost[1][2];

        for (int i = 2; i <= N; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i][2];
        }

        int answer = Math.min(Math.min(dp[N][0], dp[N][1]), dp[N][2]);
        System.out.println(answer);
    }
}
