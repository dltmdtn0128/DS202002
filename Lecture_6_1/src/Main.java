// �ܺ� Ŭ���� Stack�� �����մϴ�.
// �ܺ� Ŭ������ Main Ŭ�������� ������Ʈ�� �����ؼ� ����� ���� Ŭ���� �����Դϴ�.
// �ܺ� Ŭ������ ������ ���� 
class Example {
	// Ŭ���� �ȿ��� �� Ŭ���� ������Ʈ�� ����� �� �ִ� ������ �������� �� �ִ�.
	int t;
	// Ŭ���� �̸��� ���� �Լ��� ����ϸ�, ������ �Լ��� ������Ʈ�� �����Ҷ� �ڵ�ȣ��ȴ�.
	Example() {
		System.out.println("�����ڰ� ȣ��Ǿ����ϴ�.");
		t=0; 
	}
	void Set(int k, int n) {
		t = k*n;
	}
	void Print() {
		System.out.println("���� ����"+t+"�Դϴ�.");
	}
}

// Ŭ������ <E> ���·� �ڿ� �ٴ� ��찡 �ִµ�, �̰��� ���ø� Ŭ������, Ŭ���� ���ǽ� �ȿ��� ����ϴ�
// Ư�� ����Ÿ���� E�� ��ġ�� �� �ִ�. 
class Stack<E> {
	// ������ �ڷ����� �迭�� �� ��� �迭�� �����ϴ� ���� <����Ÿ��>[] ���·� ����Ÿ�Կ� ���ȣ�� �ٿ��� ����Ѵ�.
	// ���� ���, int �迭�����̶�� int[] array; ���·� ������ �������� �� �ִ�. 
	E[] data; // �迭 �����͸� ������ ���� ����
	int top;  // ���� ���� �����͸� ����ų ���� top����
	// �����ڸ� ����. ���� �����ڿ����� data �迭�� �����ϰ�, top������ �ʱ�ȭ.
	Stack() {
		// data�� ������ �Ҵ�.
		data= (E[]) new Object[1024]; //ĳ��Ʈ �����ڸ� �̿��Ͽ� �����͸� ���� �׸��� ����
		top = -1;
	}
	public void push(E v) {
		// 1. top���� 1 ������Ų��.
		top++;
		// 2. top�� �ش��ϴ� �迭�� v���� �����Ѵ�.
		data[top] = v;
	}
	public void pop() {
		// 0. ���� ������ ����� ���� �����߰ڴٰ� �����Ѵٸ�, �ش� �迭���� null�� �ٲ��ָ�ȴ�.
		// null�� �������ָ�, ���嵥���͸� �����ϴ� �Ͱ� ����. 
		data[top] = null;
		// 1. top �Լ��� 1 ���ҽ�Ų��.
		top--;
		
	}
	public E top() {
		// 1. top�� ����Ű�� �迭���� ��ȯ.
		return data[top];
	}
	public boolean empty() {
		// 1. top�� �ʱⰪ�� -1�̸� ������ ����ִ�.
		return top == -1; // = �� assign == �� ���� ������?(equal) �� �ǹ��Ѵ�. 
	}
	public int size() {
		// 1. ������� ��  top�� -1�̹Ƿ� 1�������Ѽ� ��ȯ�Ѵ�. 
		return top+1; 
	}
}
//���Ḯ��Ʈ�� �̿��ϴ� ��쿡�� ����� Ŭ������ ������ �ʿ�.
class Node<E> {
	E value;       // ���� ������ ����
	Node<E> next;  //���� ��带 ����ų ����
	// ������
	Node(E v){
		value = v;
		next = null;
	}
	// ������ �� ��带 ������ �Լ�
	public void setNext(Node<E> n) {
		next= n;
	}
	// ������ �ִ� ��尪�� ��ȯ�ϴ� �Լ�
	public Node<E> getNext() {return next;}
	// ���� ���� �Լ�
	public E getValue() {return value;}
}
//���Ḯ��Ʈ�� �̿��� ������ ����. ���ǻ� stackL �̶� Ŭ������ �������Ѵ�. 
class StackL<E> {
	Node<E> head;      // ���Ḯ��Ʈ�� ���� ���� ����ų ����
	int size;          // ���Ḯ��Ʈ�� ��� ���� ���� (�Ϲ������� ���Ḯ��Ʈ�� ��쿡�� ��� �� ��)
	// ������
	StackL(){
		head = null;
		size = 0;
		}
	// push �Լ�
	public void push(E v) {
		// 1. ��带 �ϳ� ����.
		Node<E> newNode = new Node(v);
		// 2. ������ ����� ���� ��带 head������ ��ġ.
		newNode.setNext(head);
		// 3. head���� ���� ������ ���� ��ġ.
		head= newNode;
		// Extra. size�� ����
		size++;
	}
	public void pop() {
		// 1. head�� ����Ű�� ����� ���� ��尪�� �����´�.
		head = head.getNext();
		// Extra. size�� ����
		size--;
	}
	// top �Լ�
	public E top() {
		// 1. head�� ����Ű�� ����� ���� ��ȯ�մϴ�.
		return head.getValue();
	}
	// empty �Լ�
	public boolean empty() {
		return head == null; 
	}
	// size �Լ� (���Ḯ��Ʈ������ �� �������������, ������ �����Ѵ�.)
	public int size() {return size;}
}
public class Main {

	public static void main(String[] args) {
		// Ŭ���� ������Ʈ�� �����ϱ� ���ؼ��� new ��� Ű���带 ����մϴ�.
		// <Ŭ����> <������Ʈ �̸�> = new <Ŭ����>();
		Example obj= new Example();
		// ������Ʈ�� �ִ� �Լ��� ����� ������ <������Ʈ �̸�>.<�Լ�(�޼ҵ�)>(<�Ķ���͵�>);
		obj.Print();
		obj.Set(3, 5);
		obj.Print();
		// �ٸ� ������Ʈ�� ������ ���, ������ ������Ʈ�� ������ ���� �ʴ´�
		Example obj1 = new Example();
		obj.Print();
		obj1.Print();
		// ���ø� Ŭ�������� ����� ����Ÿ���� ���ڿ�(String)���� �ϰ��� �� �� ������ ���� ������ �� �ִ�.
		StackL<String> stack= new StackL();
		stack.push("���");
		stack.push("������");
		System.out.println("���� �� ���� ���� "+stack.top()+" �Դϴ�.");
		stack.push("����");
		System.out.println("���� �� ���� ���� "+stack.top()+" �Դϴ�.");
		System.out.println("���� ���ÿ� ���ִ� �ڷ��� ������ "+stack.size()+"�� �Դϴ�.");
		stack.pop();
		System.out.println("���� �� ���� ���� "+stack.top()+" �Դϴ�.");
		System.out.println("���� ���ÿ� ���ִ� �ڷ��� ������ "+stack.size()+"�� �Դϴ�.");
		stack.push("���");
		System.out.println("���� �� ���� ���� "+stack.top()+" �Դϴ�.");
		System.out.println("���� ���ÿ� ���ִ� �ڷ��� ������ "+stack.size()+"�� �Դϴ�.");
		
	}
//*�迭���ϴ°��� �ξ� ���ε� ���� �� �����̵Ǹ� ���輺�� ��������. *
}
