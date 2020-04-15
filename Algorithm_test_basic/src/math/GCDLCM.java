package math;

import java.util.Scanner;

public class GCDLCM {

	public static void main(String[] args) {
		// #2609_�ִ������� �ּҰ����
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));		
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
