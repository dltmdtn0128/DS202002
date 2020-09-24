import java.util.Scanner;

public class Main {
	//1���� n������ ������ �Ҽ��� ������ ������ ��ȯ�Ѵ�.
	static int pi(int n) {
		int pcount=0;
	
		for(int p=1; p<=n; p++) {
			//p�� �Ҽ��̸� pcount�� 1 ������Ű����
			//p�� 5�� �����°��� �˾Ƴ��°��� ������ �����ڸ� ����մϴ�.
			//p%5�� p�� 5�� ���������� �������� ��ȯ
			//�������� 0�̶�� p�� 5�� ������ �������� ����� �մϴ�.
			//����� ������ ������ ������ dcount�� �����ϰ� 0���� �ʱ�ȭ�Ѵ�.
			int dcount =0;
			//d�� 1���� p���� �ݺ��ؼ�, p�� d�� ����������ٸ� ����� ������ 1����.
			for(int d=1; d<=p; d++) {
				if (p%d==0) dcount++;
			}
			//����� ������ 2���,�Ҽ��̹Ƿ� �Ҽ������� ������Ų��.
			if(dcount==2) pcount++;
		
		}
		//���⼭ return ��ɾ �̿��ؼ� �Ҽ��� ������ ��ȯ
		return pcount;
	}
	static int pi1(int n) {
		int pcount =0;
		for (int p=2; p<=n; p++) { //1�� �Ҽ��� �ƴϹǷ� 1�� ���� p=2
			// �Ҽ����� ���θ� isPrime ������ �����ϰ�, for������ ���� ���� true�� �ʱ�ȭ.
			boolean isPrime = true;
			//1�� �ڱ��ڽ��� ���ڰ� �ƴ� ���ڷ� ������쿡�� �Ҽ��� �ƴϰԵǹǷ�
			//�׷���쿡�� ���������� ���ݴϴ�.
			for(int d = 2; d < p; d++) {
				//p�� d�� �����������, �Ҽ��� �ƴϹǷ� isPrime�� false�� ����,
				//break���� ���� for������ �������´�.
				if(p%d==0) {
					isPrime=false;
					break; //�극��ũ�� �����Կ����� �ش� for������ ��������
				}
			}
			//�Ҽ���� (isPrime==true) �Ҽ��� ������ ������Ų��.
			if (isPrime) pcount++;
		}
		return pcount;
	}
	
	static int pi2(int n) {
		//n�� 2���� ������ �Ҽ��� ������ 0
		if(n<2) return 0;
		//n�� 2��� �Ҽ��� ������ 1
		if(n==2) return 1;
		//n�� 2���� ũ�ٸ�, �Ҽ��� ������ 1+ Ȧ�� �Ҽ��� ����
		int pcount=1;
		//p�� 3�̻� Ȧ���� �˻��ϵ���
		for (int p=3; p<=n; p++) { 
			boolean isPrime = true;
			//������������ �˻�� �ִ� sqrt(p)������ �ϸ�ǹǷ�, �Ҽ��� ��� �Ҽ����� ���� ���� ��� �� �ʿ䰡�����ϴ�.
			for(int d = 2; d*d <= p; d++) { //******sqrt(d)�� �ٲ�*******
				//p�� d�� �����������, �Ҽ��� �ƴϹǷ� isPrime�� false�� ����,
				//break���� ���� for������ �������´�.
				if(p%d==0) {
					isPrime=false;
					break;
				}
			}
			//�Ҽ���� (isPrime==true) �Ҽ��� ������ ������Ų��.
			if (isPrime) pcount++;
		}
		return pcount;
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�Ҽ��� ������ ���� ���ڸ� �Է��ϼ��� : ");
		int n = scan.nextInt();
		
		long t1= System.currentTimeMillis();
		System.out.println("pi("+n+")= "+pi2(n));
		long t2= System.currentTimeMillis();
		System.out.println("Elapsed time is "+(t2-t1)+"ms.");
	}

}
