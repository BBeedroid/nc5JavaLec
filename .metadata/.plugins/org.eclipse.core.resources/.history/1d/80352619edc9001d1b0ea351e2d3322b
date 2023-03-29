package chap15_usefulClass;

public class _11_Integer {

	public static void main(String[] args) {
		//Integer 생성자 Java 9버전부터 사용 불가	
		Integer num1 = Integer.valueOf(100);
		Integer num2 = Integer.valueOf(100);
		
		//주소값 비교, 같은 객체를 바라보는지 확인
		System.out.println(num1 == num2); //true
		//equals() 메소드가 오버라이딩 되어 있어 값만 비교한다
		System.out.println(num1.equals(num2)); //true
		//같으면 0, 작으면 -1, 크면 1
		System.out.println(num1.compareTo(num2));
		
		//문자열을 정수 타입으로 변환
		String numStr = "1000";
		int convertNum = Integer.parseInt(numStr);
		System.out.println(convertNum);
		System.out.println(Integer.valueOf(convertNum).getClass().getName());
		
		//int의 최댓값, 최솟값을 상수인 멤버변수로 지정해둬서 멤버번수를 호출하면 확인 가능하다
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//문자열로 변환
		String convertStr = num1.toString();
		System.out.println(convertStr.getClass().getName());
		
		//크기, byte, 타입 확인
		System.out.println("size = " + num1.SIZE); //bit 단위
		System.out.println("byte = " + num1.BYTES);
		System.out.println("type = " + num1.TYPE);
		
		//문자열을 정수 타입으로 변환
		//System.out.println(Integer.parseInt("FF")); 문자열 바로 대입하면 에러 발생
		System.out.println(Integer.parseInt("FF", 16)); //16진수로 인식
	}

}
