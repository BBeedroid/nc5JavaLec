package chap05_array;

public class _03_arrayExample {

	public static void main(String[] args) {
		char[] chArr = {'B', 'c', 'T', 'p', 'P', 'i'};
		char[] convertArr = new char[6];
		
		//소문자는 대문자로, 대문자는 소문자로 변경 후 converArr에 저장
		
		/*char ch = 'A';
		
		if(ch >= 65 && ch <= 90) {
			convertArr[ch] = (char)(ch + 33);
		} else if(ch >= 97 && ch <= 122) {
			convertArr[ch] = (char)(ch - 33);
		}
		
		System.out.println(convertArr[ch]);
		
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 65 out of bounds for length 6
	at chap05_array._03_arrayExample.main(_03_arrayExample.java:14)
		
		*/
				
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] >= 'A' && chArr[i] <= 90) {
				convertArr[i] = (char)(chArr[i] + 32);
			} else {
				convertArr[i] = (char)(chArr[i] - 32);
			}
			
			System.out.println(convertArr[i] + ", ");
		}

	}

}
