package behaviouralDesign.strategyPattern;

public class GooglePayStrategy implements PaymentStrategy {
	private String emailId;
	private String password;
	
	public GooglePayStrategy(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using GooglePay.\n");
	}

}
