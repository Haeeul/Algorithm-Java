package IO;
import java.util.Scanner;

public class A_plus_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A+B - 3
//		Scanner scanner = new Scanner(System.in);
//	      int x, a, b;
//	      System.out.print("실행할 연산 횟수를 입력하세요 :");
//	      x = scanner.nextInt();
//	      for(int i=0; i<x; i++) {
//	         //
//	         System.out.print("더하기를 수행할 두 숫자를 입력하세요 :");
//	         a = scanner.nextInt();
//	         b = scanner.nextInt();
//	         System.out.println(a + b);
//	      }
		
		// A+B -5
		Scanner scanner = new Scanner(System.in);
	    int a= 1; 
	    int b = 1;
	    
	    while(a !=0 || b!=0){
		    a = scanner.nextInt();
		    b = scanner.nextInt();
		    if(a !=0 || b!=0) {
		    	System.out.println(a+b);
		    }
	    }scanner.close();
	    
	}

}
