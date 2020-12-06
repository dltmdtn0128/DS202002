// Lecture 14
// ���������� �̿��Ͽ� ������׷����� ���� ū ������ ���簢�� ���� ���ϱ�
// �Է�
// ó���� ������׷��� ���� ���� N�� �Էµ˴ϴ�.
// ������ �� ���õ��� �������� N�� �Էµ˴ϴ�.
// ���� �� {3,2,6,7} �� ������ ������ 4���� ������ �ִ� ������׷���
// 4 3 2 6 7 
// �� �Է��� �־����ϴ�.
// �̿� ���� �亯�� ���簢���� ���̸� ����ϸ� �˴ϴ�
// 12
import java.util.Scanner;
public class Main {
		//���������� ���� �Լ�
		//�迭 v���� ����(a,b) �������� �ִ�ũ���� ���簢�� ���� ��ȯ
	
	static int histo(int[] v, int left, int right) {
		
		if(left == right) return 0;
		if(left+1 == right) return v[left];
		//�߰�
		int mid = (left+right)/2;
		int l = histo(v,left,mid);
		int r = histo(v,mid,right);
		//�߰��� ��ġ�°�
		int i = mid, j=mid+1;
		//�� �� ū���� ����
		int ret = Math.max(l, r);
		//��ġ�� ���簢�� 2�� ���غ���
		int h = Math.max(v[left], v[right]);
		ret = Math.max(ret, h*2);
		
		while(left<i || j<right) {
			//����
			if(left<i && j<right) {
				//������ Ȯ��
				if(v[i-1]<v[j+1]) h = Math.min(h, v[++j]);
				else h = Math.min(h, v[--i]);
			}
			//�����ʹ��� ������ ����Ȯ��
			else if(left<i) h = Math.min(h, v[--i]);
			//vice versa
			else if(j<right) h = Math.min(h, v[++j]);
			ret = Math.max(ret, h*(j-i+1));
		}
		return ret;
		}
	// ������׷����� �ִ��� ���簢�� ���̸� ����ؼ� ����ϴ� �Լ�
			// v : ������׷��� ���õ��� �������� �迭 (0 �̻��� �ڿ���)
			// n : ������ ����
	static int histo(int[] v, int n) {
		// v[0..n-1] ������ ���̸� ���ؼ� �� ���� ��ȯ�մϴ�.
		return histo(v,0,n-1);
	}

	public static void main(String[] args) {
		// �Է��� ���ؼ� ��ĳ�� ������Ʈ ����
		Scanner scan = new Scanner(System.in);
		//���� ���� N�� �Է�
		int n = scan.nextInt();
		// n�� ������ ���� �迭 ����
		int[] v = new int[n];
		// n���� �迭 ������ �Էµ� ���� �ִ´�
		for(int i =0; i<n; i++) {
			v[i] = scan.nextInt();
		}
		// histo() �Լ��� ȣ���ؼ� �� ��� ����
		int r = histo(v,0,n-1);
		// ������
		System.out.println(r);

	}

}
