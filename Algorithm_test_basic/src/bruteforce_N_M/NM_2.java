package bruteforce_N_M;

import java.util.Scanner;

public class NM_2 {
	static boolean[] c = new boolean[10];
	static int [] a = new int[10];
	
	public static void go(int index,int start, int n, int m) {
		if(index==m) {
			for(int i =0; i<m; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i =start; i<=n; i++) {
			if(c[i]) continue;
			c[i] = true;
			a[index] = i;
			go(index+1, i+1, n, m);
			c[i] = false;
		}
	}

	public static void main(String[] args) {
		//#15650¹ø_N°ú M_2¹ø
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		go(0,1,n,m);
	}
}
