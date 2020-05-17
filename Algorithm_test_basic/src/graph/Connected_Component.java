package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Connected_Component {
	static ArrayList<Integer>[] a;
	static boolean[] c;
	static int ans = 0;
	
	public static void dfs(int x) {
		c[x] = true;
		
		for(int y : a[x]) {
			if(c[y] == false) {
				dfs(y);
			}
		}
	}

	public static void main(String[] args) {
		//#11724번_연결 요소의 개수
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
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
		
		for(int i =1; i<=n; i++) {
			if(c[i]==false) {
				dfs(i);
				ans++;
			}
		}
		
		System.out.print(ans);
	}
}
