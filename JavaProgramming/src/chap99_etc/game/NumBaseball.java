package chap99_etc.game;

import java.util.Random;
import java.util.Scanner;

public class NumBaseball {
	/*게임 규칙: 컴퓨터가 랜덤 값 3개(0~9)를 가지고 사용자가 숫자 3개(0~9)를 입력 (중복 불가능)
	 컴퓨터 숫자 3개와 사용자 숫자 3개가 같으면 볼로 판정
	 숫자와 위치까지 모두 같으면 스트라이크로 판정한다
	 몇 스트라이크, 몇 볼인지 출력
	 3 스트라이크 시 몇 회만에 맞췄는지 출력 후 게임 종료(1: 재시작, 0: 종료)*/
	
	// 스트라이크와 볼의 개수를 세어줄 변수
	private int strike = 0;
	private int ball = 0;

	// 몇 번 맞췄는지 세어줄 변수
	private int gameCnt = 0;

	// 컴퓨터 랜덤값 담아줄 배열, (랜덤값 9까지)
	int[] com = new int[3];

	// 사용자 입력값 담아줄 배열
	int[] user = new int[3];

	Scanner sc = new Scanner(System.in);
	Random random = new Random();

	// 게임 시작 메소드
	public void start() {
		while(true) {
		generateRandom();
		
		//컴퓨터 배열 확인
		System.out.println(com[0] + ", " + com[1] + ", " + com[2]);
		
		while(true) {
			strike = 0;
			ball = 0;
			
			getUserInput();
			
			//사용자 입력값 확인
			System.out.println(user[0] + ", " + user[1] + ", " + user[2]);
			
			if(judgeStrike()) {
				break;
			} else {
				continue;
			}
			
		}
		
		if(reGame()) {
			continue;
		} else {
			break;
		}
		
		}
	}

	// 컴퓨터 랜덤 값 3개(0~9) 생성해주는 메소드
	public void generateRandom() {
		for(int i = 0; i < com.length; i++) {
			int[] com = new int[3];
			com[i] = random.nextInt(10);
		}
		}
		// 중복 체크



	// 중복값 체크 메소드
	public boolean checkDuplicate(int[] arr, int num) { // int num 몇 번 인덱스까지 검사하는가 표시
		boolean isDuplicated = false;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 1; j < 2; j++) {
				if(i != j) {
					if(arr[i] == arr[j]) {
						isDuplicated = true;
					}
				}
			}
		}
		return false;
	}

	// 사용자 입력 값을 받아서 배열에 담아주는 메소드
	public void getUserInput() {
		System.out.println(random.nextInt(10));
		// 중복 체크

	}

	// 스트라이크 볼 판정하는 메소드
	public boolean judgeStrike() {

		return false;
	}
	
	//재시작 여부
	public boolean reGame() {
		
		return false;
	}

}
