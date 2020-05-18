package graph;

import java.util.*;

public class numbering {
	static int[][]map;
	static int n;
	static int cnt;
	static boolean[][]visited;
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static ArrayList dan = new ArrayList();
	
	private static int dfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >=0 && nx < n && ny < n){
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx,ny);
                    cnt++;
                }
            }
        }
        return cnt;
    }	

	public static void main(String[] args) {
		//#2667번_단지번호붙이기
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		map = new int[n][n];
		visited = new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			String input = sc.next();
			for(int j=0; j<n; j++) {
				map[i][j] = input.charAt(j)-'0';
			}
		}
		
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
					if(map[i][j] == 1 && !visited[i][j])
					{
							cnt=1;
							dfs(i, j);
							dan.add(cnt);
					}
			}
		}
		
		Collections.sort(dan);
		System.out.println(dan.size());
		
		for(int i =0; i<dan.size(); i++) {
			System.out.println(dan.get(i));
			
		}
	}

}
