import java.util.Scanner;

public class Main {
	public static boolean isValid(String pp) {
		char[] stack = new char[1024];
		int top = -1;
		
		for(int i = 0; i<pp.length(); i++) {
			char ch = pp.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack[++top] = ch;
			}
			else if (ch == ')') {
				if (top == -1 || stack[top] != '(') return false;
				top--;
			}
			else if (ch == '}') {
				if (top == -1 || stack[top] != '{') return false;
				top--;
			}
			else if (ch == ']') {
				if (top == -1 || stack[top] != '[') return false;
				top--;
			}
		}
		return top == -1;
	}
	
	public static void main(String[] args) {
		int[] stack = new int[1000];
		int top = -1;
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if(isValid(s)) System.out.println("YES");
		else System.out.println("NO");
		
		while(true) {
		int exp= scan.nextInt();
		
			for(int i = 0; i<exp; i++) {
				stack[top] = i;
				System.out.println("+");
				top++;
			}
			if(stack[top]> exp) {
				stack[top-exp]= stack[top]-exp;
				System.out.println("-");
				top--;
			}
			
	
	
		
		
		
		
	}
}
}

