package IO;

import java.util.Scanner;

public class print_2 {

	public static void main(String[] args) {
		//11719_print_2
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			String st = scanner.nextLine();
			System.out.println(st);
		}
		scanner.close();
	}

}
