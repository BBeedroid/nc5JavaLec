package chap06_class;

import chap06_class.car.Car;

public class _04_useOfCar {

	public static void main(String[] args) {
		//부품 만들기(인스턴스화, 객체화)
		Car car = new Car();
		
		car.company = "현대";
		car.model = "제네시스";
		car.color = "검정";
		car.price = 5000;
		
		car.carInfo();
		
		System.out.println();
		
		Car car2 = new Car();
		
		car2.company = "기아";
		car2.model = "K9";
		car2.color = "하얀";
		car2.price = 4000;
		
		car2.carInfo();

	}

}
