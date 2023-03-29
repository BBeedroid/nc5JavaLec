package chap06_class.clac;

public class Add extends Calc { //Calc class 상속
	//멤버 변수: private => Alt + Shift + S => Generate Getter and Setter
	private int num1;
	private int num2;
	private int result;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public int add() {
		result = num1 + num2;
		return result;
	}
	
	//오버라이딩: 부모 class에 존재하는 메소드 재정의
	public int add(int a, int b) {
		return (a * a) + (b * b);
	}

	
}