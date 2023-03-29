package chap11_interface.device;

public class LgTv implements Tv {

	@Override
	public void show() {
		System.out.println("LG TV 화면에 영상이 뜹니다.");		
	}

	@Override
	public void powerOn() {
		System.out.println("LG TV를 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV를 끕니다.");
	}

	@Override
	public void sound() {
		System.out.println("LG TV 스피커에서 소리가 납니다.");
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("LG TV 채널을 " + channel + "로 바꿉니다.");
	}

}
