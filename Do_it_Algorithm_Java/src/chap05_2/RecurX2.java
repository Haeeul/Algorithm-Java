package chap05_2;

import chap04_1.IntStack;

public class RecurX2 {
	static void recur(int n) {
		IntStack s = new IntStack(n);
		
		while(true) {
			if(n>0) {
				s.push(n);
				n = n-1;
				continue;
			}
			if(s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n -2;
				continue;
			}
			break;
		}
	}
}
