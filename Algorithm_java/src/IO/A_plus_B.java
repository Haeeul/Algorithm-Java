package IO;
import java.util.Scanner;

public class A_plus_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A+B - 3
//		Scanner scanner = new Scanner(System.in);
//	      int x, a, b;
//	      System.out.print("������ ���� Ƚ���� �Է��ϼ��� :");
//	      x = scanner.nextInt();
//	      for(int i=0; i<x; i++) {
//	         //
//	         System.out.print("���ϱ⸦ ������ �� ���ڸ� �Է��ϼ��� :");
//	         a = scanner.nextInt();
//	         b = scanner.nextInt();
//	         System.out.println(a + b);
//	      }
		
		// A+B -5
//		Scanner scanner = new Scanner(System.in);
//	    int a, b;
//	    int i = 0;
//	    int x[] = new int[100];
//	    while(true){
//		    a = scanner.nextInt();
//		    b = scanner.nextInt();
//		    if(a !=0 || b!=0) {
//		    	x[i] = a+b;
//		    	i++;
//		    }
//		    else {
//		    	for(int j=0; j<i; j++) {
//		 	       System.out.println(x[j]);
//		 	      }
//		    	break;
//		    }
//	    }
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
