package chap03_Practice;

import java.util.Scanner;

public class P_01_SeqSearchSenFor {
	static int seqSearchSen(int[] a, int n, int key) {
		int i;
		
		a[n] = key;
		
		for (i = 0; a[i] != key; i++);
		
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num+1];
		
		for(int i=0; i<num; i++) {
			System.out.print("x ["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, key);
		
		if(idx == -1)
			System.out.println("그 값의 요소는 없습니다.");
		else
			System.out.println(key+"은(는) x["+idx+"]에 있습니다.");
	}
}
