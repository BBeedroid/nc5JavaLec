package chap12_nestedclass;

import chap12_nestedclass.clazz.Calc;

public class _05_anonymousClass {

	public static void main(String[] args) {
		//익명 중첩 class 선언과 Calc 인터페이스 구현
		//익명 중첩 class는 추상class나 인터페이스를 구현한 class 없이 사용할 수 있다.
		Calc cal = new Calc() {
			@Override
			public void calculator(int a, int b) {
				System.out.println("결과는 " + (a + b) + "입니다.");
			}
		};
		
		cal.calculator(10, 20);

	}

}
