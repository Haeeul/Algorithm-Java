package IO;

import java.util.Scanner;

public class plus_7 {

	public static void main(String[] args) {
		//11021_A+B_7
		Scanner scanner = new Scanner(System.in);
	    int x, a, b;
	    System.out.print("������ ���� Ƚ���� �Է��ϼ��� :");
	    x = scanner.nextInt();
	    for(int i=1; i<=x; i++) {
	       System.out.print("���ϱ⸦ ������ �� ���ڸ� �Է��ϼ��� :");
	       a = scanner.nextInt();
	       b = scanner.nextInt();
	       System.out.println("Case #"+i+":"+(a + b));
	    } 
	}

}
