package polyMorphismOverRidding;

public class AxisBank extends RbiBank {
	public int intrest(int principleAmount) {
		return principleAmount*20/100;
	}
	public long acNo(long accountNo) {
		return accountNo;
	}

}
