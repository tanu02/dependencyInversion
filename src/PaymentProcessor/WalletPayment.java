package PaymentProcessor;

public class WalletPayment implements Ipayment, IWalletDetails {

	@Override
	public void makePayment(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Wallet Payment Deducted amount = " + amount);
	}

	@Override
	public void showWalletDetail(String mobNo) {
		// TODO Auto-generated method stub
		
	}

}
