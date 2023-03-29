package chap04_controlStatement;

import java.util.ArrayList;
import java.util.List;

public class _11_continue {

	public static void main(String[] args) {
		// 1. for문의 continue
		// 증감식으로 돌아가는 역할
		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				// 0~4까지는 출력되지 않고 증감식으로 돌아가서
				// i를 1 증가시키고 다시 조건을 판별한다
				continue;
			}

			System.out.print(i + ", ");
		}

		System.out.println();
		// 2. while문의 continue
		// while문은 증감식이 없어서 조건식으로 바로 돌아간다
		int num = 0;
		while (num <= 20) {
			num++;

			if (num % 3 == 0) {
				continue;
			}

			System.out.print(num + ", ");
		}

		System.out.println();
		// 3. 예제
		List<String> memberList = new ArrayList<String>(); // List에서는 size로 개수를 셀 수 있다

		// 모든 회원 아이디에 a를 붙이는 작업
		for (int i = 0; i < memberList.size(); i++) {
			// 아이디 admin 회원 제외
			if (memberList.get(i).equals("admin")) {
				continue;
			}

			String newMemberId = memberList.get(i) + "a";
		}

	}

}
