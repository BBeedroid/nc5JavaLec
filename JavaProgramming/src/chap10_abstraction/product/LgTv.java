package chap10_abstraction.product;

public class LgTv extends Tv {
	public void powerOn() {
		System.out.println("LGtv 켬");
	}
	
	public void powerOff() {
		System.out.println("LGtv 끔");
	}
	
	public void operate(int channel) {
		System.out.println("LGtv 채널 " + channel + "로 변경");
		super.lastChannel = channel;
	}
	
}
