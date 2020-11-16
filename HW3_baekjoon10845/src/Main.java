import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int n = 0;
		int front =0;
		int rear =0;
		int size = 1000;
		String input;
		int[] queue= new int[size];
		
		for(int i=0; i<cnt; i++) {
			input= sc.next();
			if(input == "push") {
				n= sc.nextInt();
				queue[rear]=n;
				rear=(rear+1)%size;
			}
			else if (input == "pop") {
				if(front == rear) System.out.println(-1);
				else {
					System.out.println(queue[front]);
					front=(front+1)%size;
				}
			}
			else if ( input == "empty") {
				if(front == rear) System.out.println(1);
				else System.out.println(0);
			}
			else if ( input == "size") {
				System.out.println((rear-front+size)%size);
			}
			else if ( input == "front") {
				System.out.println(queue[front]);
			}
			else if (input == "back") {
				System.out.println(queue[rear]);
			}
		}
	}

}
