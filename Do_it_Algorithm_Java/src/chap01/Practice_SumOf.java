package chap01;

import java.util.Scanner;

public class Practice_SumOf {
	static int sumof(int a, int b) {
		int min, max;
		
		if(a<b) {
			min = a;
			max = b;
		}else {
			min = b;
			max = a;
		}
		
		int sum = 0;
		
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a���� b������ ���� ���մϴ�.");
		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.print("b�� �� : ");
		int b = stdIn.nextInt();
		
		System.out.println("a���� b������ ��� ������ ���� "+sumof(a,b)+"�Դϴ�.");
	}
}
