package PaymentProcessor;

public class MakePayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ipayment paymentType = new CashPayment();
		int amount = 100;
	    PaymentManager  payManager = new PaymentManager(paymentType, amount);	
	    payManager.makePayment();
	 	
	}

}
