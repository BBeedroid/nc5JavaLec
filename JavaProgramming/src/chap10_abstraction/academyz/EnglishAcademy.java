package chap10_abstraction.academyz;

public class EnglishAcademy extends Academy {
	@Override
	public void teach(int subject) {
		System.out.println("영어 과목을 " + subject + "개 가르칩니다.");
		super.subjectNum = subject;
	}

	@Override
	public void doHomework(boolean doHw) {
		if(doHw == true) 
		System.out.println("영어 과제를 했습니다.");
		else
		System.out.println("영어 과제를 하지 않았습니다.");
		super.homework = doHw;
	}

	@Override
	public void rest() {
		System.out.println("쉬는 시간에 영어 자유 회화를 합니다.");
	}

	@Override
	public void attend() {
		System.out.println("매 시간마다 출석을 확인합니다.");
	}

}
