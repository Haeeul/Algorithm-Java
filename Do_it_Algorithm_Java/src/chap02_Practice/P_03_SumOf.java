package chap02_Practice;

import java.util.Scanner;

public class P_03_SumOf {
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++)
			sum += a[i];
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		
		int[] a = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("요소의 합계는 "+ sumOf(a)+"입니다.");
	}
}
