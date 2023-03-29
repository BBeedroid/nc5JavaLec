package march.twentyfirst;

public class Calculator {
	public class Add {
		int num1 = 10;
		int num2 = 5;
		int result1;

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
		public int getResult1() {
			return result1;
		}
		public void setResult1(int result1) {
			this.result1 = result1;
		}
		
		public int add(int a, int b) {
			result1 = num1 + num2;
			return result1;
		}
	}
	
	public class Sub {
		int num3 = 30;
		int num4 = 10;
		int result2;
		
		public int getNum3() {
			return num3;
		}
		public void setNum3(int num3) {
			this.num3 = num3;
		}
		public int getNum4() {
			return num4;
		}
		public void setNum4(int num4) {
			this.num4 = num4;
		}
		public int getResult2() {
			return result2;
		}
		public void setResult2(int result2) {
			this.result2 = result2;
		}
		
		public int sub(int a, int b) {
			result2 = num3 - num4;
			return result2;
		}
	}
	
	public class Mul {
		int num5 = 11;
		int num6 = 6;
		int result3;
		
		public int getNum5() {
			return num5;
		}
		public void setNum5(int num5) {
			this.num5 = num5;
		}
		public int getNum6() {
			return num6;
		}
		public void setNum6(int num6) {
			this.num6 = num6;
		}
		public int getResult3() {
			return result3;
		}
		public void setResult3(int result3) {
			this.result3 = result3;
		}
		
		public int mul(int a, int b) {
			result3 = num5 * num6;
			return result3;
		}
	}
	
	public class Div {
		int num7 = 100;
		int num8 = 25;
		int result4;
		
		public int getNum7() {
			return num7;
		}
		public void setNum7(int num7) {
			this.num7 = num7;
		}
		public int getNum8() {
			return num8;
		}
		public void setNum8(int num8) {
			this.num8 = num8;
		}
		public int getResult4() {
			return result4;
		}
		public void setResult4(int result4) {
			this.result4 = result4;
		}
		
		public int div(int a, int b) {
			result4 = num7 / num8;
			return result4;
		}
	}
}
