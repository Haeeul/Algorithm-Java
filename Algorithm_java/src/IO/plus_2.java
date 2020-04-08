package IO;

import java.util.Scanner;

public class plus_2 {

	public static void main(String[] args) {
		// #2558_A+B_2
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// nexInt() 메서드는 공백이나 개행으로 숫자를 구분하므로 1번과 동일하게 풀이.
		Scanner scanner = new Scanner(System.in);
	    int a, b;
	    a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
        
	    System.out.println(a + b);
	}

}
