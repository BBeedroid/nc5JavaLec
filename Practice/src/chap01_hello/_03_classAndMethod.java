package chap01_hello;

//_03_classAndMethod 클래스 => 데이터 + 메소드 집합체
public class _03_classAndMethod {
	private String accountInfo = "1002-***-******"; //계좌번호 => 데이터
	private int balance = 0; //현재 잔액 => 데이터
	
	//계좌 번호를 알려주는 메소드(기능)
	public void printAccountInfo() {
		System.out.println("계좌 번호는 : " + accountInfo + "입니다.");
	}
	
	//잔고를 알려주는 메소드
	public void printBalance() {
		System.out.println("현재 계좌 잔고는 " + balance + "입니다.");
	}
	
	//입금하는 메소드
	public void deposit(int amount) {
		System.out.println(amount + "원은 입금하셨습니다.");
		balance += amount;
	}
	
	//출금하는 메소드
	public void withdraw(int amount) {
		if(amount > balance) {
			System.out.println("잔고보다 많은 금액을 인출하려고 합니다.");
		} else {
			System.out.println(amount + " 원을 출금하셨습니다.");
			balance -= amount;
		}
	}
	
	public static void main(String args[]) { //메인 메소드
		/*클래스 _01_classAndMethod를 인스턴스화 시켜서 '인스턴스'를 생성한다
		=> 클래스를 기반으로 만들어진 '인스턴스'를 '객체'라고 한다
		   ('클래스 = 붕어빵틀'일 시 '인스턴스 = 붕어빵' '키워드 new = 붕어빵 굽기'
      빵틀 자체를 먹을 순 없지만 붕어빵을 먹으려면 틀이 있어야 한다)
		  인스턴스를 생성하면 인스턴스 주소값이 반환되고
      이 주소값은 참조변수 account1에 저장된다*/
		_03_classAndMethod account1 = new _03_classAndMethod();
		 account1.printAccountInfo();
		 account1.printBalance(); //0원
		 account1.deposit(10000); //0 + 10,000원
		 account1.printBalance(); //10,000원
		 account1.withdraw(1000); //10,000원 - 1,000원
		 account1.printBalance(); //9,000원
		 
		 /*참조변수는 인스턴스의 주소값을 저장한다
		 그러므로 하나의 인스턴스를 둘 이상의 참조변수가 동시에 참조할 수도 있다*/
		 _03_classAndMethod account2 = account1;
		 account1.deposit(6000); //9,000원 + 6,000원
		 account2.printBalance(); //15,000원
		 
	}
}