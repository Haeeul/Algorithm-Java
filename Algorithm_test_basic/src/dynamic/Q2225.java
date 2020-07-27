package dynamic;

import java.util.Scanner;

public class Q2225 {
	static final int MOD = 1000000000;

	public static void main(String[] args) {
		// #2225번 합분해
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[][] dp = new long[201][201];
		
		for(int i = 0; i<=200; i++) {
			dp[i][0] = 1;
			dp[1][i] = 1;
		}
		
		for(int i = 1; i<=200; i++) {
			dp[2][i] = i +1;
		}
		
		for(int i = 3; i<=200; i++) {
			for(int j = 1; j<=200; j++) {
				for(int z = 0; z<=j; z++) {
					dp[i][j]+= dp[i-1][j-z]%MOD;
				}
			}
		}
		System.out.println(dp[k][n]%MOD);
	}

}
