package chap02_exempliGratia;

import java.util.Scanner; //Scanner 클래스 호출

public class _01_scannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		byte bNum = sc.nextByte(); //byte 타입 입력 및 반환
		short sNum = sc.nextShort(); //short 타입 입력 및 반환
		int iNum = sc.nextInt(); //int 타입 입력 및 반환
		long lNum = sc.nextLong();  //long 타입 입력 및 반환
		
		float fNum = sc.nextFloat(); //float 타입 입력 및 반환
		double dNum = sc.nextDouble(); //double 타입 입력 및 반환
		
		boolean b = sc.nextBoolean(); //boolean 타입 입력 및 반환
		
		String str1 = sc.next(); //문자열 타입 입력 및 반환(토큰 기준으로 한 단어 읽음)
		String str2 = sc.nextLine(); //문자열 타입 입력 및 반환(개행 기준으로 한 줄 읽음)
		
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(b);
		System.out.println(str1);
		System.out.println(str2);
		
		sc.close();
		
	}

}
