package IO;

import java.util.Scanner;

public class subString {

	public static void main(String[] args) {
		//11721��_�� ���� ���� ����ϱ�
		Scanner scanner = new Scanner(System.in);
		String st = scanner.next();
		int j = st.length() / 10;
		
		for(int i=0; i<=j; i++) {
			if(i==j) {
				System.out.println(st.substring(i*10,st.length()));
			}else {
			System.out.println(st.substring(i*10,i*10+10));
			}
		}
	}

}
