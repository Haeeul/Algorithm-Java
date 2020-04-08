package IO;

import java.util.Scanner;

public class plus_4 {

	public static void main(String[] args) {
		//#10951_A+B+4
		//while(true)는 런타임 에러 발생.
		//C언어에서의 EOF.
		Scanner scanner = new Scanner(System.in);
		int a,b;
			    
		//while(true){
		while(scanner.hasNextInt()) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			System.out.println(a+b);
		}
	}

}
