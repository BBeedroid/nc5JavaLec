package march.printer;

public class Printer {
	//멤버 변수: 모델명, 제조사, 인터페이스 종류(USB, paraller port), 인쇄매수, 인쇄 종이 잔량
	String model;
	String manufacturer;
	String kindOfInterface;
	int[] printCnt;
	int[] paperResidualQtt;
	
	//현재 인덱스 담을 변수
	int printerIndex = 0;
	
	//매개변수 있는 생성자
	public Printer(int printCnt, int paperResidualQtt) {
		this.printCnt[printerIndex] = printCnt;
		this.paperResidualQtt[printerIndex] = paperResidualQtt;
	}
	
	//용지 투입 메소드
	public void insertPaper(int printCnt, int paperResidualQtt) {
		this.printCnt[printerIndex] = printCnt;
		this.paperResidualQtt[printerIndex] = paperResidualQtt;
		printerIndex++;
	}

	//print 메소드
	public void print(int printIndex) {
			if(paperResidualQtt[printIndex] == 0)
				System.out.println("용지를 보충해 주십시오.");
			else
				System.out.println("인쇄 매수: " + printCnt + "장입니다. "
						+ "종이가 " + paperResidualQtt + "장 남았습니다.");
	}
		
	//잔량 메소드
	public void residualQtt(int printIndex) {
			if(paperResidualQtt[printIndex] == 0)
				System.out.println("용지를 보충해 주세요.");
			else
				System.out.println("종이가 " + paperResidualQtt + "장 남았습니다.");
	}
	
}
