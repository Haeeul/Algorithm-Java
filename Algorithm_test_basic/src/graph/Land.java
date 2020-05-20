package graph;

import java.util.Collections;
import java.util.Scanner;

public class Land {
	static int[][] map;
    static int[][] visited;
    static int[] dx = { 0, 0, 1, -1, 1, -1, 1, -1 };
    static int[] dy = { -1, 1, 0, 0, -1, 1, 1, -1 };
    
	private static void dfs(int x, int y, int count, int w, int h) {
        visited[x][y] = count;

        for(int i=0; i<dx.length; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >=0 && nx < h && ny < w){
                if(map[nx][ny] == 1 && visited[nx][ny]==0){
                    dfs(nx,ny,count,w,h);
                }
            }
        }
    }

	public static void main(String[] args) {
		//#4963¹ø_¼¶ÀÇ °³¼ö
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			if(w==0 && h==0) break;
			
			map = new int[h][w];
			visited = new int[h][w];
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			int count = 0;
			
			for(int i = 0; i<h; i++){
				for(int j = 0; j<w; j++){
						if(map[i][j] == 1 && visited[i][j]==0)
						{
								dfs(i,j,++count,w,h);
						}
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

}
