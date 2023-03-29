package chap01_hello;

public class _02_Operator {

	public static void main(String[] args) {
		//1. 부호 연산자(+, -)
		int iNum1 = 5;
		System.out.println(-iNum1); //-가 부호 연산자로 작용
		
		int iNum2 = 59;
		
		System.out.println(iNum2++);
		System.out.println(++iNum2);
		
		iNum2 %= 5; //iNum2를 오른쪽 항의 값 5로 나눈 후 나머지 값을 iNum2에 저장한다 => iNum2 = 1
		
		System.out.println(iNum2--);
		System.out.println(--iNum2);
		
		int Num1 = 5;
		int Num2 = 10;
		//int result; result가 관계 연산자, 논리 연산자를 사용하고 있기 때문에 에러 발생
		boolean result;
		result = ((Num1 += 10) > 0 && (Num2 += 10) > 0);
		
		System.out.println(result);
		System.out.println(Num1);
		System.out.println(Num2);
		
		int a = 5;
		System.out.println(a++); //출력 값: 5, 실제 값: 6
		System.out.println(a); //a = 6
		System.out.println((a++ + 5) * 3);
		//결과 값: (출력 값 6 + 5) * 3 = 33, a++: 6 + 1 = 7이 되나 후위 증가 연산자여서 연산에 반영되지 않는다
		a = (a++ + 5) * 3;
		//결과 값: (출력 값 7 + 5) * 3 = 36, a++: 7 + 1 = 8이 되나 후위 증가 연산자여서 연산에 반영되지 않는다
		System.out.println(a); //36

	}

}
