package chap02_variables;

public class _15_scopeOfVariables {

	public static void main(String[] args) {
		//1. 지역 변수
		//메인 메소드의 지역 변수
		int mainNum = 10;
		int sum = 0;
		
		if(sum == 0) {
			int ifNum = 20; //지역 변수 ifNum은 if {} 내에서만 쓰이고 삭제됨
			sum = mainNum + ifNum;
		} else {
			int ifNum = 30; // 때문에 else {} 내에서 ifNum 재선언 가능
			sum = mainNum + ifNum;
		}
		//if {}, else {} 블록 밖에서 ifNum을 사용하면 없는 변수로 인식해 에러 발생
		//System.out.println(ifNum);

		//getSum 메소드 안의 지역 변수는 getSum 메소드가 호출됐을 때에 생성됐다가 메서드 호출이 끝나면 삭제된다
		getSum();
		
		//메소드 실행 종료 시점
		//System.out.println(localResult); => localResult를 없는 변수로 인식해 에러 발생
		
	}
	
	public static void getSum() {
		int localVal1 = 10;
		int localVal2 = 20;
		int localResult = localVal1 + localVal2;
		
		System.out.println(localResult);

	}
	
}
