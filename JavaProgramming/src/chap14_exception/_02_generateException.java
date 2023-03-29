package chap14_exception;

public class _02_generateException {

	public static void main(String[] args) {
		try {
//			ArrayIndexOutOfBoundsException aie = new ArrayIndexOutOfBoundsException(
//					1); 빈 칸이면 null, int 넣으면 Array index out of range: 출력
//			throw aie;
			//1. NullPointerException
//			NullPointerException ne = new NullPointerException("null입니다.");
//			throw ne;
			//2. ArithmeticException
			ArithmeticException ae = new ArithmeticException(
					"분모가 0일 수 없습니다.");
			throw ae;
			
		} catch(NullPointerException ne) {
			System.out.println(ne.getMessage());
		} catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} catch(Exception e) {
			//앞서 선언한 catch문을 모두 통과한 예외문도 처리할 수 있도록
			//마지막 catch문에는 예외의 최상위 class Exception으로 처리한다
			System.out.println(e.getMessage());
		}
	}
}
