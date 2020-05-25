package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import graph.tomato.Toma;

public class algospot {
	public static int n, m;
	public static int map[][];
	public static int ans[][];
	public static boolean visited[][];
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	
	static class Spot{
		int x;
		int y;
		
		public Spot(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void bfs() {
		Queue<Spot> q = new LinkedList<Spot>();
		q.add(new Spot(0,0));
		visited[0][0] = true;
		
		
		while(!q.isEmpty()) {
			Spot spot = q.poll();
			int x = spot.x;
			int y = spot.y;
			
			for(int i=0; i<4; i++) {
				int nx = spot.x + dx[i];
				int ny = spot.y + dy[i];
				
				if(nx < 0 || ny < 0 || nx >= n || ny >= m || visited[nx][ny])
					continue;
				if(map[nx][ny]==0){
					ans[nx][ny] = ans[x][y];
					q.add(new Spot(nx,ny));
				}else {
					ans[nx][ny]=ans[x][y]+1;
					q.add(new Spot(nx,ny));
				}
				visited[nx][ny]=true;
			}
		}
	}

	public static void main(String[] args) {
		//#1261¹ø_¾Ë°í½ºÆÌ
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		map = new int[n][m];
		ans = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String input = sc.next();
			for(int j=0; j<m; j++) {
				map[i][j] = input.charAt(j)-'0';
			}
		}
		
		bfs();
		
		System.out.println(ans[n-1][m-1]);
	}

}
