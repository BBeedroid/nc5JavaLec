package chap08_static.clazz;

//단위와 상관없이 두 개의 값을 더해주는 class
public class Add {
	public static String result;
	
	public static String add(int num1, int num2, String unit) {
		result = (num1 + num2) + unit;
		
		return result;
	}
	
}
