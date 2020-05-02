package bruteforce;

import java.util.Scanner;

public class leave {
	public static int[] T;
	public static int[] P;
	public static int n;
	public static int max = 0;
	
	public static void go(int day, int sum) {
		if(day <= n) {
			if(sum>max) {
				max = sum;
			}
		}
		
		if(day>n-1) {
			return;
		}
		
		go(day+1,sum);
		go(day+T[day], sum+P[day]);
	}

	public static void main(String[] args) {
		//#14501Ήψ_Επ»η
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		T = new int[n];
		P = new int[n];
		
		for(int i =0; i<n; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}
		
		go(0,0);
		
		System.out.println(max);
	}

}
