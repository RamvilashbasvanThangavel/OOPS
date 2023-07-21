package polyMorphismOverRidding;

public class UseAxisBank {
	public static void main(String[] args) {
		AxisBank a1 = new AxisBank();
		System.out.println(a1.intrest(300000));
		System.out.println(a1.acNo(6374307218l));

		RbiBank r1 = new RbiBank();
		System.out.println(r1.interest(10000));
		System.out.println(r1.baseAmount());
	}
}