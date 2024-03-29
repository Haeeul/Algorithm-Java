package chap01_Practice;

import java.util.Scanner;

public class P_09_SumOf {
	static int sumof(int a, int b) {
		int min, max;
		
		if(a<b) {
			min = a;
			max = b;
		}else {
			min = b;
			max = a;
		}
		
		int sum = 0;
		
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a부터 b까지의 합을 구합니다.");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		
		System.out.println("a부터 b사이의 모든 정수의 합은 "+sumof(a,b)+"입니다.");
	}
}
