package march.onefour;

public class _0314_middle {

	public static void main(String[] args) {
		/*1. 삼항 조건 연산자를 이용하여 int age = 29; 일 경우
	    20대입니다. 를 출력하고 age가 30이상일 경우 
	    20대가 아닙니다.를 출력하세요.*/
		//삼항 조건 연산자: A ? B : C;
		int age = 29;
		
		String result = (age < 30) ? "20대입니다." : "20대가 아닙니다.";
		System.out.println(result);
		
		/*2. 1~100까지의 숫자 중 2와 3의 공배수를 출력하세요.
		for(int i = 1; i <= 100; i++) {
			if()  {
				System.out.print(i + ", ");
			} => if문의 조건만 완성*/
		for(int i = 1; i <= 100; i++) {
			if((i % 2 == 0) && (i % 3 == 0)) {
				System.out.print(i + ", ");
			}
		}

	}

}
