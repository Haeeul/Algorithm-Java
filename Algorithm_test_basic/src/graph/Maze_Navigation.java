package graph;

import java.util.*;

public class Maze_Navigation {
	public static int map[][];
	public static boolean visit[][];
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	public static int n, m;
	
	public static void bfs(int x, int y) {
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		
		qx.add(x);
		qy.add(y);
		
		while(!qx.isEmpty() && !qy.isEmpty()) {
			x = qx.poll();
			y = qy.poll();
			visit[x][y] = true;
			
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx >= 0 && ny >=0 && nx < n && ny < m) {
					if(map[nx][ny]==1 && visit[nx][ny]==false) {
						qx.add(nx);
						qy.add(ny);
						visit[nx][ny] = true;
						map[nx][ny] = map[x][y]+1;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		//#2178¹ø_¹Ì·Î Å½»ö
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		map = new int[100][100];
		visit = new boolean[100][100];
		
		for(int i =0; i<n; i++) {
			String input = sc.next();
			for(int j=0; j<m; j++) {
				map[i][j] = input.charAt(j)-'0';
			}
		}
		
		bfs(0,0);
		System.out.print(map[n-1][m-1]);
	}

}
