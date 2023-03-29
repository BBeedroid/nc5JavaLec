package chap99_etc;

import java.io.IOException;

public class _01_judgeAlphabet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1. 사용자 입력 값 받기
		//read(): 문자 입력 시 해당 문자의 유니코드(10진수) 값을 리턴한다
		//입력한 문자를 출력하기 위해서는 char 형변환을 거쳐야 한다
		System.out.println("영문자 하나를 입력하세요.:");
		int inputUni = System.in.read();
		
		/*if(조건1) {
			조건1이 참(true)일 경우에만 동작
		} else if(조건2) {
			조건1은 false이고 조건2가 true인 경우 동작
		} else if(조건3) {
	} else {
		위의 모든 조건이 false일 때 동작
	}*/
		
	//대문자 A 유니코드 65 알파벳 개수 26개, 소문자 a 유니코드 97
		if(inputUni >= 65 && inputUni <= 90) {
			System.out.println("대문자입니다.");
			System.out.println((char)inputUni);
			//대문자로 들어왔을 때는 해당 문자를 소문자로 변경해서 출력
			System.out.println((char)(inputUni+ 32));
		
		} else if(inputUni >= 97 && inputUni <= 122) {
			System.out.println("소문자입니다.");
			System.out.println((char)inputUni);
			//소문자로 들어왔을 때는 해당 문자를 대문자로 변경해서 출력
			System.out.println((char)(inputUni - 32));
			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}

}
