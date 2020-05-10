package bruteforce_N_M;

import java.util.Arrays;
import java.util.Scanner;

public class NM_8 {
	static boolean[] c = new boolean[10];
	static int [] a = new int[10];
	static int [] num;
	
	public static void go(int index,int start, int n, int m) {
		if(index==m) {
			for(int i =0; i<m; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i =start; i<n; i++) {
			c[i] = true;
			a[index] = num[i];
			go(index+1, i, n, m);
			c[i] = false;
		}
	}

	public static void main(String[] args) {
		//#15657¹ø_N°ú M_8¹ø
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		num =  new int[n];
		
		for(int i =0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(num);
		go(0,0,n,m);
	}

}
