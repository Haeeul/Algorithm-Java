package bruteforce;

import java.util.Scanner;

public class all_permutation {
	public static boolean next_permu(int[] a) {
		int i = a.length -1;
		
		while(i>0 && a[i-1]>=a[i]) {// 부등호 바뀔때까지 찾기!
			i--;
		}
		
		if(i <= 0) {// 마지막 순열
			return false;
		}
		
		int j = a.length-1;
		
		while(a[j]<=a[i-1]) { // i-1보다 큰 수 중 제일 작은 수 찾기!
			j--;
		}
		
		int temp = a[i-1]; // 스왑
		a[i-1] = a[j];
		a[j] = temp;
		
		j = a.length-1;
		
		while(i<j) { // i-1뒤에 순열 뒤집기
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		//#10974_모든 순열
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i<n; i++) {
			a[i] = i+1;
		}
		
		do {
			for(int i = 0; i<n; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}while(next_permu(a));
	}

}
