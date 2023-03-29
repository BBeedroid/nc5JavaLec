package chap04_controlStatement;

import java.util.Scanner;

public class _10_duplicatedForBr {

	public static void main(String[] args) {
		// 외부, 내부 for문이 몇 번 실행 되었는지 담을 변수
		int iCnt = 0;
		int jCnt = 0;

		// 외부 for문의 break는 for문 전체를 종료시킨다
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			iCnt++; // 3

			// 내무 for문의 break는 내부 for문만 종료시킨다
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break;
				}
				jCnt++;
				// 6 => i = 0일 때 j = 0, 1, break i = 1일 때 0, 1, break i = 2일 때 0, 1 break
			}
		}

		System.out.println(iCnt);
		System.out.println(jCnt);
		
		
		//중첩 for문
		
		int inNum = 0;

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("2~9까지 입력. 0, 1 종료: ");
			inNum = scan.nextInt();

			if (inNum == 0 || inNum == 1) {
				break;
			}

			for (int k = 2; k <= inNum; k++) {
				for (int g = 1; g <= 9; g++) {
					System.out.println(k + " * " + g + " = " + k * g);
				}
				System.out.println();
			}
		}

		//삼각형 별 찍기
		/*
		  *
		  **
		  ***
		  ****
		  *****
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		/*
		      *
		  	 **
		    ***
		   ****
		  *****
		*/
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= 0; j--) {
				if(i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		/*
		  *****   
		  ****
		  ***
		  **
		  *
		*/
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i <= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		/*
		  *****   
		   ****
		    ***
		     **
		      *
		*/
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}

}
