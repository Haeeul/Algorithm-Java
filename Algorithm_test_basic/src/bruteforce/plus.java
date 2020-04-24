package bruteforce;

import java.util.Scanner;

public class plus {

	public static void main(String[] args) {
		//#9095번_1,2,3 더하기
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int n;
		
		int [] a = new int[11];
		a[1] = 1;
		a[2] = 2;
		a[3] = 4;
		
		for(int i = 0; i<t; i++) {
			n = sc.nextInt();
			
			for(int j =4; j<=n; j++) {
				a[j] = a[j-1] + a[j-2] + a[j-3];
			}
			System.out.println(a[n]);
		}
	}

}
