package math;

import java.util.ArrayList;
import java.util.Scanner;

public class sum_GCD {
	public static void main(String[] args) {
		// #9613_GCD ��
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			int n = sc.nextInt();

			for (int j = 0; j < n; j++) {// �ι�° �׽�Ʈ���̽�
				list.add(sc.nextInt()); // ���� �־��ֱ�
			}
			long a = 0;

			for (int z = 0; z < list.size() - 1; z++) {
				for (int c = z + 1; c < list.size(); c++) {
					a += gcd(list.get(z), list.get(c));
				}
			}
			System.out.println(a);
			list.clear();
		}
	}
	
	// �ִ����� ���ϱ�
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return gcd(b, a%b);
		}
	}
}
