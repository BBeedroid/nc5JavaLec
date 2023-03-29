package chap18_enum;

import chap18_enum.enums.DefaultMonth;

public class _02_withDefaultEnum {

	public static void main(String[] args) {
		//DefaultMonth형의 변수 선언
		//DefaultMonth.JAN을 값으로 갖는 DefaultMonth 열거형 객체 생성
		DefaultMonth jan = DefaultMonth.JAN;
		
		//DefaultMonth의 열거형 객체 이름(상수의 이름)
		System.out.println(jan); //JAN
		//ordinal() => 해당 상수의 index
		System.out.println(jan.ordinal()); //0
		//변수 선언 없이 DefaultMonth의 열거형 객체 이름(출력 후 삭제됨)
		System.out.println(DefaultMonth.AUG); //AUG
	}

}
