import java.util.Scanner; //scanner �Է��ϸ� �ڵ����� �Էµ�

//public�� �����Ǿ��ִٴ� �ǹ�, �� ���� �̿ܿ��� �ش� Ŭ������ ����� �� ������ �ǹ�
//�ƹ��͵� ������ ������ �ڵ����� private �����
//private�� �پ������� �ܺ� ���Ͽ��� �ش� Ŭ������ ����� �� ����
//class main �� main �̶�� Ŭ������ �ǹ���
public class Main {
// main �Լ��� �ڹ� ������Ʈ �����ϸ� ���� ���� ����Ǵ� �Լ�.
// static �� ���� ��� Ŭ���� ������Ʈ�� ������� �����ϰų� ������ �� ������ �ǹ�
	public static void main(String[] args) {
// ����� System.out.println()�� ���.
// �ٹٲ��� �ʿ���°�� System.out.print()�� ���.
		System.out.println("�ٹٲ��� �մϴ�.");
		System.out.print("�ٹٲ��� ���Ұſ���.");
		System.out.println("������ �տ� �� ����� �پ ���ð̴ϴ�.");
		//���ڿ� ���ϱ�(+)���̿� ���� �̷����
		//���ڿ�+���ڿ��� ���������� ���ڿ�+���� �� �پ��� ���°� �����մϴ�.
		System.out.println("���� ���̴�"+"20���Դϴ�.");
		System.out.println("����� ���̴�"+20+"���Դϱ�?");
//*������ ���*
//������� ���� �ٲ�� ������ �ִ� ���� �ڹ��� ����ҿ� �����ϴ� ���� �ǹ�, �� ����ҿ� �̸��� �ٿ��� ������� ��.
//������ <������ Ÿ��> <������ �̸�> ���·� ������.
// int, long, float, double, char, string
		int age;
//������ ���� ������ ������ <������> = <������ ��>; ���·� ��.
		age = 20;
		System.out.println("���� ���� : "+age);
// ����� �Է��� �ڹٿ��� ó���ϱ� ���ؼ��� �����.
// ������ ���α׷� �ۼ��� �� �Է��ϴ� ����� �������� �����ϴ� ���� �ʿ�.
		Scanner scan = new Scanner(System.in);
		System.out.print("����� ���̴� ? ");
		age = scan.nextInt();
		System.out.println("���� ���̴�"+age+"���Դϴ�.");
// ���ǹ��� if��� ���� ����
// if - else if - else ���·� �̷����
// if(����) ... �ϸ�, ������ "��"�� ��� ...�� �����.
// else ... �� if ������ "����"�� ��� ... �� ����.
		if(age <= 7) {
			System.out.print(""+age+" : ");
			System.out.println("���� ����Դϴ�.");
		}
		else if(age <= 19){
			System.out.print(""+age+" : ");
			System.out.println("���� û�ҳ��Դϴ�.");
		}
		else {
			System.out.print(""+age+" : ");
			System.out.println("�� ��ŭ.");
		}
//�ݺ��� for( ; ; ) ���¿� while( ���ǹ� ) ���°� ����.
// for(�ʱⰪ; ���ǰ�; ������;) ���·� �̷���� ����.
// ex) a���� b������ ���� ���� i�� �ְ� ��ɾ �ݺ��ؼ� �����ϰ� �ʹٸ�,
// for(int i = a; i<=b; i++) ...
		for(int i=1; i<=5; i++) {
			System.out.println("��� : "+i);
		}
// ���� for���� for���� �ΰ��� �����ִ� ���
// �� ��� ������ i,j���·� �����ϰԵ�
		for(int i=1;i<=age; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
			}
	}