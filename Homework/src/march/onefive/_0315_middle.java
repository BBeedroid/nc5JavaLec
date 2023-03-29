package march.onefive;

import java.util.Random;
import java.util.Scanner;

public class _0315_middle {

	public static void main(String[] args) {
		//1. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요 (while문내에 조건문을 넣어주면 됨)
		int iNum1 = 1;
		
		while(iNum1 <= 10) {
			if(iNum1 % 2 == 0) {
				System.out.println(iNum1);
			}
			iNum1++;
		}
				
		//2. 1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고,
		//	 그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요
		int iNum2 = 1;
		int sum1 = 0;
		
		while(iNum2 <= 1000) {
			if(iNum2 % 2 == 0 && iNum2 % 7 == 0) {
				System.out.println(iNum2);
			}
			iNum2++;
			sum1 += iNum2;
		}
		
		System.out.println(sum1);

		/*3. 구구단을 이렇게 출력하세요
		 2x1=2 3x1=3...9x1=9
		 2x2=4
		 ...
		 2x9=18........9x9=81*/
		for(int i = 1; i <= 9; i++) { //곱
			for(int j = 2; j <= 9; j++) { //단
				System.out.print(j + "*" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}

		/*4. 가위, 바위, 보 게임을 만드세요.
		com에 0~2까지의 랜덤값을 발생시키고
		(0:가위, 1:바위, 2:보)
		사용자가 가위, 바위, 보를 입력하여
		com과의 승무패를 출력하세요.
		(예시) com = 2, 사용자가 바위를 입력하면 => 졌습니다.
		com=1, 사용자가 바위를 입력하면 => 비겼습니다.
		com=0, 사용자가 바위를 입력하면 => 이겼습니다.*/
		System.out.println("**가위 바위 보 게임**");
		System.out.println("0: 가위, 1: 바위, 2: 보");
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		Random rand = new Random();
		int com;
		com = rand.nextInt(3);
		
		System.out.println("사용자: " + user);
		System.out.println("컴퓨터: " + com);
		
		if(user == 0) {
			if(com == 0) {
				System.out.println("비겼습니다.");
			} else if(com == 1) {
				System.out.println("졌습니다.");
			} else {
				System.out.println("이겼습니다.");
			}
		}
		else if(user == 1) {
			if(com == 0) {
				System.out.println("이겼습니다.");
			} else if(com == 1) {
				System.out.println("비겼습니다.");
			} else {
				System.out.println("졌습니다.");
			}
		}
		else if(user == 2) {
			if(com == 0) {
				System.out.println("졌습니다.");
			} else if(com == 1) {
				System.out.println("이겼습니다.");
			} else {
				System.out.println("비겼습니다.");
			}
		}
		else {
			System.out.println("게임을 종료합니다.");
		}
		
		sc.close();
	}

}
