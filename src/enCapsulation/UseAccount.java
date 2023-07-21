package enCapsulation;

public class UseAccount {
	public static void main(String[] args) {
		Account account1 = new Account();
		account1.setName("RamvilashBasvan");
		account1.setifscCode("IB025678Utg");
		account1.setaccountNo(6374307218l);
		account1.setbalance(1563489324.28d);
		
		System.out.println(account1.getName()+"-"+account1.getifscCode()+","+account1.getaccountNo()+","+account1.getbalance());
	}

}
