package math;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		//#1978_소수 찾기
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i=0; i<x; i++) {
			int j = sc.nextInt();
			
			if(prime(j)==true) count++;
		}
		System.out.println(count);
		sc.close();
	}

	public static Boolean prime(int n){
		if(n < 2){
			return false;
		}
		
		for(int i=2; i*i<=n; i++){
				if(n % i == 0){
						return false;
				}
		}
		return true;
	}
}
