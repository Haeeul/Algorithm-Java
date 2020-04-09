package IO;

import java.util.Scanner;

public class plus_7 {

	public static void main(String[] args) {
		//11021_A+B_7
		Scanner scanner = new Scanner(System.in);
	    int x, a, b;
	    System.out.print("실행할 연산 횟수를 입력하세요 :");
	    x = scanner.nextInt();
	    for(int i=1; i<=x; i++) {
	       System.out.print("더하기를 수행할 두 숫자를 입력하세요 :");
	       a = scanner.nextInt();
	       b = scanner.nextInt();
	       System.out.println("Case #"+i+":"+(a + b));
	    } 
	}

}
