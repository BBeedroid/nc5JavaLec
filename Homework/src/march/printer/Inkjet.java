package march.printer;

public class Inkjet extends Printer {
	//매개변수 있는 생성자
	public Inkjet(int printCnt, int paperResidualQtt) {
		super(printCnt, paperResidualQtt);
	}
	
	//잉크 잔량 메소드
	public void residualQtt(int printIndex) {
		if(paperResidualQtt[printIndex] == 0)
			System.out.println("잉크를 보충해 주세요.");
		else
			System.out.println("잉크가 " + paperResidualQtt + "퍼센트 남았습니다.");
	}
}
