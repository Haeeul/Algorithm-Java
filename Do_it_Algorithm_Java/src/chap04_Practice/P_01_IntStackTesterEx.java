package chap04_Practice;

import java.util.Scanner;

import chap04_1.IntStack;

public class P_01_IntStackTesterEx {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);

		while (true) {
			System.out.println("현재 데이터 수：" + s.size() + " / " + s.capacity());
			System.out.print("(1)푸시　(2)팝　(3)피크　(4)덤프　(5)검색　(6)비움　(7)정보표시　(0)종료：");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
			 case 1:
				System.out.print("데이터：");
				x = stdIn.nextInt();
				try {
					s.push(x);
			 	} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			 case 2:
				try {
			 		x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
			 	} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 3:
				try {
			 		x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
			 	} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 4:
				s.dump();
				break;
				
			 case 5:
				System.out.print("찾는 데이터：");
				x = stdIn.nextInt();
				int n = s.indexOf(x);
				if (n >= 0)
					System.out.println("꼭대기부터 " + (s.size() - n) + "번 째에 있습니다.");
				else
					System.out.println("그 데이터가 없습니다.");
				break;

			case 6:
				s.clear();
				break;

			case 7:
				System.out.println("용량：" + s.capacity());
				System.out.println("데이터 수：" + s.size());
				System.out.println("비어 " + (s.isEmpty() ? "있습니다." : "있지 않습니다."));
				System.out.println("가득 " + (s.isFull() ? "찼습니다." : "차지 않았습니다."));
				break;
			}
		}
	}
}
