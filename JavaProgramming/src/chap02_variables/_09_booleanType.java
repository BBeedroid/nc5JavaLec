package chap02_variables;

public class _09_booleanType {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1. boolean 타입 변수 선언 및 초기화
		boolean isOver = false;
		int moveMeter = 0;
		
		//무한 반복문
		while(true) {
			//조건이 맞을 경우 이 안의 코드를 무한 반복 실행
			
			//100 미터 넘어갈 때 플래그(isOver) 값을 true로 변경
			if(moveMeter >= 100) {
				isOver = true;
			} else if(moveMeter <= 30) {
				isOver = false;
			}
			
			//플래그가 true로 바뀌면 30씩 뒤로 이동, 플래그가 false면 50씩 앞으로 이동
			if(isOver == true) {
				moveMeter = moveMeter - 30;
			} else {
				moveMeter = moveMeter + 50;
			}
			
			System.out.println("현재 위치는 " + moveMeter + "입니다.");
			Thread.sleep(1000); //1000밀리초(1초)마다 결과값 콘솔에 출력, sleep 사용 시 throws InterruptedException 필요
			
		}
	}

}
