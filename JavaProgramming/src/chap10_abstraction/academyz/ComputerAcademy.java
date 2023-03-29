package chap10_abstraction.academyz;

public class ComputerAcademy extends Academy {
	//어노테이션
	//@Override: 오버라이드된 메소드라고 컴파일러에게 알려주는 역할이다
	//없을 시 부모와 자식을 계속 비교하며 컴파일하기 때문에 작업 속도가 떨어진다 
	@Override
	public void teach(int subject) {
		System.out.println("컴퓨터 과목을 " + subject + "개 가르칩니다.");
		super.subjectNum = subject;
	}

	@Override
	public void doHomework(boolean doHw) {
		if(doHw == true)
		System.out.println("컴퓨터 과제를 풀었습니다.");
		else
		System.out.println("컴퓨터 과제를 풀지 않았습니다.");
		super.homework = doHw;
	}

	@Override
	public void rest() {
		System.out.println("쉬는 시간에 컴퓨터를 가지고 놉니다.");
	}

	@Override
	public void attend() {
		System.out.println("매일 아침 출석을 체크합니다.");
	}

}
