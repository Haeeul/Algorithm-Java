package IO;
import java.util.Scanner;

public class plus_3 {

	public static void main(String[] args) {
		//#10950_A+B_3
		Scanner scanner = new Scanner(System.in);
	    int x, a, b;
	    System.out.print("실행할 연산 횟수를 입력하세요 :");
	    x = scanner.nextInt();
	    for(int i=0; i<x; i++) {
	       System.out.print("더하기를 수행할 두 숫자를 입력하세요 :");
	       a = scanner.nextInt();
	       b = scanner.nextInt();
	       System.out.println(a + b);
	    } 
	}

}
