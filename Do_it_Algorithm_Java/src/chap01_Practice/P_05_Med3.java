package chap01_Practice;

public class P_05_Med3 {
	static int med3 (int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}
	
	// Median�� ���� ȿ���� �������� ����
	// ù��° if������ b >= a �� b <= a�� �Ǵܰ� ���������� ���� �Ǵ���
	// �ι�° else if������(a > b �� a < b) �ٽ��ѹ� ����Ǳ� ������ ȿ���� ��������.
}
 