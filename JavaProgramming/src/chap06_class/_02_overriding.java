package chap06_class;

import chap06_class.clac.Add;
import chap06_class.clac.Calc;
import chap06_class.clac.Minus;

public class _02_overriding {

	public static void main(String[] args) {
		Calc cal = new Calc();
		Add add = new Add();
		Minus min = new Minus();
		
		System.out.println(cal.add(4, 3));
		System.out.println(cal.minus(4, 3));
		System.out.println("-------------------------------------");
		System.out.println(add.add(4, 3));
		System.out.println(min.minus(4, 3)); //오버라이딩 삭제하면 부모 class 메소드 사용

	}

}
