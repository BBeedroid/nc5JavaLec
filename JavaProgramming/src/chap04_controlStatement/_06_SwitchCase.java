package chap04_controlStatement;

public class _06_SwitchCase {

	public static void main(String[] args) {
		// 1. switch~case문
		String grade = "A";

		switch (grade) {
		case "A":
			System.out.println("점수는 90점 " + "이상입니다.");
			break; // 일치하는 조건을 만나면 switch문 종료
		case "B":
			System.out.println("점수는 90점 " + "미만 80점 이상입니다.");
			break;
		case "C":
			System.out.println("점수는 80점 " + "미만 70점 이상입니다.");
			break;
		default:
			System.out.println("점수는 70점 " + "미만입니다.");
			break;
		}

	}

}
