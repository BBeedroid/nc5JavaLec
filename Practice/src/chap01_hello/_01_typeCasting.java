//project명 대문자 시작, package명 소문자 시작
package chap01_hello;

//class명 대문자 or 언더바 시작
public class _01_typeCasting {

	//메인(실행) 메소드, method명 소문자 시작
	public static void main(String[] args) {
		short a = 2;
		short b = 3;
		//short result = (a + b); Java는 정수형 연산을 int 타입으로 진행하므로 short 타입 연산 시 에러 발생
		int result = ((short)(a + b)); //강제 형변환 필요
		
		System.out.println(result);
		
		long lNum1 = 100000001L;
		long lNum2 = 99999999L;
		long result2 = (lNum1 + lNum2); //long 타입은 int 타입보다 byte 크기가 커서 자동 형변환
		
		System.out.println(result2);
		
		int iNum1 = 50;
		long lNum3 = 99999950L;
		long result3 = (iNum1 + lNum3); //long 타입으로 자동 형변환 되기 때문에 바로 연산 가능하다
		
		System.out.println(result3);
		
		byte bNum1 = 5;
		float fNum1 = 3.14F;
		float result4 = (bNum1 + fNum1); //정수 타입에서 실수 타입으로 자동 형변환
		
		System.out.println(result4);
		
		long lNum4 = 1000000L;
		double dNum1 = 10.1;
		double result5 = (lNum4 + dNum1);
		
		System.out.println(result5);
		
		
	}

}
