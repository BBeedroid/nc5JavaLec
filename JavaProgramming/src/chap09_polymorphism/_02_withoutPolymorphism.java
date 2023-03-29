package chap09_polymorphism;

import chap09_polymorphism.product.LgTv;

public class _02_withoutPolymorphism {

	public static void main(String[] args) {
		//1. 다형성을 사용하지 않고 많은 TV 운용하기
		LgTv lgtv = new LgTv();
		//Samsung TV로 바꾸려면 SamsungTv stv = new SamsungTv(); => 번거로움
		
		lgtv.powerOn();
		lgtv.operate(13);
		lgtv.powerOff();
		lgtv.powerOn();

	}

}
