package calculations;

public class Calculate {

	public static Credit c;
	public static Purchase p;
	public static Expense e;

	public static void main(String[] args) throws InterruptedException {

		long cr = c.getcredit();
		Thread.sleep(500);

		long cp = p.getcarprice();
		Thread.sleep(500);

		long exp = e.total_expense();
		Thread.sleep(500);

		long totalexp = cp + exp;
		Thread.sleep(500);

		long avc = cr - totalexp;

		System.err.println("Total expese :" + totalexp);
		Thread.sleep(500);

		System.out.println("Available credit =" + " " + avc);

	}

	static {

		c = new Credit();
		p = new Purchase();
		e = new Expense();

	}

	static {

		c.setcredit(20000);
		p.setcarpice(15000);
		e.setInsurance(500);

	}

}
