package calculations;

public class Expense {

	private long Insurance;
	private long Repairing_Coating;
	private long Transfer;
	private long Agent_Commision;
	private long Mediator_Share;

	public long getInsurance() {
		System.out.println("Insurance:" + "" + Insurance);
		return Insurance;
	}

	public long getRepairing_Coating() {
		System.out.println("Repairing_Coating:" + "" + Repairing_Coating);
		return Repairing_Coating;
	}

	public long getTransfer() {
		System.out.println("Transfer:" + "" + Transfer);
		return Transfer;
	}

	public long getAgent_Commision() {
		System.out.println("Agent_Commision:" + "" + Agent_Commision);
		return Agent_Commision;
	}

	public long getMediator_Share() {
		System.out.println("Mediator_Share:" + "" + Mediator_Share);
		return Mediator_Share;
	}

	public void setInsurance(long i) {
		this.Insurance = i;
	}

	public void setRepairing_Coating(long r) {
		this.Repairing_Coating = r;
	}

	public void setTransfer(long t) {
		this.Transfer = t;
	}

	public void setAgentcommission(long c) {
		this.Agent_Commision = c;
	}

	public void setmediator_share(long m) {
		this.Mediator_Share = m;
	}

	public long total_expense() {
		long total = Insurance + Repairing_Coating + Transfer + Agent_Commision + Mediator_Share;
		System.out.println("Total Expense = " + "" + total);

		return total;
	}

}
