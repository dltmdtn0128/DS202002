import java.util.Scanner;

public class Main {
	//1 ���� n���� ���ϴ� �Լ�
	static long sum(int n) {
		long s = 0;
		for(int i=1;i<=n;i++) {
			s+=i;
	}
		return s;
	}
	//1 ���� n���� ���ϴ� �Լ�(��������)
	static long sum1(int n) {
		long s = n;
		return s*(s+1)/2;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1���� ���ϰ����ϴ� ���ڸ� �Է��ϼ��� : ");
		int n = scan.nextInt();
		
		//System.currentTimeMillis();���α׷��� �����ϸ鼭 �ð��� ������ִ� �Լ�
		//Ư����¥�� �ð��� 0���� �����ؼ� ������ �ð��� �и��ʷ� ��Ÿ���ϴ�.
		long t = System.currentTimeMillis(); //�� ����
		//���⼭ �۾��� ����. 
		
		System.out.println("sum from 1 to"+n+"is "+sum1(n)+".");
		
		long f = System.currentTimeMillis();// �� ��
		System.out.println("Elapsed time is "+(f-t)+"ms."); //�� �� - �� ���� = ����ð� ���
		//���α׷� ����� �����ϱ� ���� ����ð��� ���
	}

}
