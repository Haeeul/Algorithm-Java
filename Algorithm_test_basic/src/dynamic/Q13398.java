package dynamic;

import java.util.Scanner;

public class Q13398 {
	public static void main(String[] args) {
		//#13398 ¿¬¼ÓÇÕ2
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] num = new int[n+1];

		for(int i =1; i<=n; i++) {
			num[i] = sc.nextInt();
		}

		int[] left = new int[n+2];
		int[] right = new int[n+2];
		int ans = num[1];

		for(int i=1; i<=n; i++) {
			left[i] = Math.max(num[i], left[i-1]+num[i]);
			if(left[i]>ans) {
				ans = left[i];
			}
		}

		for(int i=n; i>=1; i--) {
			right[i] = Math.max(num[i], right[i+1]+num[i]);
		}

		for(int i=1; i<=n; i++) {
			if(left[i-1]+right[i+1]>ans) {
				ans = left[i-1]+right[i+1];
			}
		}

		System.out.print(ans);
	}
}