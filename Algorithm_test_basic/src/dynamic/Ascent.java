package dynamic;

import java.util.Scanner;

public class Ascent {
	static final int MOD = 10007;

	public static void main(String[] args) {
		// #11057번 오르막 수
		long ans = 0;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[][] dp = new long[n+1][10];
		
		for(int i=0; i<=9; i++) {
			dp[1][i] = 1;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<10; j++) {
				for(int k=0; k<=j; k++) {
					dp[i][j] += dp[i-1][k];
				}
				dp[i][j] %= MOD;
			}
		}
		
		for(int i=0; i<10; i++) {
			ans += dp[n][i];
		}
		
		System.out.println(ans%MOD);
	}

}
