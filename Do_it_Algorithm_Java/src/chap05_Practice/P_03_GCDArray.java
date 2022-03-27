package chap05_Practice;

import java.util.Scanner;

public class P_03_GCDArray {
	static int gcd(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}

	static int gcdArray(int a[], int start, int no) {
		if (no == 1)
			return a[start];
		else if (no == 2)
			return gcd(a[start], a[start + 1]);
		else
			return gcd(a[start], gcdArray(a, start + 1, no - 1));
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� �� ���� �ִ� ������� ���ұ��?��");
		int num;
		do {
			num = stdIn.nextInt();
		} while (num <= 1);

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}

		System.out.println("�ִ� ������� " + gcdArray(x, 0, num) + "�Դϴ�.");
	}
}
