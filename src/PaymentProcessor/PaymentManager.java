package PaymentProcessor;

public class PaymentManager{
	Ipayment payer ; 
	int amount;
			
	PaymentManager(Ipayment payer, int amount){
		this.payer = payer;
		this.amount = amount;
	}
	public void makePayment(){
		payer.makePayment(amount);
	}
			
	
}