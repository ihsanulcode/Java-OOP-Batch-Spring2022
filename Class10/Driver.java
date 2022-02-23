
public class Driver {

	public static void main(String[] args) {
		
		Account ac1 = new Account(101,5000);
		ac1.credit(10000);
		ac1.debit(2000);
		//ac1.debit(15000);
		//System.out.println("Account Number: "+ac1.getAccountNumber());
		//System.out.println("Account Balance: "+ac1.getBalance());
		ac1.setBalance(13005);
		String accountInfo = ac1.toString();
		//System.out.println(accountInfo);
		
		Account ac2 = new Account(102,6000);
		Account ac3 = new Account(103,7000);
		
		
		//array of objects
		Account arr[] = new Account[3];
		arr[0] = ac1;
		arr[1] = ac2;
		arr[2] = ac3;
		
		for(int i=0;i<3;i++) {
			System.out.println(arr[i].toString());
		}

	}

}
