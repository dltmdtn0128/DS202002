import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		
		System.out.print("N : ");
		int n = sc.nextInt();
		System.out.print("K : ");
		int k = sc.nextInt();
		int[] data = new int[n];
		int result = 0;
		
		long t1 = System.currentTimeMillis();
		for(int i = 0; i<n; i++) {
			data[i] = ra.nextInt(n);
		}
		t1= System.currentTimeMillis() - t1;
		long t2 = System.currentTimeMillis();
		for(int i = 0; i<k; i++) {
			int a = ra.nextInt(k);
			int b = ra.nextInt(k);
			int biggest=0;
			int smallest=0;
			for(int j=a; j<b; j++) {
				if (data[j]<smallest) smallest = data[j];
				else if(data[j]>biggest) biggest = data[j];
				result+= (smallest+biggest);	
			}	
		}
		t2=System.currentTimeMillis() - t2;
		System.out.println("result = "+result);
		System.out.println("elapsed time for N : "+t1+" ms.");
		System.out.println("elapsed time for K : "+t2+" ms.");
	}
}