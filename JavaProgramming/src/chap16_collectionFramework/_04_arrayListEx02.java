package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_arrayListEx02 {

	public static void main(String[] args) {
		// 사용자가 입력한 문자열의 길이를 10만큼씩 잘라서 ArrayList에 저장
		// 남은 문자열의 길이가 10보다 작으면 남은 문자열을 ArrayList에 저장
		// e.g. abcdefghijklmnop => [abcdefghij, klmnop] 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		List<StringBuilder> strList = new ArrayList<StringBuilder>();
		int length = sb.length(); //for문에 sb.length 바로 넣어도 됨 
		
		for(int i = 0; i < length; i += 10) {
			if(i + 10 < length)
				strList.add(new StringBuilder(sb.substring(i, i + 10)));
			else
				strList.add(new StringBuilder(sb.substring(i, length)));
		}
		
		for(StringBuilder sb2 : strList) {
			System.out.println(sb2);
		}
		
		sc.close();
	}

}
