//큐와 스택을 생성합니다
//숫자 n을 입력받습니다.
// 큐에 n개의 랜덤한 숫자들을 넣습니다.  랜덤한 숫자는 0~10000 범위로 합니다.
//큐에서 숫자 하나를 꺼냅니다.
//스택 최상위 숫자가 큐에서 꺼낸 숫자보다 작은 경우, 스택에서 숫자를 꺼내 큐에 넣습니다.
//스택이 비어있거나 스택 최상위 숫자가 큐에서 꺼낸 숫자보다 클때까지 e)를 반복합니다.
//스택에 큐에서 꺼낸 숫자를 넛습니다.
//큐가 비어있지 않다면 d)로 가서 수행을 계속합니다.
//스택에 있는데이터를 하나씩 꺼내면서 데이터를 출력합니다.

import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		// 숫자 n 입력
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		// 큐초기화
		int front=0;
		int rear=0;
		int[] queue = new int[n];
		// 스택초기화
		int[] stack = new int[n];
		int top = -1;
		
		for(int i=0; i<n; i++) {
			queue[rear] = rand.nextInt(10000);
			rear = (rear+1)%n;
			// 랜덤 숫자 10000 큐에 넣음
		}
		for(int i=0; i<n; i++) {
			System.out.println(queue[i]);
		}
		System.out.print('\n');
	
			// 스택이 비어있거나 스택 최상위 숫자가 큐에서 꺼낸 숫자보다 클때 
		
		
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
		

