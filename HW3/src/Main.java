//ť�� ������ �����մϴ�
//���� n�� �Է¹޽��ϴ�.
// ť�� n���� ������ ���ڵ��� �ֽ��ϴ�.  ������ ���ڴ� 0~10000 ������ �մϴ�.
//ť���� ���� �ϳ��� �����ϴ�.
//���� �ֻ��� ���ڰ� ť���� ���� ���ں��� ���� ���, ���ÿ��� ���ڸ� ���� ť�� �ֽ��ϴ�.
//������ ����ְų� ���� �ֻ��� ���ڰ� ť���� ���� ���ں��� Ŭ������ e)�� �ݺ��մϴ�.
//���ÿ� ť���� ���� ���ڸ� �ӽ��ϴ�.
//ť�� ������� �ʴٸ� d)�� ���� ������ ����մϴ�.
//���ÿ� �ִµ����͸� �ϳ��� �����鼭 �����͸� ����մϴ�.

import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		// ���� n �Է�
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		// ť�ʱ�ȭ
		int front=0;
		int rear=0;
		int[] queue = new int[n];
		// �����ʱ�ȭ
		int[] stack = new int[n];
		int top = -1;
		
		for(int i=0; i<n; i++) {
			queue[rear] = rand.nextInt(10000);
			rear = (rear+1)%n;
			// ���� ���� 10000 ť�� ����
		}
		for(int i=0; i<n; i++) {
			System.out.println(queue[i]);
		}
		System.out.print('\n');
	
			// ������ ����ְų� ���� �ֻ��� ���ڰ� ť���� ���� ���ں��� Ŭ�� 
		
		
		while(front != rear) {
			if (queue[front] > stack[top] || top == -1) {
				stack[top] = queue[front];
				front=(front+1)%n;
				top++;
			}
			else if (queue[front]<stack[top]) {
				stack[top] = queue[rear];
				top--;
				rear=(rear-1)%n;
			}

			}
			for(int i=0; i<n; i++) {
				System.out.println(queue[i]);
			}
	}
	
}
		

