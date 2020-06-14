package dynamic;

import java.util.Scanner;

public class Tiling {
	static int[] d;

	public static void main(String[] args) {
		// #11726번_2xn 타일링
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		d = new int[n+1];
		
		System.out.println(topDown(n));
		sc.close();
	}
	
	public static int topDown(int n) {
		if(n==0|| n==1)
			return 1;
		if(d[n] > 0)
			return d[n];
		
		d[n] = topDown(n-2) + topDown(n-1);
		d[n] %= 10007;
		
		return d[n];
	}
	
	public static int bottomUp(int n) {
		d[0] = 1;
		
		if(n > 0)
			d[1] = 1;
		
		for(int i=2; i<=n; i++) {
			d[i] = d[i-2] + d[i-1];
			d[i] %= 10007;
		}
		
		return d[n];
	}

}
