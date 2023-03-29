package chap06_class;

import chap06_class.clac.Multiple;

public class _03_overloading {

	public static void main(String[] args) {
		Multiple mul = new Multiple();
		mul.setNum1(4);
		mul.setNum2(3);
		
		System.out.println("매개변수 없는 multiple()");
		System.out.println(mul.multiple());
		System.out.println("매개변수 한 개인 multiple()");
		System.out.println(mul.multiple(4));
		System.out.println("매개변수 두 개인 multiple()");
		System.out.println(mul.multiple(4, 3));

	}

}
