package chap09_polymorphism;

import chap09_polymorphism.product.LgTv;
import chap09_polymorphism.product.SamsungTv;
import chap09_polymorphism.product.Tv;

public class _03_withPolymorphismTv {

	public static void main(String[] args) {
		//1. 다형성을 이용해 TV 운용하기
		Tv tv = new LgTv();
		//Tv tv = new SamsungTv();
		
		tv.powerOn();
		tv.operate(11);
		tv.powerOff();
		tv.powerOn();
		
		Object o = new LgTv();
		o = new SamsungTv();
		o = new Tv();
		
		//Map<String, Object>
		//{company: ["현대", "기아", "쉐보레"]
		
		System.out.println(tv.toString());

	}

}
