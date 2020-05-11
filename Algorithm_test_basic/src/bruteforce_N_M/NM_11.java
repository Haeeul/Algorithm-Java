package bruteforce_N_M;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class NM_11 {
	static boolean[] overlap = new boolean[10000];
	static LinkedList<Integer> a;
	static StringBuilder result = new StringBuilder();
	static LinkedList<Integer> num;
	
	public static void go(int index,int n, int m)throws IOException {
		if(index==m) {
			for(int i:a) {
				result.append(i + " ");
			}
			result.append("\n");
			return;
		}
		
		int before = -1;
		
		for(int i =0; i<n; i++) {
			if(i == 0 || before != num.get(i)) {
				before = num.get(i);
				a.add(num.get(i));
				go(index+1, n, m);
				a.removeLast();
			}
		}
	}

	public static void main(String[] args)throws IOException {
		//#15665¹ø_N°ú M_11¹ø
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		a = new LinkedList<>();
		num =  new LinkedList<>();
		
		for(int i =0; i<n; i++) {
			num.add(sc.nextInt());
		}
		
		num.sort(null);
		go(0,n,m);
		System.out.println(result);
	}
}
