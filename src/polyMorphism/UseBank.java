package polyMorphism;

public class UseBank {
	public static void main(String[] args) {
		Bank ban = new Bank();
		System.out.println(ban.loan());
		System.out.println(ban.loan(30000));
		System.out.println(ban.loan(30000,5000000));
		System.out.println(ban.loan("Chennai"));
	}

}
