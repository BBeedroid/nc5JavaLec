package chap14_exception;

public class _01_tryCatchFinally {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		
		String[] strArr = new String[3];
		
		int index = 0;

		while (true) {
			try {
				System.out.println(arr[index++]);
//				if (index == 2) {
//					System.out.println(10 / 0);}
				//null.length();
				//strArr[0].length();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				System.out.println(index + "는 배열에 존재하지 않는 인덱스입니다.");
			} catch (ArithmeticException ae) {
				System.out.println(ae.getMessage());
				System.out.println("분모가 0이 될 수 없습니다.");
			} catch (NullPointerException ne) {
				System.out.println(ne.getMessage());
				System.out.println("null 값이라 속성이나 메소드를 사용할 수 없습니다.");
			} finally {
				if (index < 3) {
//					if (index == 2) {
//						System.out.println("예외발생. 프로그램을 종료합니다.");
//						break;
//					}
					System.out.println("정상출력");
				} else {
					System.out.println("예외발생. while문을 종료합니다.");
					break;
				}
			}
		}
	}
}
