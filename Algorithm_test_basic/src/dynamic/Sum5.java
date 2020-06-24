package dynamic;

import java.util.Scanner;

public class Sum5 {

	public static void main(String[] args) {
		//#15990번 1,2,3 더하기5
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[][] dp = new long[1000001][4];
		
		dp[1][1] = 1;
		dp[2][2] = 1;
		dp[3][3] = 1;
		
		for(int i=1; i<=1000000; i++) {
			if(i>1) {
				dp[i][1] = (dp[i-1][2] + dp[i-1][3])%1000000009;
			}
			
			if(i>2) {
				dp[i][2] = (dp[i-2][1] + dp[i-2][3])%1000000009;
			}
			
			if(i>3) {
				dp[i][3] = (dp[i-3][1] + dp[i-3][2])%1000000009;
			}
		}
		
		
		for(int i=0; i<n; i++) {
			int k = sc.nextInt();
			long ans = (dp[k][1] + dp[k][2] + dp[k][3]) % 1000000009;
			System.out.println(ans);
		}
	}

}
