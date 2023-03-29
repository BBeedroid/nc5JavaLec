package chap04_controlStatement;

public class _02_ifEarlyReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//최근 else if, else 구문을 사용하지 않고 얼리리턴 방식을 사용하는 추세
		//메모리 이슈가 있으나 현재는 거의 다 RAM 8기가 이상 사용
		//중첩 if문은 함수로 빠진다
		int score = 68;
		String grade = ""; //grade 값을 초기화, 초기화하지 않으면 에러 발생 
		
		if(score >= 90)
			grade = "A";
			
		if(score >= 80)
			grade = "B";
		
		if(score >= 70)
			grade = "C";
		
		if(score >= 60)
			grade = "D";
		
		if(score < 60)
			grade = "F";
		
		System.out.println(grade);
		

	}

}
