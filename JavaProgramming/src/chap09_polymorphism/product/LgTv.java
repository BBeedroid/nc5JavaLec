package chap09_polymorphism.product;

public class LgTv extends Tv {
	public void powerOn() {
		System.out.println("제조사: LG");
		super.powerOn();
	}
	
	public void powerOff() {
		System.out.println("제조사: LG");
		super.powerOff();
	}
	
	public void operate(int channel) {
		super.operate(channel);
	}
	
}
