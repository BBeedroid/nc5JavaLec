package march.printer;

public class Laser extends Printer {
	//매개변수 있는 생성자
	public Laser(int printCnt, int paperResidualQtt) {
		super(printCnt, paperResidualQtt);
	}
	
	//토너 메소드
	public void residualQtt(int printIndex) {
		if(paperResidualQtt[printIndex] == 0)
			System.out.println("토너를 보충해 주세요.");
		else
			System.out.println("토너가 " + paperResidualQtt + "퍼센트 남았습니다.");
	}
}
