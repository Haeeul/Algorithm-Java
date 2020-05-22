package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tomato {
	public static int n, m, day;
	public static int box[][];
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	
	static class Toma{
		int x;
		int y;
		int day;
		
		public Toma(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}
	
	public static void bfs() {
		Queue<Toma> q = new LinkedList<Toma>();
		day = 0;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(box[i][j]==1)
					q.offer((new Toma(i,j,0)));
			}
		}
		
		while(!q.isEmpty()) {
			Toma toma = q.poll();
			day = toma.day;
			
			for(int i=0; i<4; i++) {
				int nx = toma.x + dx[i];
				int ny = toma.y + dy[i];
				
				if(nx >= 0 && ny >=0 && nx < m && ny < n) {
					if(box[nx][ny]==0) {
						box[nx][ny]=1;
						q.add(new Toma(nx,ny,day+1));
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		//#7576번_토마토
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		box = new int[1000][1000];
		
		for(int i =0; i<m; i++) {
			for(int j=0; j<n; j++) {
				box[i][j] = sc.nextInt();
			}
		}
		
		bfs();
		
		if(checkTomato()) 
			System.out.println(day);
		else 
			System.out.println(-1);
	}
	
	static boolean checkTomato() {
		 for(int i=0; i<m; i++) {
	            for(int j=0; j<n; j++) {
	                if(box[i][j] == 0)
	                    return false;
	            }
	        }
	 
	     return true;
	}

}
