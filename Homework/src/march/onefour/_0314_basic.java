package march.onefour;

public class _0314_basic {

	public static void main(String[] args) {
		/*1. int num = 10;을 선언하고 증감연산자를 통해 다음과 같이 출력하세요. 출력된 값은 모두 증감연산자가 포함된 상태입니다.
		 11
    	 12
    	 12
    	 10
    	 10
     	 8		*/
		int num = 10;
		
		System.out.println(++num); //출력값: 11, 실제값: 11
		System.out.println(++num); //출력값: 12, 실제값: 12
		System.out.println(num--); //출력값: 12, 실제값: 11
		System.out.println(--num); //출력값: 10, 실제값: 10
		System.out.println(num--); //출력값: 10, 실제값: 9
		System.out.println(--num); //출력값: 8, 실제값: 8
		
		/*2. 관계연산자(<, >) 두 개를 사용하여 int a = 10; int b = 20; 의 관계를 다음과 같이 출력하세요.
    	 true
    	 false	*/
		int a = 10;
		int b = 20;
		
		System.out.println((boolean)(a < b));
		System.out.println((boolean)(a > b));

	}

}
