package dynamic;

import java.util.Scanner;

public class Q2193 {

	public static void main(String[] args) {
		// #2193번 이친수
		Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new FileInputStream("input.txt"));
        int n = sc.nextInt();
        int[] arr = new int[n];
        if (n == 1) {
            arr[0] = 1;
        } else if (n == 2) {
            arr[1] = 1;
        } else {
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        System.out.println(arr[n-1]);
	}

}
