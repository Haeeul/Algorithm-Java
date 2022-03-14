package chap01;

import java.util.Scanner;

public class Practice_DigitsNo {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		int no = 0;

		System.out.println("양의 정수값의 자릿수를 구합니다.");
		
		do {
			System.out.print("정수값 : ");
			n = stdIn.nextInt();
		}while(n<=0);
		
		
		while(n>0) {
			n /= 10;
			no++;
		}
		
		System.out.println("그 수는 "+no+"자리입니다.");
	}
}
