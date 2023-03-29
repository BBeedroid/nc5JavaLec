package chap99_etc;

public class _03_printReverse {

	public static void main(String[] args) {
		String str = "AbcDeF"; //인덱스 0, 1, 2, 3, 4, 5 길이: 6
		//fEdCBa로 출력
		
		//대소문자 변환 될 문자열
		String capStr = "";
		
		//대소문자 바꾸는 작업
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			char capCh = ch >= 'A' && ch <= 'Z' ? (char)((int)ch + 32) : (char)((int)ch - 32);
			
			capStr += capCh; //capStr = capStr + capCh;
			/*capStr = a;
			  capStr = a + B; = aB;
			  capStr = aB + C = aBC;
			  ...
			  capStr = aBCdE + f = aBCdEf;
			*/
			/*capStr = capCh + capStr;
			 capStr = a + "";
			 capStr = B + a;
			 capStr = C + Ba;
			 ...
			 capStr = f + EdCBa;
			 System.out.print(capStr);
			 */
		}
		
		//반대로 출력
		//length() - 1: 마지막 문자 확인
		for(int i = capStr.length() - 1; i >= 0; i--) {
			System.out.print(capStr.charAt(i));
		}

	}

}
