package chap02_variables;

public class _17_typeCasting {

	public static void main(String[] args) {
		//1. 자동 형변환1 - 바이트 크기가 작은 변수를 바이트 크기가 큰 변수에 대입할 때
		short sNum1 = 10;
		int iNum1 = sNum1;
		
		//2. 자동 형변환2 - 보다 세밀한 표현 범위를 갖는 타입에 대입될 때
		long lNum1 = 1000000000L;
		float fNum1 = lNum1;
		
		//3. 강제 형변환1 - 바이트 크기가 큰 변수를 바이트 크기가 작은 변수에 대입할 때
		int uniCode = 65;
		char ch = (char)uniCode;
		
		//4. 강제 형변환에서 범위를 초과한 값을 변환했을 때
		long lNum2 = 32770L;
		short sNum2 = (short)lNum2; //short 범위: -32,768~32,767
		
		System.out.println(sNum2);
		
		//5. 연산에서의 형변환
		long result = lNum2 + iNum1;
		int result2 = (int)lNum2 + iNum1;
		
		//6. 문자열 결합 연산에서의 형변환
		String str = "java";
		int version = 11;
		
		System.out.println(str + version);

	}

}