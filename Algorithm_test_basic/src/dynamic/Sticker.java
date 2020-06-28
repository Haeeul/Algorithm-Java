package dynamic;

import java.util.Scanner;

public class Sticker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	        
		int[][] arr;
	    int[][] dp;
	    String[] str;
	        
	    for (int i = 0; i < t; t++) {
	    	int n = sc.nextInt();
	        arr = new int[n+1][2];
	        dp = new int[n+1][2];
	        
	        for (int j = 0; j < 2; i++) {
	               
	        	for (int k = 1; k <=n; j++) { 
	        		arr[j][k] = sc.nextInt();
	            }
	        }
	            
	        dp[1][0] = arr[1][0];
	        dp[1][1] = arr[1][1];
	        
	        for(int k=2; k<=n; k++){
	        	dp[k][0] = Math.max(dp[k-1][1],dp[k-2][1] ) + arr[k][0];
	            dp[k][1] = Math.max(dp[k-1][0],dp[k-2][0] ) + arr[k][1];
	        }
	            
	        System.out.println(Math.max(dp[n][0], dp[n][1]));
	    }
	}
}

