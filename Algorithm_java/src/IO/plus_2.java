package IO;

import java.util.Scanner;

public class plus_2 {

	public static void main(String[] args) {
		// #2558_A+B_2
		// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// nexInt() �޼���� �����̳� �������� ���ڸ� �����ϹǷ� 1���� �����ϰ� Ǯ��.
		Scanner scanner = new Scanner(System.in);
	    int a, b;
	    a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
        
	    System.out.println(a + b);
	}

}
