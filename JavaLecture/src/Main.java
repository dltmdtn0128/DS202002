import java.util.Scanner; //scanner 입력하면 자동으로 입력됨

//public은 공개되어있다는 의미, 이 파일 이외에서 해당 클래스를 사용할 수 있음을 의미
//아무것도 붙이지 않으면 자동으로 private 선언됨
//private가 붙어있으면 외부 파일에서 해당 클래스를 사용할 수 없음
//class main 은 main 이라는 클래스를 의미함
public class Main {
// main 함수는 자바 프로젝트 실행하면 가장 먼저 실행되는 함수.
// static 이 붙은 경우 클래스 오브젝트와 상관없이 실행하거나 참조할 수 있음을 의미
	public static void main(String[] args) {
// 출력은 System.out.println()을 사용.
// 줄바꿈이 필요없는경우 System.out.print()를 사용.
		System.out.println("줄바꿈을 합니다.");
		System.out.print("줄바꿈을 안할거에요.");
		System.out.println("이줄은 앞에 쓴 내용과 붙어서 나올겁니다.");
		//문자열 더하기(+)는이와 같이 이루어짐
		//문자열+문자열도 가능하지만 문자열+숫자 등 다양한 형태가 가능합니다.
		System.out.println("나의 나이는"+"20살입니다.");
		System.out.println("당신의 나이는"+20+"살입니까?");
//*변수의 사용*
//변수라는 것은 바뀌는 내용이 있는 것을 자바의 저장소에 저장하는 것을 의미, 그 저장소에 이름을 붙여서 변수라고 함.
//변수는 <변수의 타입> <변수의 이름> 형태로 정의함.
// int, long, float, double, char, string
		int age;
//변수의 값을 저장할 때에는 <변수명> = <저장할 값>; 형태로 함.
		age = 20;
		System.out.println("나의 나이 : "+age);
// 사용자 입력을 자바에서 처리하기 위해서는 어려움.
// 간단한 프로그램 작성할 때 입력하는 방법을 패턴으로 이해하는 것이 필요.
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 나이는 ? ");
		age = scan.nextInt();
		System.out.println("나의 나이는"+age+"살입니다.");
// 조건문은 if라는 것이 있음
// if - else if - else 형태로 이루어짐
// if(조건) ... 하면, 조건이 "참"인 경우 ...가 실행됨.
// else ... 는 if 조건이 "거짓"인 경우 ... 가 실행.
		if(age <= 7) {
			System.out.print(""+age+" : ");
			System.out.println("저는 어린이입니다.");
		}
		else if(age <= 19){
			System.out.print(""+age+" : ");
			System.out.println("저는 청소년입니다.");
		}
		else {
			System.out.print(""+age+" : ");
			System.out.println("나 다큼.");
		}
//반복문 for( ; ; ) 형태와 while( 조건문 ) 형태가 있음.
// for(초기값; 조건값; 증감값;) 형태로 이루어져 있음.
// ex) a부터 b까지의 값을 변수 i에 주고서 명령어를 반복해서 실행하고 싶다면,
// for(int i = a; i<=b; i++) ...
		for(int i=1; i<=5; i++) {
			System.out.println("출력 : "+i);
		}
// 이중 for문은 for문이 두개로 겹쳐있는 경우
// 이 경우 변수는 i,j형태로 구성하게됨
		for(int i=1;i<=age; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
			}
	}