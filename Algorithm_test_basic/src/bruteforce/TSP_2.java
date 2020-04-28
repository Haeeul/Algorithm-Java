package bruteforce;

import java.util.*;

public class TSP_2 {
	public static boolean next_permutation(int[] a) {
		int i = a.length-1;
		
		while(i>0 && a[i]<=a[i-1]) {
			i--;
		}
		
		if(i <=0) return false;
		
		int j = a.length-1;
		
		while(a[j]<=a[i-1]){
			j--;
		}
		
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		
		i = a.length-1;
		
		while(i<j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		//#10971번_외판원 순회2
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w [][] = new int[n][n];
 
        for(int i=0; i<w.length; i++)
            for(int j=0; j<w.length; j++)
                w[i][j] = sc.nextInt();
 
        int [] d = new int[n];
        
        for(int i=0; i<n; i++) {
            d[i] = i;
        }
        
        int ans = Integer.MAX_VALUE;
        
        do {
            boolean ok = true; // 올바른 경로인지 체크
            int sum = 0;
            for (int i=0; i<n-1; i++) { 
                if (w[d[i]][d[i+1]] == 0) {
                    ok = false;
                } else {
                    sum += w[d[i]][d[i+1]];
                }
            }
            if (ok && w[d[n-1]][d[0]] != 0) { 
            	sum+=w[d[n-1]][d[0]];
                if (ans > sum) {
                    ans = sum;
                }
            }
        } while(next_permutation(d));
 
        System.out.println(ans);
    }

}
