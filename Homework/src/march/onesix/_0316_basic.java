package march.onesix;

import java.util.Random;
import java.util.Scanner;

public class _0316_basic {

	public static void main(String[] args) {
		// 1.int 배열 10개 생성 후 int배열에 3의 배수를 차례대로 저장, 그리고 거꾸로 출력
		int[] arr1 = new int[10];
		int iNum = 0;
		int index = 0;

		while (index < 10) {
			iNum++;

			if (iNum % 3 == 0) {
				arr1[index++] = iNum;
			}
		}

		for (int i = arr1.length - 1; i >= 0; i--) {
			System.out.print(arr1[i] + ", ");
		}

		System.out.println();

		// 2.int 배열 10개 생성 후 사용자로부터 10개의 값을 입력받아 순서대로 출력하고 총합 구하기
		int[] inputArr = new int[10];
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 10개를 입력해 주세요.");

		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i] = sc.nextInt();
		}
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print(inputArr[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < inputArr.length; i++) {
			sum += inputArr[i];
		}
		System.out.println("총합: " + sum);

		// 3.int 배열 10개 공간 생성 후 1 ~ 10까지 임의의 수를 저장, 홀수만 골라서 출력

		Random rd = new Random();
		int[] randomNum = new int[10];

		for (int i = 0; i < randomNum.length; i++) {
			randomNum[i] = rd.nextInt(10) + 1;

			if (randomNum[i] % 2 == 1) {
				System.out.print(randomNum[i] + ", ");
			}
		}

		System.out.println();

		// 4. 정수 10개를 입력받아 배열에 저장, 이 정수 중에서 2의 배수와 3의 배수 출력
		int[] inputNum2 = new int[10];
		int[] arr3 = new int[10];

		Scanner scan = new Scanner(System.in);
		System.out.println("정수 10개를 입력해 주세요.");

		for (int i = 0; i < inputNum2.length; i++) {
			inputNum2[i] = scan.nextInt();
		}

		for (int i = 0; i < inputNum2.length; i++) {
			if (inputNum2[i] % 2 == 0 || inputNum2[i] % 3 == 0) {
				arr3[i] = inputNum2[i];
			}
		}
		System.out.println("2의 배수 & 3의 배수: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(arr3[i] + ", ");
		}

	}

}
