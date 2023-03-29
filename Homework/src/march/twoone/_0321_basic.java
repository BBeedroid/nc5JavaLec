package march.twoone;

import march.twentyfirst.HybridCar;

public class _0321_basic {

	public static void main(String[] args) {
		/*1. Car(void speedUp(), void speedDown()) 인터페이스를 만들고
	    Car를 상속받는 ElectronicCar(void charge()), FuelCar(void addFuel()) 인터페이스를 만들고
	    ElectronicCar, FuelCar를 상속받는 HybridCar 클래스로 구현하세요.*/
		HybridCar car = new HybridCar();
		
		car.speedDown();
		car.speedUp();
		car.addFuel(10);
		car.charge(5);
	}

}
