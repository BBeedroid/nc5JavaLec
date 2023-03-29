package chap99_etc;

import java.util.Scanner;

public class _07_inputNum {

	public static void main(String[] args) {
		System.out.println("1~200 사이의 숫자를 입력하세요. :");
		
		Scanner sc = new Scanner(System.in);
		
		//컴퓨터는 변수에 1~200 랜덤값
		int com;
		com = (int)(Math.random() * 200) + 1;
		
		int userNum;
		userNum = (int)(Math.random() * 200) + 1;
		
		while(true) {
			//사용자 입력 정수 받기 nextInt
			System.out.println(com);
			userNum = sc.nextInt();
			//201이면 while문 종료
			if(userNum == 201) {
				break;
			}
			for(userNum = 1; userNum == com || userNum != com; userNum++) {
				if(userNum == com) {
					System.out.println("맞췄습니다. 계속 하시겠습니까?");
					System.out.println("다시 게임을 시작하시려면 1, 종료하시려면 0을 입력해 주세요.");
					userNum = sc.nextInt();

					if(userNum == 1) {
						System.out.println(com);
						userNum = sc.nextInt();
						break;
					}  else if(userNum == 0) {
						break;
					}
				if(userNum != com) {
					System.out.println("틀렸습니다. 다시 입력하세요.");
					System.out.println(com);
					userNum = sc.nextInt();
					break;
				}
			}
		}
			/*com == input => 맞췄습니다. /n계속 하시겠습니까?
			 1 => com=새로운 1~200까지의 난수, 다시 게임 시작
			 0 => 게임 종료*/
			
			/*틀렸습니다. 다시 입력하세요.
			 입력값 다시 받기*/
		}
		sc.close();	
	}
	
}
