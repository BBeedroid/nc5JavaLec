package chap11_interface;

import chap11_interface.device.ElectronicDevice;
import chap11_interface.device.LgTv;
import chap11_interface.device.SamsungTv;
import chap11_interface.device.Tv;

public class _03_multiInheritTv {

	public static void main(String[] args) {
		Tv tv = new LgTv();
		
		tv.powerOn();
		tv.show();
		tv.sound();
		tv.changeChannel(5);
		tv.powerOff();
		tv.reset();
		
		tv = new SamsungTv();
		
		tv.powerOn();
		tv.show();
		tv.sound();
		tv.changeChannel(10);
		tv.powerOff();
		tv.reset();
		
		//static 메소드는 선언된 인터페이스를 직접 호출해서 사용해야 한다
		ElectronicDevice.warn();
		//static 메소드는 상속 받은 자식class에서 호출 불가하다
		//Tv.warn();
	}

}
