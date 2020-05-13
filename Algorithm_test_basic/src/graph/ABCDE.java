package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class ABCDE {
	static ArrayList<Integer>[] a;
	static boolean[] c;
	static int m;
	static boolean ans;
	
	public static void dfs(int x, int cnt) {
		if(cnt == m) {
			ans = true;
			return;
		}
		
		c[x] = true;
		
		for (int y : a[x]) {
			if (c[y] == false) {
				dfs(y, cnt+1);
			}
			if(ans) {
				return;
			}
		 }
		
		c[x] = false;
	}

	public static void main(String[] args) {
		//#13023_ABCDE
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		m = sc.nextInt();
		
		a = (ArrayList<Integer>[]) new ArrayList[n+1];
		
		for(int i =0; i<=n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i<m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			a[x].add(y);
			a[y].add(x);
		}
		
		c = new boolean[n+1];
		
		for(int i =0; i<n; i++) {
			dfs(i,1);
			if(ans) break;
		}
		
		if(ans) {
			System.out.print("1");
		}
		else {
			System.out.print("0");
		}
	}

}
