
public class Fees {
	
	private String feeName;
	private double feeAmount;
	private String dueDate;
	
	public Fees(String feeName, double feeAmount, String dueDate) {
		this.feeName = feeName;
		this.feeAmount = feeAmount;
		this.dueDate = dueDate;
	}
	public String getFeeName() {
		return feeName;
	}
	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}
	public double getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	

}
