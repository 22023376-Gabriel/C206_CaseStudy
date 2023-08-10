
public class Fees {
	
	private String feeName;
	private double feeAmount;
	private String dueDate;
	private int feeId;
	
	public Fees(String feeName, double feeAmount, String dueDate, int feeId) {
		this.feeName = feeName;
		this.feeAmount = feeAmount;
		this.dueDate = dueDate;
		this.feeId = feeId;
	}
	public int getFeeId() {
		return feeId;
	}
	public void setFeeId(int feeId) {
		this.feeId = feeId;
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
