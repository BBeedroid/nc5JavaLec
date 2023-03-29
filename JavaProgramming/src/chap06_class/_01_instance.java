package chap06_class;

import chap06_class.clac.Add;
import chap06_class.clac.Calc;
import chap06_class.clac.Divide;
import chap06_class.clac.Minus;
import chap06_class.clac.Multiple;

public class _01_instance {

	public static void main(String[] args) {
		//객체화(인스턴스화)
		Add add = new Add();
		
		add.setNum1(10);
		add.setNum2(20);
		System.out.println(add.add());
		//add.setResult(add.getNum1() + add.getNum2());
		
		
		Minus min = new Minus();
		
		min.setNum1(20);
		min.setNum2(10);
		System.out.println(min.minus());
		
		
		Multiple multi = new Multiple();
		
		multi.setNum1(10);
		multi.setNum2(20);
		System.out.println(multi.multiple());
		
		
		Divide div = new Divide();
		
		div.setNum1(10);
		div.setNum2(5);
		System.out.println(div.divide());

		//설계도로 부품을 만드는 작업 == 인스턴스화, 객체화
		//인스턴스화: 생성자를 통해 객체를 생성하고 heap 메모리 영역에 저장한다. 항상 new 키워드와 함께 사용
		Calc cal = new Calc();
		
		int receiveNum = cal.add(10, 20);
		
		//리턴 값을 받아주는 변수가 없으면 연산 후 결과가 메모리에 저장되지 않고 삭제된다.
		cal.add(10, 20);
		
		System.out.println(cal.add(10, 20));
		
		System.out.println(cal.minus(cal.add(10, 20), cal.divide(20, 10)));
		
		Calc cal2 = new Add();
		System.out.println(cal2.add(4, 3)); //16 + 9
		
		Calc cal3 = new Minus();
		System.out.println(cal3.minus(4, 3)); //16 - 9

	}

}
