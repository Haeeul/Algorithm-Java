package IO;

import java.util.Scanner;

public class plus_6 {

	public static void main(String[] args) {
		// #10953_A+B_6
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		for(int i=0; i<x; i++) {
			String[] ab = scanner.next().split(",");
			System.out.println(Integer.parseInt(ab[0])+Integer.parseInt(ab[1]));
		}

	}

}
