import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void heapSort(int[] a,int s, int f) {
		int len = f; 
		for(int k = len/2; k>s; k--) {
			downHeap(a,k,len);
		}//부모노드가 자식보다 큰 것을 찾음
		do {
			int t = a[0];
			a[0] = a[len-1];
			a[len-1] = t;
			len = len-1;
			downHeap(a,1,len);
		}
		while (len>1);
	}
	public static void downHeap(int[] a, int k, int len) {
		int j,t = a[k-1];
		while(k<=len/2) {//자식있는지 확인
			j = 2*k;
			if((j<len) && (a[j-1]<a[j])) j++; //왼쪽오른쪽 비교, 큰값
			if(t>=a[j-1]) break;// t와 비교, t가 더 크면 break
			
			a[k-1] = a[j-1]; //자식이 더 클경우 자식을 부모자리에
			k=j;
		}
		a[k-1] = t;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ra = new Random(1000);
		
		System.out.print("N : ");
		int n = sc.nextInt();
		System.out.print("K : ");
		int k = sc.nextInt();
		int[] data = new int[n];
		int result = 0;
		
		
		for(int i = 0; i<n; i++) {
			data[i] = ra.nextInt();
		}
		long t1 = System.currentTimeMillis();
		for(int i = 0; i<k; i++) {
			int a = ra.nextInt(n);
			int b = ra.nextInt(n);
			if(a>b) {int t = a; a= b; b= t;}
			for(int m = a; m<b; m++) {
				heapSort(data,a,b);
				for (int p=0; p<n; p++) {
					result += data[p];
				}
			}
			}
		
		t1=System.currentTimeMillis() - t1;
		System.out.println("elapsed time for N : "+t1+" ms.");
}
}
