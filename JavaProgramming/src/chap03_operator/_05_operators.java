package chap03_operator;

public class _05_operators {

	public static void main(String[] args) {
		//1-1. 부호 연산자
		int iNum1 = 10;
		
		System.out.println(+iNum1); //10
		System.out.println(-iNum1); //-10
		
		//1-2. 전위 증감연산자
		int iNum2 = 20;
		
		if(++iNum2 > 20) {
			System.out.println("iNum2는 20보다 큽니다.");
		}
		System.out.println(--iNum2); //출력값: 20, 실제값: 20
		
		//1-3. 후위 증감연산자
		int iNum3 = 20;
		
		if(iNum3++ > 20) {
			System.out.println("iNum3는 20보다 큽니다.");
		}
		System.out.println(--iNum3); //출력값: 21, 실제값: 20

		//1-4. 전위, 후위 증감연산자의 혼합
		int iNum4 = 40;
		
		System.out.println(iNum4++); //출력값: 40, 실제값: 41
		System.out.println(iNum4--); //출력값: 41, 실제값: 40
		System.out.println(++iNum4); //출력값: 41, 실제값: 41
		System.out.println(iNum4); //41
		
		//2-1. 대입연산자: 왼쪽 항에 오른쪽 항의 값을 대입(저장)한다
		int num1 = 100;
		int num2 = 255;
		int num3 = 313;
		int num4 = num3;
		
		//2-2. 산술연산자
		int result;
		
		result = num1 + num2;
		System.out.println("num1 + num2 = " + result); //355
		result = num1 - num2;
		System.out.println("num1 - num2 = " + result); //-155
		result = num1 * num2;
		System.out.println("num1 * num2 = " + result); //25500
		result = num1 / num2;
		System.out.println("num1 / num2 = " + result); //0
		result = num1 % num2;
		System.out.println("num1 % num2 = " + result); //100
		
		//2-3. 복합대입연산자
		num3 = 100;
		num4 = 15;
		num3 += num4; // => num3 = num3 + num4
		System.out.println("num3 += num4 = " + num3); //115
		num3 -= num4; // => num3 = num3 + num4
		System.out.println("num3 -= num4 = " + num3); //100
		num3 *= num4; // => num3 = num3 + num4
		System.out.println("num3 *= num4 = " + num3); //1500
		num3 /= num4; // => num3 = num3 + num4
		System.out.println("num3 /= num4 = " + num3); //100
		num3 %= num4; // => num3 = num3 + num4
		System.out.println("num3 %= num4 = " + num3); //10
		
		//3-1. 관계연산자
		int intNum1 = 110;
		int intNum2 = 215;
		
		System.out.println("intNum1 < intNum2 : " + (intNum1 < intNum2)); //true
		System.out.println("intNum1 >= intNum2 : " + (intNum1 >= intNum2)); //false
		System.out.println("intNum1 == intNum2 : " + (intNum1 == intNum2)); //false
		
		/*String 값의 동일 여부를 판단할 때에 ==을 사용하지 않는다
		 ==을 사용하면 같은 값인지 비교하지 않고 같은 객체를 참조하고 있는지 비교한다
		 값의 동일 여부를 비교하려면 .equals() 메소드를 사용해야 한다*/
		String str1 = new String ("hello");
		String str2 = new String ("hello");
		
		System.out.println(str1 == str2); //false, 객체화 시키지 않으면 str1 "hello" 참조해서 true 뜸
		System.out.println(str1.equals(str2)); //true
		
		//3-2. 논리연산자(&&, ||, !)
		
		int intNum3 = 10;
		int intNum4 = 33;
		
		System.out.println("intNum1 < intNum2 && intNum3 / intNum4 == 0 => "
				+ (intNum1 < intNum2 && intNum3 / intNum4 == 0)); //true
		System.out.println("false || intNum2 < 100 => "
				+ (false || intNum2 < 100)); //false
		System.out.println("!(intNum4 > 2000) => " + !(intNum4 > 2000));
		//!false => true
		
		
		//4-1. 삼항연산자
		int inNum1 = 111;
		int inNum2 = 10;
		int result2 = inNum1 / inNum2 > 8 ?	inNum1 - 11 : inNum2 - 11;
		
		System.out.println(result2); //100
		
		
	}
	
}
