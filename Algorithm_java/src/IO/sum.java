package IO;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		//11720_������ ��
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int a = scanner.nextInt();
		String st = scanner.next();
		
		for(int i = 0; i<a; i++) {
			sum += Integer.parseInt(st.substring(i,i+1));
		}
		scanner.close();
		System.out.println(sum);
	}
}
