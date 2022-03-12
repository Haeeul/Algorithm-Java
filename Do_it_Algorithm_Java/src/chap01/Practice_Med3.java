package chap01;

public class Practice_Med3 {
	static int med3 (int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}
	
	// Median에 비해 효율이 떨어지는 이유
	// 첫번째 if문에서 b >= a 및 b <= a의 판단과 실질적으로 같은 판단이
	// 두번째 else if문에서(a > b 및 a < b) 다시한번 수행되기 때문에 효율이 나빠진다.
}
 