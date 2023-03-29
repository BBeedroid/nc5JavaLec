package chap06_class.phone;

import java.util.Scanner;

public class PhoneInfo {

		//이름 100개와 전화번호 100개를 담을 수 있는 배열 2개
		String[] name = new String[100];
		String[] phoneNum = new String[100];
		
		//배열의 현재 인덱스를 담고 있을 변수
		int index = 0;
		
		//전달받은 이름과 전화번호를 저장하는 메소드 insertPhoneNum
		public void insertPhoneNum(String name, String phoneNum) {
			name = "";
			this.name[index] = name;
			this.phoneNum[index] = phoneNum;
			index++; //다음 인덱스로 넘겨준다
		}
		
		//저장된 모든 이름과 전화번호를 출력하는 메소드 printAllPhoneNum (저장된 만큼 나오게 => for문 i < index)
		//e.g. 이름 : 홍길동1, 전화번호 : 11111111111 ~ 이름 : 홍길동4, 전화번호 : 44444444444
		public void printAllPhoneNum() {
			while(true) {
				System.out.println("이름 : " + name + ", " + "전화번호 : " + phoneNum);

				if(index > name.length - 1) // => 이대로 돌리면 무한 루프 걸림
					break;
			}
		}
		
		//전달 받은 인덱스에 해당하는 이름과 전화번호를 출력하는 메소드 printPhoneNum
		//e.g. 이름 : 홍길동3, 전화번호 : 33333333333
		public void printPhoneNum(int index) {
			Scanner sc = new Scanner(System.in); //매번 Scanner 돌리면 부담
			index = sc.nextInt();
					if(index >= 0 || index < 100)
			System.out.println("이름 : " + name[index - 1] + ", " + "전화번호 : " + phoneNum[index - 1]);
					else
			System.out.println("다시 입력해주세요.");
	}
}