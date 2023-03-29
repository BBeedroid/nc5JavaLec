package chap18_enum;

import chap18_enum.enums.ValueMonth;

public class _03_useOfEnumValue {

	public static void main(String[] args) {
		//enum의 객체를 만들 때 생성자가 자동으로 호출된다
		//호출된 상수의 값은 생성자의 매개변수로 들어가서 선언된 변수에 대입된다
		ValueMonth mar = ValueMonth.MAR;
		
		System.out.println(mar.getMonthVal());
		
		//여러 형태의 enum 객체 생성
		ValueMonth jan = ValueMonth.JAN;
		ValueMonth feb = ValueMonth.valueOf("FEB");
		ValueMonth apr = Enum.valueOf(ValueMonth.class, "APR");
		
		System.out.println("jan : " + jan);
		System.out.println("feb : " + feb);
		System.out.println("apr : " + apr);
		
		//enum 객체 배열
		ValueMonth[] vmArr = ValueMonth.values();
		for(ValueMonth v : vmArr) {
			System.out.println(v.name() + "은 " + v.ordinal() + "번째 index에 있습니다.");
		}
	}

}
