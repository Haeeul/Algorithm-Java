package chap01;

import java.util.Scanner;

public class Practice_Triangle {
	// ���� �Ʒ� ����
	static void triangleLB(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// ���� �� ����
	static void triangleLU(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// ������ �� ����
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
		
	// ������ �Ʒ� ����
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
		
		System.out.println("���� �̵ �ﰢ���� ����մϴ�.");
		
		do {
			System.out.print("�� ����");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		System.out.println("���� �Ʒ��� ������ �ﰢ��");
		triangleLB(n); // ���� �Ʒ��� ������ �̵�ﰢ��

		System.out.println("���� ���� ������ �ﰢ��");
		triangleLU(n); // ���� ���� ������ �̵�ﰢ��

		System.out.println("������ ���� ������ �ﰢ��");
		triangleRU(n); // ������ ���� ������ �̵�ﰢ��

		System.out.println("������ �Ʒ��� ������ �ﰢ��");
		triangleRB(n); // ������ �Ʒ��� ������ �̵�ﰢ��
	}
}
