package chap02_variables;

public class _08_floatAndDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. float 타입 변수 선언 및 초기화
		float fNum1 = 3.14f;
		float fNum2 = 5.245F;
		
		//2. double 타입 변수 선언 및 초기화
		double dNum1= 89.1245;
		double dNum2 = 11.984;
		
		//3. float 타입 변수의 연산
		//float끼리의 연산은 double 타입으로 변경되어 진행, 결과 값도 double 타입으로 나온다
		double result1 = fNum1 + fNum2;
		
		//4. double 타입 변수의 연산
		double result2 = dNum1 / dNum2;
		
		//5. 실수형 변수 출력
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
