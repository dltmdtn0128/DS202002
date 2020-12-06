// Lecture 14
// 분할정복을 이용하여 히스토그램에서 가장 큰 넓이의 직사각형 넓이 구하기
// 입력
// 처음에 히스토그램의 샘플 갯수 N이 입력됩니다.
// 다음에 각 샘플들의 도수들이 N개 입력됩니다.
// 예를 들어서 {3,2,6,7} 의 도수를 가지는 4개의 샘플이 있는 히스토그램은
// 4 3 2 6 7 
// 로 입력이 주어집니다.
// 이에 대한 답변을 직사각형의 넓이를 출력하면 됩니다
// 12
import java.util.Scanner;
public class Main {
		//분할정복을 위한 함수
		//배열 v에서 범위(a,b) 구간에서 최대크기의 직사각형 넓이 반환
	
	static int histo(int[] v, int left, int right) {
		
		if(left == right) return 0;
		if(left+1 == right) return v[left];
		//중간
		int mid = (left+right)/2;
		int l = histo(v,left,mid);
		int r = histo(v,mid,right);
		//중간에 겹치는것
		int i = mid, j=mid+1;
		//왼 오 큰넓이 결정
		int ret = Math.max(l, r);
		//겹치는 직사각형 2개 구해보기
		int h = Math.max(v[left], v[right]);
		ret = Math.max(ret, h*2);
		
		while(left<i || j<right) {
			//왼쪽
			if(left<i && j<right) {
				//높은거 확장
				if(v[i-1]<v[j+1]) h = Math.min(h, v[++j]);
				else h = Math.min(h, v[--i]);
			}
			//오른쪽범위 넘으면 왼쪽확장
			else if(left<i) h = Math.min(h, v[--i]);
			//vice versa
			else if(j<right) h = Math.min(h, v[++j]);
			ret = Math.max(ret, h*(j-i+1));
		}
		return ret;
		}
	// 히스토그램에서 최대의 직사각형 넓이를 계산해서 출력하는 함수
			// v : 히스토그램의 샘플들의 도수들의 배열 (0 이상의 자연수)
			// n : 샘플의 갯수
	static int histo(int[] v, int n) {
		// v[0..n-1] 구간의 넓이를 구해서 그 값을 반환합니다.
		return histo(v,0,n-1);
	}

	public static void main(String[] args) {
		// 입력을 위해서 스캐너 오브젝트 생성
		Scanner scan = new Scanner(System.in);
		//샘플 갯수 N을 입력
		int n = scan.nextInt();
		// n의 공간을 갖는 배열 생성
		int[] v = new int[n];
		// n개의 배열 공간에 입력된 값을 넣는다
		for(int i =0; i<n; i++) {
			v[i] = scan.nextInt();
		}
		// histo() 함수를 호출해서 그 결과 저장
		int r = histo(v,0,n-1);
		// 결과출력
		System.out.println(r);

	}

}
