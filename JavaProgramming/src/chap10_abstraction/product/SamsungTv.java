package chap10_abstraction.product;

public class SamsungTv extends Tv {
	public void powerOn() {
		System.out.println("SamsungTv 전원 켜기");
	}
	
	public void powerOff() {
		System.out.println("SamsungTv 전원 끄기");
	}
	
	public void operate(int channel) {
		System.out.println("SamsungTv 채널 " + channel + "로 이동");
		super.lastChannel = channel;
	}
	
}
