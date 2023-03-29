package chap07_inherit;

import chap07_inherit.car.Car;
import chap07_inherit.car.HyundaiCar;
import chap07_inherit.car.KiaCar;

public class _01_withoutInherit {

	public static void main(String[] args) {
		//1. 객체생성
		Car car = new Car();
		KiaCar kCar = new KiaCar();
		HyundaiCar hCar = new HyundaiCar();

		car.company = "GM";
		car.company = "Kia";
		car.company = "HyundaiCar";

	}

}
