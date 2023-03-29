package march.twentyfirst;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void speedUp() {
		System.out.println("가속합니다.");
	}

	@Override
	public void speedDown() {
		System.out.println("감속합니다.");
	}

	@Override
	public void addFuel(int fuel) {
		System.out.println("연료를 " + fuel + "리터 주유합니다.");
	}

	@Override
	public void charge(int electronicCharge) {
		System.out.println("배터리를 " + electronicCharge + "% 충전합니다.");
	}

}
