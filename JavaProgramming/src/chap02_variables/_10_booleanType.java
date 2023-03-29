package chap02_variables;

public class _10_booleanType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. int 타입 변수 선언 및 초기화
		int num1 =10;
		int num2 = 15;
		
		//2. boolean 타입 변수 선언 및 연산을 통한 초기화
		//삼항연산자 조건 ? 결과1 : 결과 2
		//조건이 true일 경우 결과1, false일 때는 결과 2
		//% 나누고 남은 값 표시, 배수 확인할 때에 주로 사용
		boolean result1 = num1 % 2 == 0 ? true : false;
		boolean result2 = num2 % 2 == 0 ? true : false;
		
		//3. boolean 타입 값 출력
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
