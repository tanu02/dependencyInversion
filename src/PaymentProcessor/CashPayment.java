package PaymentProcessor;

public class CashPayment implements Ipayment {
	Ipayment payer ;

	

	@Override
	public void makePayment(int amount) {
		// TODO Auto-generated method stub
		System.out.println("CashPayment deducted amount = " + amount);	
	}
}
