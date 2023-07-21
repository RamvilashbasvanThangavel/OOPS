package enCapsulation;

public class Account {
	private String name;
	private String ifscCode;
	private long accountNo;
	private double balance;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setifscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getifscCode() {
		return ifscCode;
	}

	public void setaccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public long getaccountNo() {
		return accountNo;
	}

	public void setbalance(double balance) {
		this.balance = balance;
	}

	public double getbalance() {
		return balance;
	}

}
