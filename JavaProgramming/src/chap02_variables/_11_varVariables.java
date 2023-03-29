package chap02_variables;

public class _11_varVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var str = "hello";
		
		//변수의 클래스 확인(원시 타입은 불가능)
		System.out.println("str의 타입 : " + str.getClass().getName());
		
		//str = 10;
		
		//원시 타입의 래퍼클래스(원시 타입을 객체(인스턴스)화한 것)
		//int => Integer
		//long => Long
		var num1 = 100;
		
		System.out.println(((Object)num1).getClass().getName()); //Object 클래스: 조상 격 클래스
		
		var num2 = 12.25;
		
		System.out.println(((Object)num2).getClass().getName());
		
	}

}
