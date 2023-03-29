package chap99_etc.game;

public class Lotto {
	//난수 담아줄 배열
	private int[] lottoNum = new int[7];
	private int[] userNum = new int[6];
		
	//1~45까지 난수 7개(중복 제거) 7번째 숫자는 보너스 번호
	public void generateRandom() {
		for(int index = 0; index < lottoNum.length; index++) {
			lottoNum[index] = (int)((Math.random() * 45) + 1);
		}
	}
	
	//사용자가 1~45까지 6개 숫자 선택(중복 제거)
	
	
	/*1등: 보너스 번호를 제외한 숫자 6개가 모두 같을 때
	 2등: 보너스 번호와 숫자 5개가 일치할 때
	 3등: 보너스 번호를 제외한 숫자 5개가 모두 같을 때
	 4등: 보너스 번호를 제외한 숫자 4개가 모두 같을 때
	 5등: 보너스 번호를 제외한 숫자 3개가 모두 같을 때
	 나머지는 꽝*/
	
	//몇 등인지 출력

}
