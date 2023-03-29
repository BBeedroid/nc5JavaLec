package chap08_static;

import chap08_static.clazz.Car;

public class _01_useOfStatic {

	public static void main(String[] args) {
		//1. class 변수와 class 메소드()의 사용
		//객체 생성 없이 바로 사용 가능하다
		Car.grade = "A";
		Car.printCurrentGrade();
		/*인스턴스 변수와 인스턴스 메소드()는 객체 생성 없이 접근하거나 호출하면 에러 발생
		Car.compony = "기아";
		Car.carInfor();*/
		
		//인스턴스 변수와 인스턴스 메소드()는 객체가 생성됐을 때에만 사용 가능하다
		Car c = new Car();
		c.company = "현대";
		c.model = "제네시스";
		c.carInfor();
		
	}

}
