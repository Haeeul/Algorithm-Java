package math;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// #1934_�ּҰ����
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i=0; i<x; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(lcm(a, b));
		}
		sc.close();	
	}
	
	// �ִ����� ���ϱ�
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return gcd(b, a%b);
		}
	}
	
	// �ּҰ���� ���ϱ�_�ִ������� �̿��ؼ� ����.
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a,b);
	}

}
