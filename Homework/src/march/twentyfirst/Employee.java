package march.twentyfirst;

public abstract class Employee {
	//1. 멤버변수
	public String numOfEmp;
	public String name;
	public double payment;
	public double monthPay;
	
	//2. 생성자
	public Employee(String numOfEmp, String name, double payment) {
		this.numOfEmp = numOfEmp;
		this.name = name;
		this.payment = payment;
	}
	
	//3. 추상 class
	public abstract void getMonthPay();
	
	//4. 일반 class
	public void showEmployeeInfo() {
		System.out.println("사번: " + numOfEmp);
		System.out.println("이름: " + name);
		System.out.println("급여: " + payment);
	}
}
