package IO;

import java.util.Scanner;

public class plus_4 {

	public static void main(String[] args) {
		//#10951_A+B+4
		//while(true)�� ��Ÿ�� ���� �߻�.
		//C������ EOF.
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
