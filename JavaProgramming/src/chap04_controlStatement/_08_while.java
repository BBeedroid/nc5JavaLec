package chap04_controlStatement;

import java.util.Scanner;

public class _08_while {

	public static void main(String[] args) {
		//1-1. while문
		int sum1 = 0;
		int intNum = 1;

		while (intNum <= 100) {
			sum1 += intNum++;
		}

		System.out.println("1~100까지의 합: " + sum1);

		// 1-2. infinite while문
		// 스캐너 객체
		Scanner sc = new Scanner(System.in); // Ctrl + Shift + O => import 단축키
		// 스캐너를 사용할 때 next() 메소드를 혼용하여 사용하는 것은 좋지 않다.
		// e.g. nextInt();, nextLine();
		while (true) {
			System.out.println("1은 종료. 나머지는 계속 반복: ");
			String inputStr = sc.nextLine();

			if (inputStr.equals("1")) {
				System.out.println("종료되었습니다.");
				break;
			}

			System.out.println(inputStr);

		}

	}

}
