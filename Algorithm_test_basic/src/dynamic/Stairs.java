package dynamic;

import java.util.Scanner;

public class Stairs {
	static final int MOD = 1000000000;

	public static void main(String[] args) {
		// #10844번 쉬운 계단 수
		long ans = 0;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[][] dp = new long[n+1][10];
		
		for(int i=0; i<=9; i++) {
			dp[1][i] = 1;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<10; j++) {
				if(j==0) {
					dp[i][j] = dp[i-1][1] % MOD;
				}
				
				else if(j==9) {
					dp[i][j] = dp[i-1][8] % MOD;
				}
				
				else {
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD;
				}
			}
		}
		
		
		for(int i=0; i<9; i++) {
			ans += dp[n][i];
		}
		
		System.out.println(ans%MOD);
	}

}
