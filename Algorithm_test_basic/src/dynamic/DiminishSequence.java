package dynamic;

import java.util.Scanner;

public class DiminishSequence {

	public static void main(String[] args) {
		// #11722번_가장 긴 감소하는 부분 수열
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n+1];
		int d[] = new int[n+1];
		int max = 0;
		
		for(int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
		}
		
		sc.close();
		
		d[1] = 1;
		
		for(int i=2; i<=n; i++) {
			d[i] = 1;
			for(int j=0; j<i; j++) {
				if(a[i] < a[j] && d[i] <= d[j]) {
					d[i] = d[j] + 1;
				}
				else if(a[i] == a[j]) {
					d[i] = d[j];
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			max = Math.max(d[i], max);
		}
		
		System.out.println(max);
	}

}
