package march.oneseven;

import march.printer.Inkjet;
import march.printer.Laser;
import march.printer.Printer;

public class _0317_basic {

	public static void main(String[] args) {
		/*1. 다음 상속 구조를 설계하세요
		모든 프린터는 모델명, 제조사, 인터페이스 종류(USB, paraller port), 인쇄매수, 인쇄 종이 잔량을 나타내는 정보를 가짐
		print()메서드를 가짐
		잉크젯프린터는 잉크 잔량이라는 추가 정보를, 레이저프린터는 토너 잔량이라는 추가 정보를 가짐
		print()메서드는 각 프린터 타입에 맞게 구현한다
		편의상 print()메서드를 한 번 호출할 때마다 인쇄용지 1매를 사용하는 것으로 한다
		클래스들을 설계하고 적절한 필드, 생성자, 메서드를 작성하세요
		그리고 실행 프로그램을 작성해서 동작시키세요
		            프린터
		잉크젯프린터             레이저프린터*/
		
		//객체화
		Printer parentsPrint = new Printer(0, 10);
		Printer inkjetPrint = new Inkjet(0, 10); //매개변수 있는 부모class 생성자는 자동 상속되지 않는다
		Printer laserPrint = new Laser(0, 10);
		
		//실행 1. 프린트 용지 투입
		parentsPrint.insertPaper(10, 0);
		inkjetPrint.insertPaper(10, 0);
		laserPrint.insertPaper(10, 0);
		
		//실행 2. 프린트 출력
		parentsPrint.print(10);
		parentsPrint.residualQtt(10);
		
		System.out.println();
		
		inkjetPrint.print(10);
		inkjetPrint.residualQtt(10);
		
		System.out.println();
		
		laserPrint.print(10);
		laserPrint.residualQtt(10);
		

	}

}
