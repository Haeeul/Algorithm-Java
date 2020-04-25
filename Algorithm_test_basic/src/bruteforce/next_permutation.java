package bruteforce;

import java.util.Scanner;

public class next_permutation {
	public static boolean next_permu(int[] a) {
		int i = a.length -1;
		
		while(i>0 && a[i-1]>a[i]) {// �ε�ȣ �ٲ𶧱��� ã��!
			i -= 1;
		}
		
		if(i <= 0) {
			return false;
		}
		
		int j = a.length-1;
		
		while(a[j]<=a[i-1]) { // i-1���� ū �� �� ���� ���� �� ã��!
			j -= 1;
		}
		
		int temp = a[i-1]; // ����
		a[i-1] = a[j];
		a[j] = temp;
		
		j = a.length-1;
		
		while(i<j) { // i-1�ڿ� ���� ������
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i += 1;
			j -= 1;
		}
		return true;
	}

	public static void main(String[] args) {
		//#10972_���� ����
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		if(next_permu(a)) {
			for(int i = 0; i<n; i++) {
				System.out.print(a[i]+" ");
			}
		}
		else {
			System.out.println("-1");
		}
	}

}
