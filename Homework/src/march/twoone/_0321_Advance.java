package march.twoone;

import march.twentyfirst.ContractEmp;
import march.twentyfirst.Employee;
import march.twentyfirst.RegularEmp;
import march.twentyfirst.TempEmp;

public class _0321_Advance {

	public static void main(String[] args) {
		/*1. 추상클래스 회사원
		  - 사번
		  - 이름
		  - 급여
		 생성자
		 추상메서드 double getMonthPay();
		 일반메서드 void showEmployeeInfo();

		정규직 : bonus, 월급 = pay/12+bonus/12
		임시직 : hireYear, 월급 = pay/12;
		계약직 : workDay, 월급 = pay*workDay

		"*** 메뉴 선택 ***"
		"1. 정규직 저장"
		"2. 임시직 저장"
		"3. 계약직 저장"
		"4. 전체 정보 출력"
		"5. 월급 계산 출력"
		"6. 프로그램 종료"*/
		//1. 자식 class 객체화
		Employee em = new RegularEmp("123", "정규직", 4800, 480);
		em.showEmployeeInfo();
		em.getMonthPay();
		
		System.out.println();
		em = new TempEmp("456", "임시직", 4800, 5);
		em.showEmployeeInfo();
		em.getMonthPay();
		
		System.out.println();
		em = new ContractEmp("789", "계약직", 4800, 30);
		em.showEmployeeInfo();
		em.getMonthPay();
	}

}
