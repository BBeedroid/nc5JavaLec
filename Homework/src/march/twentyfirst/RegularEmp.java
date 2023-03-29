package march.twentyfirst;

public class RegularEmp extends Employee {
	public double bonus;

	public RegularEmp(String numOfEmp, String name, double payment, double bonus) {
		super(numOfEmp, name, payment);
		this.bonus = bonus;
	}

	@Override
	public void getMonthPay() {
		double monthPay = (payment / 12) + (bonus / 12);
		System.out.println("월급: " + monthPay);
	}

}
