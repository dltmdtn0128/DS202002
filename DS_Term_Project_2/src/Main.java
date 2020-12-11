import java.util.Scanner;
import java.util.Random;
public class Main {
	
	static void Sort(int[] v, int a, int b) {
		for(int i=a; i<b; i++) {
			int min = i; //�ּҰ� �ʱ�ȭ
			for(int j= i+1; j<=b; j++) {
				if(v[min]>v[j]) min= j; 
			}
			int t = v[i];
			v[i] = v[min];
			v[min] =t;
		}
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ra = new Random(1000);
		
		System.out.print("N : ");
		int n = sc.nextInt();
		
		int[] data = new int[n];
		int result = 0;
		
		for(int i = 0; i<n; i++) data[i] = ra.nextInt();
		
		System.out.print("K : ");
		int k = sc.nextInt();
		long t1 = System.currentTimeMillis();
		for(int i = 0; i<k; i++) {
			int a = ra.nextInt(n);
			int b = ra.nextInt(n);
			if(a>b) {int t = a; a= b; b= t;} //swap ���࿡ a�� b���� Ŭ ���
			for(int m = a; m<b; m++) {
				Sort(data,a,b); //a~b���� ����
				for (int p=0; p<n; p++) {
					result += data[p];
				}
			}
			}
		t1=System.currentTimeMillis() - t1;
		System.out.println("elapsed time for N : "+t1+" ms.");
	}
}