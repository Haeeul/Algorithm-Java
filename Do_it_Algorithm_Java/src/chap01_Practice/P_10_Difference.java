package chap01_Practice;

import java.util.Scanner;

public class P_10_Difference {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a,b;

		System.out.print("a�� �� : ");
		a = stdIn.nextInt();
		
		while(true) {
			System.out.print("b�� �� : ");
			b = stdIn.nextInt();
			if(b > a) break;
			System.out.println("a���� ū ���� �Է��ϼ���!");
		}
		
		System.out.println("b - a��"+(b-a)+"�Դϴ�.");
	}
}
