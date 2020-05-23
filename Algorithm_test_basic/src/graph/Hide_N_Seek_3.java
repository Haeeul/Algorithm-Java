package graph;

import java.util.*;

public class Hide_N_Seek_3 {
	public static final int MAX = 1000000;
	public static int n, m;
	public static boolean[] c = new boolean[MAX];
	public static int[] d = new int[MAX];
	
	public static void bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> next_q = new LinkedList<Integer>();
		
		q.add(n);
		
		while(!q.isEmpty()) {
			int now = q.remove();
			
			for(int next : new int[] {now*2, now-1, now+1}) {
				if(next >= 0 && next <MAX) {
					if(c[next]==false) {
						c[next] = true;
						if(now*2 == next) {
							q.add(next);
							d[next] = d[now];
						}else {
							next_q.add(next);
							d[next] = d[now] + 1;
						}
					}
				}
			}
			if(q.isEmpty()) {
				q = next_q;
				next_q = new LinkedList<Integer>();
			}
		}
	}

	public static void main(String[] args) {
		//#13549_¼û¹Ù²ÀÁú3
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		c[n] = true;
		d[n] = 0;
		
		bfs();
		
		System.out.println(d[m]);
	}

}
