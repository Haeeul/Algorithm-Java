package dynamic;

import java.util.Scanner;

public class Make_one {
	static int[] d;

	public static void main(String[] args) {
		//#1463번 1로 만들기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		d = new int[n+1];
		
		System.out.println(calculator(n));
		sc.close();
	}
	
	private static int calculator(int n) {
		if(n==1) return 0;
		
		if(d[n]>0) return d[n];
		
		d[n] = calculator(n-1)+1;
		
		if(n%2==0) {
			d[n] = Math.min(d[n], calculator(n/2)+1);
		}
		
		if(n%3==0) {
			d[n] = Math.min(d[n], calculator(n/3)+1);
		}
		return d[n];
	}

}
