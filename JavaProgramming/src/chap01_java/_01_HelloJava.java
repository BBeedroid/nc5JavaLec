package chap01_java;

public class _01_HelloJava {

	public static void main(String[] args) {
		/*System: 현재 사용 중인 OS를 받아주는 class
    	out: OS에서 현재 사용 중인 출력장치(모니터) <-> in(입력장치: 키보드, 마우스 등)
  		println(): () 안의 내용을 출력한 후 행을 변경하는 메소드
		ln은 line의 약자로 출력 후에 줄바꿈(enter)하라는 명령이다
		c.f. print(): 내용 출력 후 줄바꿈 없음 printf(): 형식 지정 출력 방식(형식: %d 정수, %f 실수, %c 문자 %n 줄바꿈)*/
		System.out.println("Hello Java");
		System.out.printf("%d %n%f %n%c ", 1, 3.14, 'A');
		//syso + ctrl + space
	}

}
