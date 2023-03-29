package chap04_controlStatement;

public class _03_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "A";
		
		switch(grade) {
			case "A":
				System.out.println("점수는 " + "90 이상입니다.");
				break; //break문이 없으면 맞는 조건부터 break문을 만날 때까지 모두 실행된다, case별 break 필수
			case "B":
				System.out.println("점수는 " + "90 미만 " + "80 이상입니다.");
				break;
			default:
				System.out.println("점수는 " + "80 미만입니다.");
				break;
		}
		
		/*switch(10 % 3) {
			case 1:
				
			case 2:
			
			default:
		}*/
		
		//boolean 타입은 switch~case문의 조건으로 사용 불가
		/*switch(10 > 20) {
			case true:
		
			case false:
			
			default:
		}*/
	}

}
