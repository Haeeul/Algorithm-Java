package chap01_Practice;

import java.util.Scanner;

public class P_11_DigitsNo {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		int no = 0;

		System.out.println("���� �������� �ڸ����� ���մϴ�.");
		
		do {
			System.out.print("������ : ");
			n = stdIn.nextInt();
		}while(n<=0);
		
		
		while(n>0) {
			n /= 10;
			no++;
		}
		
		System.out.println("�� ���� "+no+"�ڸ��Դϴ�.");
	}
}
