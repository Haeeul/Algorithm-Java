package chap01_Practice;

import java.util.Scanner;

public class P_15_Triangle {
	// 왼쪽 아래 직각
	static void triangleLB(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 왼쪽 위 직각
	static void triangleLU(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 위 직각
	static void triangleRU(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
		
	// 오른쪽 아래 직각
	static void triangleRB(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("직각 이등변 삼각형을 출력합니다.");
		
		do {
			System.out.print("단 수：");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		System.out.println("왼쪽 아래가 직각인 삼각형");
		triangleLB(n); // 왼쪽 아래가 직각인 이등변삼각형

		System.out.println("왼쪽 위가 직각인 삼각형");
		triangleLU(n); // 왼쪽 위가 직각인 이등변삼각형

		System.out.println("오른쪽 위가 직각인 삼각형");
		triangleRU(n); // 오른쪽 위가 직각인 이등변삼각형

		System.out.println("오른쪽 아래가 직각인 삼각형");
		triangleRB(n); // 오른쪽 아래가 직각인 이등변삼각형
	}
}
