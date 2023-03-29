package chap02_variables;

public class _14_Variables {

	public static void main(String[] args) {
		//1. 변수란?
		//좋아요 기능 예시
		int likeCnt; //좋아요 개수
		boolean isUserLike; //로그인한 사용자가 좋아요를 눌렀는지 여부
		
		//2. 변수의 선언
		//2-1. 첫 글자는 문자, $, _만 허용
		int $price;
		int _bit;
		int naverCloud;
		
		/*
		 * int %bit; int 2023year; int @coding;
		 복수 주석처리 Ctrl + Shift + / 또는 Ctrl + / */
		
		//카멜케이스 + 직관적 변수명
		int likeCnt2;
		int boardCnt; //게시글 개수
		int osOutPrintCnt; // OS 출력장치의 출력 횟수
		
		int nuri; //본인만 알 수 있는 변수명은 좋지 않다
		
		//변수명 대소문자 구분을 통해 같은 의미의 변수를 여러 개 생성할 수 있다
		int lunchTime;
		int LunchTime;
		int luNchTime;
		
		//3. 변수의 사용
		//변수에 값을 저장(대입)
		//최초 값 저장은 초기화라고 한다
		likeCnt = 125;
		//변수의 선언과 동시에 초기화
		int studentCnt = 30;
		//상수를 제외한 변수는 값의 변경이 가능하다
		studentCnt = 51;
		
		//초기화 되지 않은 변수 사용 시 에러 발생
		int errorVal;
		//System.out.println(errorVal); => 변수가 초기화 되지 않았다는 에러
		
		//변수의 사용은 변수명을 통해 메모리에 저장된 값을 가져와서 사용한다
		System.out.println(likeCnt);
		System.out.println(studentCnt);
		
		//4. 이스케이프 문자
		System.out.println("리터럴은 \"초기화\" 코드에 자주 등장한다.");
		System.out.println("이스케이프 문자는 '특수 기능'을 수행한다."); //큰따옴표 내에서는 정상 작동
		System.out.println('\''); //문자로 작은 따옴표 표시 시 이스케이프 문자 필요
		
		String tempStr = "aaaa \"bbbbb\"";
		System.out.println(tempStr);
		
		//Tap 키만큼 공백: \t 줄바꿈할 때: \n
		System.out.print("12시 50분부터 \t점심시간 \n맛점하세요.\n");

	}

}
