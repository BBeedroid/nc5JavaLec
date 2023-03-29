package march.onefour;

public class _0314_advance {

	public static void main(String[] args) {
		/*1. 삼항 조건 연산자를 이용하여 String str = "dBEfIZ"; 를 이용하여 ajEfcC 출력하세요.
		 d: 100  B: 66  E: 69  f: 102  I: 73  Z: 90
		 C: 67   c: 99  f: 102 E: 69   j: 106 a: 97
		 a       j      E      f       c      C
		 "dBEfIZ" 대소문자 역순으로 변환 => "ajEfcE"
		 차이: 33
		 */
		String str = "dBEfIZ"; //인덱스 0, 1, 2, 3, 4, 5 길이: 6
		String forthStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			char forthCh = ch == 'Z' ? 'a' : ch == 'a' ? 'Z' : ch >= 'A' && ch <= 'Z'
					//'Z' + 33 하면 123(기호: {)이 나오기 때문에 삼항 연산자로 'a' 묶어버림
					? (char)((int)ch + 33) : (char)((int)ch - 33);
			
			forthStr = forthCh + forthStr;
		}
		
		System.out.println(forthStr);
		
		String forthStr2 = "";
		char forthCh2;
		
		for(int a = 0; a < str.length(); a++) {
			char ch2 = str.charAt(a);
						//소문자 대문자 만들기
			forthCh2 = ch2 >= 97 && ch2 <= 122 
					? 
						(char)((int)ch2 - 33)
					: 
						ch2 + 33 > 122 //'Z' => 'a'
						? (char)(('a' - 123) + (char)(int)ch2 + 33) 
						: ch2 >= 65 && ch2 <= 90
							? (char)((int)ch2 + 33)
							: null;
			System.out.println(forthCh2);
			forthStr2 = forthCh2 + forthStr2;
			
		}
		System.out.println(forthStr2);
	}

}
