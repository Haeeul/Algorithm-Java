package IO;
import java.util.Scanner;

public class A_plus_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	      int x, a, b;
	      System.out.print("������ ���� Ƚ���� �Է��ϼ��� :");
	      x = scanner.nextInt();
	      for(int i=0; i<x; i++) {
	         //
	         System.out.print("���ϱ⸦ ������ �� ���ڸ� �Է��ϼ��� :");
	         a = scanner.nextInt();
	         b = scanner.nextInt();
	         System.out.println(a + b);
	      }
	}

}
