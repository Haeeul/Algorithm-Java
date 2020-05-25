package graph;

import java.util.*;

public class algospot {
	public static int n, m;
	public static int map[][];
	public static int visited[][];
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int result = 0;
	
	static class Spot implements Comparable<Spot>{
		int x;
		int y;
		int cnt;
		
		public Spot(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}

		@Override
		public int compareTo(Spot o) {
			// TODO Auto-generated method stub
			return this.cnt < o.cnt ? -1 : 1;
		}
	}
	
	public static void bfs() {
		PriorityQueue<Spot> q = new PriorityQueue<Spot>();
		q.add(new Spot(0,0,0));
		visited[0][0] = 0;
		
		while(!q.isEmpty()) {
			Spot spot = q.poll();
			
			if(spot.x==n-1 && spot.y==m-1) {
				result = spot.cnt;
				return;
			}
			
			for(int i=0;i<4;i++) {
                int nx = spot.x+dx[i];
                int ny = spot.y+dy[i];
                
                if(nx<0||ny<0||nx>=n||ny>=m)continue;
                
                if(visited[nx][ny]>visited[spot.x][spot.y]+map[nx][ny]) {
                	visited[nx][ny] = visited[spot.x][spot.y]+map[nx][ny];
                	q.add(new Spot(nx,ny,visited[nx][ny]));
                }
            }
        }
	}

	public static void main(String[] args) {
		//#1261¹ø_¾Ë°í½ºÆÌ
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		
		map = new int[n][m];
		visited = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				visited[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i=0; i<n; i++) {
			String input = sc.next();
			for(int j=0; j<m; j++) {
				map[i][j] = input.charAt(j)-'0';
			}
		}
		
		bfs();
		
		System.out.println(result);
	}

}
