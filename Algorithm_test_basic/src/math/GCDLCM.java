package math;

import java.util.Scanner;

public class GCDLCM {

	public static void main(String[] args) {
		// #2609_최대공약수와 최소공배수
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));		
	}
	
	// 최대공약수 구하기
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return gcd(b, a%b);
		}
	}
	
	// 최소공배수 구하기_최대공약수를 이용해서 구함.
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a,b);
	}

}
