package march.twotwo;

import java.util.Scanner;

public class _0322_basic {

	public static void main(String[] args) {
		/*1. 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요. 
    	 문자열의 길이가 짝수면 가운데 두 글자 출력. ex) 비둘기 -> 둘, 비트캠프 -> 트캠*/
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		String str1 = sc.nextLine();
		
		int mid = str1.length() / 2;
		
		if(str1.length() % 2 == 0)
			System.out.println("가운데 문자는 " + str1.substring(mid - 1, mid + 1) + "입니다.");
		else
			System.out.println("가운데 문자는 " + str1.substring(mid, mid + 1) + "입니다.");

		/*if(str1.length() % 2 == 0)
				System.out.println("가운데 문자는 " + str1.charAt((str1.length() / 2) - 1)
								+ str1.charAt(str1.length() / 2) + "입니다.");
			else
				System.out.println("가운데 문자는 " + str1.charAt(str1.length() / 2) + "입니다.");*/
		

		/*2. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
		 0개면 '가, 바가 존재하지 않습니다.'라고 출력.*/
		System.out.println("문자열을 입력해주세요.");
		String str2 = sc.nextLine();
		
		int ga = str2.length() - str2.replace("가", "").length();
		int ba = str2.length() - str2.replace("바", "").length();
		
		if(ga == 0 && ba == 0)
			System.out.println("'가, 바가 존재하지 않습니다.'");
		else
			System.out.println("가의 개수: " + ga + "\n바의 개수: " + ba); 
		
		/*3. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
		 대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u*/
		System.out.println("문자열을 입력해주세요.");
		
		while(true) {
			String str3 = sc.nextLine();
			boolean okayStr = str3.matches("[a-zA-Z]+");
			
			if(okayStr) {
				str3 = str3.replaceAll("[aeiouAEIOU]", "");
				System.out.println("대소문자 모음을 제거한 결과입니다: " + str3);
				break;
			} else {
				System.out.println("영어로 다시 입력해주세요.");
				continue;
			}
		}
		
		/*char ch;
		
		for(int i = 0; i < str3.length(); i++) {
			ch = str3.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				System.out.println(str3.replace("a", "").replace("e", "").replace("i", "")
				.replace("o", "").replace("u", "").replace("A", "").replace("E", "")
				.replace("I", "").replace("O", "").replace("U", ""));
			} else if (ch >= 'A' && ch <= 'Z') {
				System.out.println(str3.replace("a", "").replace("e", "").replace("i", "")
				.replace("o", "").replace("u", "").replace("A", "").replace("E", "")
				.replace("I", "").replace("O", "").replace("U", ""));
			}
			else {
				System.out.println("영어로 다시 입력해주세요.");
				str3 = sc.nextLine();
				continue;
			}
			break;
		}*/
		

		/*4. 사용자가 입력한 문자열1, 문자열2 문자열1이 문자열2를 포함하면
		 '포함합니다.'를 출력, 아니면 '포함하지 않습니다.'를 출력*/
		System.out.println("첫 번째 문자열을 입력해주세요.");
		String str4 = sc.nextLine();
		System.out.println("두 번째 문자열을 입력해주세요.");
		String str5 = sc.nextLine();
		
		if(str4.contains(str5))
			System.out.println("포함합니다.");
		else
			System.out.println("포함하지 않습니다.");
		
		sc.close();	
	}
}
