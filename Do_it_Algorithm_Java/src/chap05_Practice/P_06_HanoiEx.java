package chap05_Practice;

import java.util.Scanner;

public class P_06_HanoiEx {
	static String[] name = { "A���", "B���", "C���" };

	static void move(int no, int x, int y) {
		if (no > 1)
			move(no - 1, x, 6 - x - y);

		System.out.println("����[" + no + "]�� " + name[x - 1] + "���� " + name[y - 1] + "���� �ű�");

		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�ϳ����� ž");
		System.out.print("������ ������");
		int n = stdIn.nextInt();

		move(n, 1, 3);
	}
}
