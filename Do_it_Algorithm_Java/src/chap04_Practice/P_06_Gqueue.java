package chap04_Practice;

import chap04_Practice.P_05_IntQueue.EmptyIntQueueException;
import chap04_Practice.P_05_IntQueue.OverflowIntQueueException;

public class P_06_Gqueue<E> {
	private int max;
	private int front;
	private int rear;
	private int num;
	private E[] que;

	public static class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	public static class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	public P_06_Gqueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = (E[]) new Object[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public E enque(E x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear == max)
			rear = 0;
		return x;
	}
	
	public E deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		E x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	
	public E peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}

	public int indexOf(E x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) & max;
			if (que[idx] == x)
				return idx;
		}			
		return -1;
	}
	
	public void clear() {
		num = front = rear = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return num;
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	public boolean isFull() {
		return num >= max;
	}

	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비었습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i+front)%max].toString() + " ");
			System.out.println();
		}
	}
}
