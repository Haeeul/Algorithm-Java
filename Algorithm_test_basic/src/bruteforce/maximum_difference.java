package bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class maximum_difference {
	public static boolean next_permu(int[] a) {
		int i = a.length -1;
		
		while(i>0 && a[i-1]>=a[i]) {// �ε�ȣ �ٲ𶧱��� ã��!
			i--;
		}
		
		if(i <= 0) {// ������ ����
			return false;
		}
		
		int j = a.length-1;
		
		while(a[j]<=a[i-1]) { // i-1���� ū �� �� ���� ���� �� ã��!
			j--;
		}
		
		int temp = a[i-1]; // ����
		a[i-1] = a[j];
		a[j] = temp;
		
		j = a.length-1;
		
		while(i<j) { // i-1�ڿ� ���� ������
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		return true;
	}
	
	public static int calculator(int[] a) {
		int sum = 0;
		
		for(int i = 0; i<a.length-1; i++) {
			sum += Math.abs(a[i]-a[i+1]);
		}
		return sum;
	}

	public static void main(String[] args) {
		//#10819��_���̸� �ִ��
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		} sc.close();
		
		Arrays.sort(a);
		
		do {
			int num = calculator(a);
			max = Math.max(max, num);
		}while(next_permu(a));		
		
		System.out.println(max);
	}

}
