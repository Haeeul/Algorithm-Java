package bruteforce_N_M;

import java.util.Arrays;
import java.util.Scanner;

public class NM_9 {
	static int[] c;
	static int [] a = new int[10];
	
	public static void go(int index, int n, int m) {
		if(index==m) {
			for(int i =0; i<m; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i =0; i<n; i++) {
			if(c[i] > 0) {
				c[i] -= 1;
				a[index] = c[i];
				go(index+1, n, m);
				c[i] += 1;
			}
		}
	}

	public static void main(String[] args) {
		//#15663¹ø_N°ú M_9¹ø
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		c =  new int[n];
		
		for(int i =0; i<n; i++) {
			c[i] = sc.nextInt();
		}
		sc.close();
		
		go(0,n,m);
	}

}
