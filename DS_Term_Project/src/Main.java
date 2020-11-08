import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("N : ");
		int N = scan.nextInt();
		System.out.print("a : ");
		int a = scan.nextInt();
		System.out.print("b : ");
		int b = scan.nextInt();
		int[] data = new int[N];
		int result=0;
		for(int i=0; i<N; i++) {
			data[i] = rand.nextInt(N);
		}
		
		for(int j=0; j<N; j++) {
			if(data[j]>=a && data[j]<=b) {
				result+=data[j];
			}
			if(a>N || b>N) {
				System.out.println("Wrong Input");
				break;
			}
		}
		System.out.println("The sum is : "+result);

	}

}
