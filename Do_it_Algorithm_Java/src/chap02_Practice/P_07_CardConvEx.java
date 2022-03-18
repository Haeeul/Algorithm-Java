package chap02_Practice;

import java.util.Scanner;

public class P_07_CardConvEx {
	static int cardConvR(int x, int r, char[] d) {
		int n = ((Integer) x).toString().length(); // ��ȯ ���� �ڸ���
		int digits = 0; // ��ȯ ���� �ڸ���
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
		do {
			System.out.printf("   +");
			for (int i = 0; i < n + 2; i++)
				System.out.print('-');
			System.out.println();

			if (x / r != 0)
				System.out.printf(String.format("%%2d | %%%dd    �� %%d\n", n), r, x / r, x % r);
			else
				System.out.printf(String.format("     %%%dd    �� %%d\n", n), x / r, x % r);
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits / 2; i++) {
			char temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = stdIn.nextInt();
			}while(no < 0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36) :");
				cd = stdIn.nextInt();
			}while(cd<2 || cd>36);
			
			dno = cardConvR(no, cd, cno);
			
			System.out.print(cd+"�����δ� ");
			for(int i=0; i<dno; i++) { // ���ڸ����� -> �տ�������
				System.out.print(cno[i]);
			}System.out.println("�Դϴ�.");
			
			System.out.print("�� �� �� �ұ��? (1.��/0.�ƴϿ�) :");
			retry = stdIn.nextInt();
		}while(retry==1);
	}
}
