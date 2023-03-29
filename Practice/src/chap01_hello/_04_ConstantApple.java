package chap01_hello;

import java.util.Scanner; //Scanner 클래스 사용 시 import 필요
import java.text.DecimalFormat; //콤마 사용

public class _04_ConstantApple {

	public static void main(String[] args) {
		//상수 사과 가격, 반드시 대문자 표기
		final int PRICE;
		int appleNumber;
		int cost;
		
		PRICE = 1000;
		//사용자로부터 값을 입력 받을 수 있는 Scanner 클래스 객체화
		Scanner appleSc = new Scanner(System.in);
		
		System.out.println("사과를 몇 개 사시나요?");
		System.out.println("개수 :");
		
		//입력 받은 개수는 appleNumber에 대입한다
		appleNumber = appleSc.nextInt();
		
		//상수 가격 * 변수 개수의 값을 cost에 대입한다
		cost = PRICE * appleNumber;
		
		//숫자가 길어질 수 있기에 콤마를 표현한다(생략 가능)
		DecimalFormat comma = new DecimalFormat("###,###,###,###");
		String bill = comma.format(cost);
		
		//최종 금액 출력
		System.out.println("사과 총 금액은 " + bill + "원입니다.");
		
	}

}
