package math;

import java.util.Arrays;
import java.util.Scanner;

public class seven_dwarf {

	public static void main(String[] args) {
		//#2309_ÀÏ°ö³­ÀïÀÌ
		Scanner sc = new Scanner(System.in);
		Integer[] a = new Integer[9];
		int n = 9;
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			a[i] = x;
			sum += a[i];
		}
		
		Arrays.parallelSort(a);
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(sum - a[i] - a[j] == 100) {
					for(int k =0; k<n; k++) {
						if(i==k || j==k) continue;
						System.out.println(a[k]);
					}
				}
			}
		}
		
	}

}
