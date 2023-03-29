package chap14_exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _03_throws {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		try {
			//throws로 예외 처리된 메소드를 호출할 때에는 예외 발생 확률이 있기 때문에
			//try~catch로 묶어서 처리해야 한다
			//throws 하는 예외가 checked이면 무조건 예외처리, unchecked이면 예외처리 안 해도 된다 
			//getException(arr);
			//div(10, 0);
			method();
		} catch (Exception e) {
			if(e.getMessage() != null)
				System.out.println(e.getMessage());
			else
				e.printStackTrace();
		}
	}
	
	public static void getException(int[] intArr) throws Exception {
		for(int i = 0; i < 10; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public static int div(int a, int b) throws ArithmeticException {
		return a / b;
	}
	
	public static void method() throws InputMismatchException,
				IOException, ArithmeticException, IndexOutOfBoundsException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
	}
}
