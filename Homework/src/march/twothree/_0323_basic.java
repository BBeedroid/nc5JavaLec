package march.twothree;

import java.util.Scanner;

public class _0323_basic {

	public static void main(String[] args) {
//		1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StringBuffer 사용필수).
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 3개를 입력하세요.");
		String inputStr1 = sc.nextLine();
		String inputStr2 = sc.nextLine();
		String inputStr3 = sc.nextLine();
		
		StringBuffer sb1 = new StringBuffer();
		
		System.out.println(sb1.append(inputStr1).append(inputStr2).append(inputStr3));
		
		sc.close();
		
//		2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//		   비어있는 바이트의 공간을 a로 모두 채우시오.
		StringBuffer sb2 = new StringBuffer("hello");
		
		//2-1. 문자열 크기를 30으로 확장한다
		sb2.setLength(30);
		
		//2-2. 공백을 a로 변환한다
		for(int i = 5; i < sb2.length(); i++) {
			sb2.setCharAt(i, 'a');
		}
		System.out.print(sb2);
		
		System.out.println();
//		3. 16.459를 소수점 둘째 자리까지 반올림해서 출력(xx.xx)
		double dNum = 16.459;
		
		System.out.println((double)Math.round(dNum * 100) / 100);
		
//		4. 문자열 "145.987", "-563.11" 을 double형으로 변경하여 덧셈의 결과를 출력하세요.
		String str1 = "145.987";
		String str2 = "-563.11";
		
		double dNum1 = Double.parseDouble(str1);
		double dNum2 = Double.parseDouble(str2);
		
		System.out.println("145.987 + (-563.11) = " + (dNum1 + dNum2));
	}

}
