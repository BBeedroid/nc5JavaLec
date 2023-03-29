package chap04_controlStatement;

import java.util.Scanner;

public class _09_doWhile {

	public static void main(String[] args) {
		/*
		 * 1. do~while문 do {} 블록의 소스코드는 무조건 1회 실행된다 조건식이 true이면 다시 반복 실행된다
		 */
		do {
			System.out.println("무조건 1회 실행");
		} while (1 < 0);

		int h = 1;

		do {
			if (h % 3 == 0) {
				System.out.print(h + ", ");
			}
		} while (h++ <= 20);
		
	}

}
