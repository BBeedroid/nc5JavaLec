package chap17_generic;

public class _02_genericMethod {

	public static void main(String[] args) {
		String[] strArr = {"java", "javascript", "html"};
		Integer[] intArr = {1, 2, 3, 4, 5};
		
		String result1 = getLastEle(strArr); //추론으로 자동 형 추론
		Integer result2 = _02_genericMethod.<Integer>getLastEle(intArr);
		
		System.out.println("strArr의 마지막 요소는 " + result1);
		System.out.println("strArr의 마지막 요소는 " + result2);

	}
	
	public static <T> T getLastEle(T[] tArr) {
		return tArr[tArr.length - 1];
	}
}
