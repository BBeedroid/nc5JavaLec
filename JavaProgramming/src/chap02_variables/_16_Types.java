package chap02_variables;

public class _16_Types {

	public static void main(String[] args) throws InterruptedException {
		//1-1. byte 타입의 변수 선언, 초기화
		byte bNum1 = -128;
		byte bNum2 = 127;
		
		/*1-2. 범위를 초과하는 값을 저장하면 에러 발생
		byte bNum3 = -129;
		byte bNum4 = 128;*/
		
		/*1-3. 선언된 byte 타입의 변수 값을 증감연산자 사용하여 범위를 초과하는 값으로 변경했을 때
		/증감연산자 ++, --
		 num1++; => num1 = num1 + 1; num1--; => num1 = num1 - 1;*/
		
		bNum1--;
		bNum2++;
		
		System.out.println(bNum1); //최소값(-128)보다 값이 작아질 경우 최대값(127)부터 다시 시작
		System.out.println(bNum2); //최대값보다 값이 커질 경우 최소값부터 다시 시작
		
		//2-1. char 타입의 변수 선언, 초기화
		char ch1 = 'A';
		char ch2 = 65;
		char ch3 = '\u0041'; //유니코드 값을 알 때에는 바로 저장해도 무방하다
		
		System.out.println(ch1 + ", " + ch2 + ", " + ch3);
		
		//2-2. 유니코드 값을 모르는 문자의 유니코드를 추출하는 방법
		int uniCode = '자';
		
		System.out.println(uniCode);
		
		//2-3. char 타입에서 빈 칸을 변수에 저장하고 싶을 때에는 space바로 공백 한 칸을 넣어줘야 한다
		//char empty = ''; 완전 빈 칸에 대한 유니코드는 존재하지 않으나 space바에 대한 유니코드는 존재한다 
		char empty = ' ';
		
		//3-1. short, int, long 타입의 변수 선언, 초기화
		short sNum1 = 10;
		short sNum2 = 20;
		long lNum1 = 10L;
		//long lNum2 = 10000000000000; int 범위를 초과하는 리터럴에 L을 표기하지 않으면 에러 발생
		long lNum2 = 10000000000000L;
		
		long lNum3 = 1000000000000000000L;
		long lNum4 = 1000000000000000000l; //대소문자 구분은 없으나 L 사용 추천
		
		//3-2. 자바에서 정수 연산은 기본적으로 4byte인 int 타입으로 연산되기 때문에
		//short 타입의 변수도 int 타입으로 자동 변환 후 연산하고 결과도 int 타입으로 나온다
		int result1 = sNum1 + sNum2;
		//int 타입보다 바이트 크기가 큰 타입과 연산될 때에는 4byte로 연산되지 않고 바이트 크기가 큰 타입으로 연산이 진행된다
		long result2 = lNum2 + result1;
		
		//4-1. float, double 타입의 변수 선언, 초기화
		float fNum1 = 3.14F;
		float fNum2 = 3.14f;
		float fNum3 = 5.245F;
		
		double dNum1 = 89.1245;
		double dNum2 = 11.984;
		
		//4-2. float 타입의 변수끼리 연산하더라도 double 타입으로 자동 변환 후 연산하고 결과도 double 타입으로 나온다
		double result3 = fNum1 + fNum2;
		double result4 = dNum1 / result3;
		
		//5. boolean 타입의 변수 선언, 초기화
		String id = "bitNaver5";
		boolean idValidation = false; //boolean 기본형은 false
		
		if(id.length() >= 5 && id.length() < 20) {
			idValidation = true;
		}
		//idValidation == true => idValidation
		//idValidation == false => !idValidation
		if(idValidation == true) {
			System.out.println("사용할 수 있는 아이디입니다.");
		} else {
			System.out.println("아이디는 5자 이상 20자 미만으로 만들어주세요.");
		}
		
		//6. var 타입의 변수 선언, 초기화 => 항상 선언과 동시에 초기화가 진행되어야 한다
		var str = "Hello";
		//var str2; => 선언만 할 시 에러 발생
		
		//str은 자료형 추론에 의해 String 타입으로 결정, 자료형 추론이 끝난 변수에 다른 타입의 값을 저장하면 에러 발생
		//str = 100;
		
		var result5 = dNum2 + fNum2;
		
		//7. 상수의 선언과 초기화
		//DB 커넥션 풀의 최대 DB 연결 개수를 20로 지정
		final int MAX_CONNECTION = 20;
		final int MAX_VALUE; //선언만 하고 나중에 값을 저장해도 된다
		MAX_VALUE = 10;
		
		//MAX_CONNECTION = 30; 한 번 지정된 상수의 값은 변경할 수 없다
		
		int userCnt = 0;
		
		while(true) {
			userCnt++;
			System.out.println("현재 사용자 수: " + userCnt);
			
			if(userCnt > MAX_CONNECTION) {
				break;
			}
			Thread.sleep(1000);
		}
		
		System.out.println("DB 연결이 모두 사용 중입니다.");
	}

}
