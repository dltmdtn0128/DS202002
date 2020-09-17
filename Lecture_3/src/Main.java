import java.util.Scanner;

public class Main {
	//1 부터 n까지 더하는 함수
	static long sum(int n) {
		long s = 0;
		for(int i=1;i<=n;i++) {
			s+=i;
	}
		return s;
	}
	//1 부터 n까지 더하는 함수(개선버전)
	static long sum1(int n) {
		long s = n;
		return s*(s+1)/2;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1부터 더하고자하는 숫자를 입력하세요 : ");
		int n = scan.nextInt();
		
		//System.currentTimeMillis();프로그램이 시작하면서 시간을 계산해주는 함수
		//특정날짜의 시간을 0으로 시작해서 현재의 시간을 밀리초로 나타냅니다.
		long t = System.currentTimeMillis(); //초 시작
		//여기서 작업을 시작. 
		
		System.out.println("sum from 1 to"+n+"is "+sum1(n)+".");
		
		long f = System.currentTimeMillis();// 초 끝
		System.out.println("Elapsed time is "+(f-t)+"ms."); //초 끝 - 초 시작 = 경과시간 계산
		//프로그램 모듈을 실행하기 전의 현재시간을 기록
	}

}
