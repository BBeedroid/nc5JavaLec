package march.twentyfirst;

public class ContractEmp extends Employee {
	public int workDay;

	public ContractEmp(String numOfEmp, String name, double payment, int workDay) {
		super(numOfEmp, name, payment);
		this.workDay = workDay;
	}

	@Override
	public void getMonthPay() {
		double monthPay = payment * workDay;
		System.out.println(workDay + "일 동안 일한 급여: " + monthPay);
	}

}
