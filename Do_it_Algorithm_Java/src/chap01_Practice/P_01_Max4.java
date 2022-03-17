package chap01_Practice;

// 연습문제 01
public class P_01_Max4 {
	// a,b,c,d의 최댓값을 구하여 반환
	static int Max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("Max(12,14,8,2) : "+Max4(12,14,8,2));
	}
}
