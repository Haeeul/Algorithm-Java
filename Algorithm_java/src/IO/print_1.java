package IO;

import java.util.Scanner;

public class print_1 {

	public static void main(String[] args) {
		//11718_print_1
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			String st = scanner.nextLine();
			System.out.println(st);
		}
		scanner.close();
	}
}
