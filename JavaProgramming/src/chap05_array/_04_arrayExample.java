package chap05_array;

import java.util.Random;
import java.util.Scanner;

public class _04_arrayExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		/*가위, 바위, 보 10판 진행 배열에 각 판의 승무패 저장
		 배열에 저장된 승, 무, 패를 세서 몇 승, 몇 무, 몇 패인지 출력*/

		// 해당 판의 승무패를 담아줄 배열(w, d, l)
		char[] wdlArr = new char[10];

		int winCnt = 0;
		int drawCnt = 0;
		int loseCnt = 0;
		
		for (int i = 0; i < 10; i++) { // 반복문
			int com = rd.nextInt(3);

			System.out.print("가위, 바위, 보 중 하나를 입력하세요. : ");
			String input = sc.nextLine();
			int inputNum = 0;

			if (input.equals("가위")) {
				inputNum = 0;
			} else if (input.equals("바위")) {
				inputNum = 1;
			} else if (input.equals("보")) {
				inputNum = 2;
			}

			if (com == inputNum) {
				wdlArr[i] = 'd';
				drawCnt++;
				System.out.println("비겼습니다.");
			} else {
				if ((inputNum == 0 && com == 1) || (inputNum == 1 && com == 0) || (inputNum == 2 && com == 2)) {
					wdlArr[i] = 'w';
					winCnt++;
					System.out.println("이겼습니다.");
				} else {
					wdlArr[i] = 'l';
					loseCnt++;
					System.out.println("졌습니다.");
				}
			}

		}

		sc.close();

		// 몇 승 몇 무 몇 패 승부 출력
		
		for(int i = 0; i < wdlArr.length; i++) {
			if(wdlArr[i] == 'w') {
				System.out.println((i + 1) + "판의 결과 : 승");
				//winCnt++;
			} else if(wdlArr[i] == 'd') {
				System.out.println((i + 1) + "판의 결과 : 무");
				//drawCnt++;
			} else if(wdlArr[i] == 'l') {
				System.out.println((i + 1) + "판의 결과 : 패");
				//loseCnt++;
			}
			
		}

		System.out.println(winCnt + "승 " + drawCnt + "무 " + loseCnt + "패");
	}

}