package chap05_2;

import java.util.Scanner;

public class Recur {
	static void recur(int n) {
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}
	
	static void recur2(int n) {
		if (n > 0) {
			recur2(n - 2);
			System.out.println(n);
			recur2(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���.��");
		int x = stdIn.nextInt();

		recur2(x);
	}
}
