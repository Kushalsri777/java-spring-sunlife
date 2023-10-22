package insuranceModel;

public class FamilyFloater implements IRDA{
private int duration;
private double amount;

	FamilyFloater(){
		System.out.println("Family Floater");
	}
	@Override
	public double calculatePremium(int age) {
		// TODO Auto-generated method stub
		return amount*12/duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
