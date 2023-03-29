package chap15_usefulClass;

public class _12_boxing {

	public static void main(String[] args) {
		int num1 = 100;
		
		//원시타입을 객체로 만들어준다 => 자동 박싱 진행((Integer)num1)
		Integer objNum1 = (Integer)num1;
		
		//객체를 원시타입으로 => 자동 언박싱 진행(objNum1)
		int num2 = num1 + objNum1;
		
		Integer objNum2 = Integer.valueOf(300);
		
		//객체를 원시타입으로 => 자동 언박싱 진행((int)objNum2
		int num3 = (int)objNum2;
		
		//원시타입을 객체로 => 자동 박싱 진행(num3)
		Integer objNum3 = objNum2 + num3;
		
		System.out.println("수동 박싱: " + objNum1);
		//int = Integer + int
		System.out.println("자동 언박싱: " + num2);
		System.out.println("수동 언박싱: " + num3);
		System.out.println("자동 박싱: " + objNum3);

	}

}
