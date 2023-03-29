package chap10_abstraction.product;

public abstract class Tv {
	public int lastChannel = 1;
	
	//전원을 켜다, 끄다 추상메소드
	//선언부만 정의하고 구현부는 자식class에서 정의한다
	public abstract void powerOn();
	
	public abstract void powerOff();
	
	public abstract void operate(int channel);
	
	//일반메소드
	public void moveTo(int channel) {
		System.out.println(channel + "로 이동합니다.");
	}
	
	public void channelUp() {
		lastChannel++;
	}
	
	public void channelDown() {
		lastChannel--;
	}
	
}
