package bruteforce;

import java.util.*;
public class subset {
	public static int go(int[] a, int m, int i, int sum) {
	 if (i == a.length) {
		 if (sum == m) {
			 return 1;
		 } else {
			 return 0;
		 }
	 }
	 return go(a, m, i+1, sum+a[i]) + go(a, m, i+1, sum);
 }
 
 	public static void main(String args[]) {
 		//#1182번_부분수열의 합
	 Scanner sc = new Scanner(System.in);
	 
	 int n = sc.nextInt();
	 int m = sc.nextInt();
	 int[] a = new int[n];
	 
	 for (int i=0; i<n; i++) {
		 a[i] = sc.nextInt();
	 }
	 
	 int ans = go(a, m, 0, 0);
	 
	 if (m == 0) { // 공집합 제외
		 ans -= 1;
	 }
	 
	 System.out.println(ans);
	 }
}
