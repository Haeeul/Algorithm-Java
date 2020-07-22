package dynamic;

import java.util.Scanner;

public class Q1912 {

	public static void main(String[] args) {
		//#1912 ¿¬¼ÓÇÕ
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for(int i =0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		
		int max = num[0];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += num[i];
			max = Math.max(max, sum);
			
			if(sum < 0) {
				sum = 0;
			}
		}
		
		System.out.print(max);
	}

}
