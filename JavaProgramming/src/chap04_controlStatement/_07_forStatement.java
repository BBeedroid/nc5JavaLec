package chap04_controlStatement;

public class _07_forStatement {

	public static void main(String[] args) {
		// for문
		// 1~100까지 합의 값을 담아줄 변수
		int sum = 0;
		int i;

		for (i = 1; i <= 100; i++) {
			// sum = 0 + 1 => 1 + 2 => 3 + 3 => ... => sum = 4950 + 100
			// i = 101 => 조건 false 되면서 for문 종료
			sum += i;
		}

		System.out.println("1~100까지의 합: " + sum);
		System.out.println("마지막 i: " + i);

		int iNum = 0;
		for (int j = 0; j <= 1000; j++) {
			if (j % 13 == 0 && j % 23 == 0) {
				iNum += j;
				System.out.println(j);
				if (iNum > 500) {
					break;
				}

			}

			System.out.println("for문 밖의 j: " + j);

		}

		System.out.println("12, 13의 공배수의 합이 500을 넘는 합: " + iNum);

	}

}
