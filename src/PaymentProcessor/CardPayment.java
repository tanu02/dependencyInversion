package PaymentProcessor;

public class CardPayment implements Ipayment, ICardDetails {
	Ipayment payer ;
	

	@Override
	public void makePayment(int amount) {
		// TODO Auto-generated method stub
		System.out.println("CardPayment deducted amount = " + amount);
		
	}


	@Override
	public void showCardDetails() {
		// TODO Auto-generated method stub
		
	}
}
