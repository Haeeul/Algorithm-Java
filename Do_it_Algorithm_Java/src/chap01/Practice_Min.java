package chap01;

// 연습문제 02
public class Practice_Min {
	static int Min3(int a, int b, int c) {
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		 
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("Min(12,8,2) : "+Min3(12,8,2));
	}
}
