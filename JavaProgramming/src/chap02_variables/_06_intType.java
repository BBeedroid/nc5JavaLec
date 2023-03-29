package chap02_variables;

public class _06_intType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수 선언 및 초기화
		byte num1 = 10;
		short num2 = 20;
		
		//Java에서 정수 연산은 4byte로 진행되기 때문에 num1과 num2가 int 타입으로 변환된 후 연산된다
		//결과 값도 int 타입으로 나온다
		int result = num1 + num2;
		
		System.out.println(result);
		
	}

}
