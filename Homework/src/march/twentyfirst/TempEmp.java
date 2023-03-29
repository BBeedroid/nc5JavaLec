package march.twentyfirst;

public class TempEmp extends Employee {
	public int hireYear;

	public TempEmp(String numOfEmp, String name, double payment, int hireYear) {
		super(numOfEmp, name, payment);
		this.hireYear = hireYear;
	}

	@Override
	public void getMonthPay() {
		double monthPay = payment / 12;
		System.out.println("월급: " + monthPay);
	}

}
