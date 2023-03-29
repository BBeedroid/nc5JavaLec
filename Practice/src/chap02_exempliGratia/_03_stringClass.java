package chap02_exempliGratia;

public class _03_stringClass {

	public static void main(String[] args) {
		//charAt() 메소드 이용해서 하나씩 출력
		String str = new String("Java"); //클래스명 객체명 = new 클래스명("");
		System.out.println("원본 문자열: " + str);
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		
		System.out.println("\ncharAt() 메소드 호출 후 원본 문자열: " + str);
		
		String str2 = new String("Hello. Java World. Stay strong.");
		
		char ch1 = str2.charAt(0); //Java 인덱스는 0부터 시작한다
		char ch2 = str2.charAt(6);
		char ch3 = str2.charAt(15);
		char ch4 = str2.charAt(30);
		
		System.out.println("첫 번째 문자: " + ch1);
		System.out.println("여섯 번째 문자: " + ch2);
		System.out.println("열다섯 번째 문자: " + ch3);
		System.out.println("서른 번째 문자: " + ch4);
		
		/*char ch5 = str.charAt(35);
		System.out.println("서른다섯 번째 문자: " + ch5);*/
		
		//length() 메소드 이용해서 마지막 문자열 확인 => 인덱스 0부터 시작하기 때문에 -1 해줘야 오류 발생 방지 
		char ch6 = str2.charAt(str2.length()-1);
		System.out.println("가장 마지막 문자: " + ch6);
		
		//for문 이용해서 모든 문자 확인
		for(int a = 0; a < str2.length(); a++) {
			System.out.print(str2.charAt(a));
		}
		
		System.out.println();
		
		//특정 문자 개수 확인
		int counter = 0;
		for(int b = 0; b < str2.length(); b++) {
			if(str2.charAt(b) == 'S') {
				counter++;
			}
		}
		
		System.out.println("문자열에 포함된 S의 개수는 " + counter + "개입니다.");
		
		/*compareTo() 메소드를 이용해 인수로 전달된 문자열과 사전 편찬 순으로 비교
		두 문자열이 같다면 0을 반환하며, 해당 문자열이 인수로 전달된 문자열보다 작으면 음수, 크면 양수 반환
		문자열을 비교할 때 대소문자를 구분하지 않기를 원한다면, compareToIgnoreCase() 메소드를 사용*/
		String str3 = new String("abcd");
		
		System.out.println(str3.compareTo("bcef"));
		System.out.println(str3.compareTo("abcd"));
		
		System.out.println(str3.compareTo("Abcd"));
		System.out.println(str3.compareToIgnoreCase("Abcd"));
		
		//concat() 메소드 이용해서 두 문자열을 연결
		String str4 = new String("Java");
		
		System.out.println(str4.concat(" 수업"));
		
	}

}
