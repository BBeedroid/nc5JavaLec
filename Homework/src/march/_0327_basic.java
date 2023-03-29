package march;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _0327_basic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		1. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.
		List<Integer> intList1 = new ArrayList<Integer>();
		
		while(true) {
			System.out.println("정수 5개 입력: ");
			String inputNum = sc.nextLine();
			String[] iNum = inputNum.split(" ");
			
			try {
				for(String sNum : iNum) {
					intList1.add(Integer.valueOf(sNum));
				}
			}
			catch(Exception e) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			System.out.println(intList1);
			break;
		}
		
		
//		2. 정수형 데이터를 저장할 수 있는 LinkedList를 생성하고 사용자가 입력한 5개의 정수를 저장하고
//		index가 3, 4번 요소를 값은 100, 200으로 변경하고 출력하세요.
		
		List<Integer> intList2 = new LinkedList<Integer>();
		
		while(true) {
			System.out.println("정수 5개 입력: ");
			String inputNum2 = sc.nextLine();
			String[] iNum2 = inputNum2.split(" ");
			
			try {
				for(String sNum2 : iNum2) {
					intList2.add(Integer.valueOf(sNum2));
				}
			}
			catch(Exception e) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			intList2.set(3, 100);
			intList2.set(4, 200);
			
			System.out.println(intList2);
			break;
		}
		
		
//		3. Map<String, Integer>를 하나 생성하여 key는 알파벳(대소문자 구분)
//		value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
		
		/*List<String> strList = new ArrayList<String>();
		
		char[] alphabets1 = new char[26];	
		for(int i = 0; i < alphabets1.length; i++) {
			alphabets1[i] = (char)(65 + i);
		}
		
		String str1 = String.valueOf(alphabets1);
		strList.add(str1);
		
		char[] alphabets2 = new char[26];
		for(int i = 0; i < alphabets2.length; i++) {
			alphabets2[i] = (char)(97 + i);
		}
		
		String str2 = String.valueOf(alphabets2);
		strList.add(str2);
		
		
		int[] uniNum1 = new int[26];
		for(int i = 0; i < uniNum1.length; i++) {
			uniNum1[i] = (65 + i);
		}
		
		List<Integer> intList = new ArrayList<Integer>();
		for(int uni1 : uniNum1) {
			intList(uni1);
		}
		
		int[] uniNum2 = new int[26];
		for(int i = 0; i < uniNum2.length; i++) {
			uniNum2[i] = (97 + i);
		}
		
		List<Integer> intList = new ArrayList<Integer>();
		for(int uni1 : uniNum1) {
			intList(uni1);
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
	}

	private static void intList(int uni1) {
		// TODO Auto-generated method stub*/
		
	}

}
