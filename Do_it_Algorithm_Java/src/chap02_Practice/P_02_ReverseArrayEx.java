package chap02_Practice;

import java.util.Scanner;

public class P_02_ReverseArrayEx {
	static void printArray(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}System.out.println();
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a,i,a.length-i-1);
			System.out.println("a["+i+"]과(와) a["+(a.length-i-1)+"]를 교환합니다.");
			printArray(a);
		}
			
	}
	
	public static void main(String[] args) {		
		int[] a = {5,10,73,2,-5,42};
		
		printArray(a);
		reverse(a);
		
		System.out.println("역순으로 정렬했습니다.");
	}
}
