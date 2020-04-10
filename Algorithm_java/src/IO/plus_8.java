package IO;

import java.util.Scanner;

public class plus_8 {

	public static void main(String[] args) {
		//11022_A+B_8
		Scanner scanner = new Scanner(System.in);
	    int x, a, b;
	    x = scanner.nextInt();
	    for(int i=1; i<=x; i++) {
	       a = scanner.nextInt();
	       b = scanner.nextInt();
	       System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a + b));
	    } 
	}

}
