package dynamic;

import java.util.Scanner;

public class Q1699 {

	public static void main(String[] args) {
		// #1699 Á¦°ö¼öÀÇ ÇÕ
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int [100001];
		
		for(int i = 1; i<100001; i++) {
			for(int j = 1; j*j<=i; j++) {
				if(arr[i] > arr[i - j * j]+1 || arr[i] == 0) {
					arr[i] = arr[i-j*j]+1;
				}
			}
		}
		
		System.out.println(arr[n]);
	}

}
