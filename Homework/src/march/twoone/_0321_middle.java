package march.twoone;

import march.twentyfirst.Calculator;

public class _0321_middle {

	public static void main(String[] args) {
		/*1. Calculator 클래스를 만들고 인스턴스 중첩 클래스로 Add, Sub, Mul, Div 클래스를 만드세요.
    	 각각 int add(int a, int b)
       	 int sub(int a, int b)
       	 int mul(int a, int b)
       	 int div(int a, int b)
   		 메소드를 가진 인스턴스 중첩 클래스를 구현하시면 됩니다.*/
		//1. 외부 class 객체 생성
		Calculator cal = new Calculator();
		
		//2. 인스턴스 중첩 class 객체 생성
		Calculator.Add add = cal.new Add();
		int a = add.getNum1();
		int b = add.getNum2();
		System.out.println("int add(int a, int b) 결과값은 " + add.add(a, b) + "입니다.");
		
		Calculator.Sub sub = cal.new Sub();
		int c = sub.getNum3();
		int d = sub.getNum4();
		System.out.println("int sub(int a, int b) 결과값은 " + sub.sub(c, d) + "입니다.");
		
		Calculator.Mul mul = cal.new Mul();
		int e = mul.getNum5();
		int f = mul.getNum6();
		System.out.println("int mul(int a, int b) 결과값은 " + mul.mul(e, f) + "입니다.");
		
		Calculator.Div div = cal.new Div();
		int g = div.getNum7();
		int h = div.getNum8();
		System.out.println("int div(int a, int b) 결과값은 " + div.div(g, h) + "입니다.");
	}

}
