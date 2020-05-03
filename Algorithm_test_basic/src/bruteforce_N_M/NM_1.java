package bruteforce_N_M;

import java.util.Scanner;

public class NM_1 {
	static boolean[] c = new boolean[10];
	static int [] a = new int[10];
	
	public static void go(int index, int n, int m) {
		if(index==m) {
			for(int i =0; i<m; i++) {
				System.out.print(a[i]+" ");
//				if(i != m-1) {
//					System.out.print(" ");
//				}
			}
			System.out.println();
			return;
		}
		
		for(int i =1; i<=n; i++) {
			if(c[i]) continue;
			c[i] = true;
			a[index] = i;
			go(index+1, n, m);
			c[i] = false;
		}
	}

	public static void main(String[] args) {
		//#15649¹ø_N°ú M_1¹ø
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		go(0,n,m);
	}

}
