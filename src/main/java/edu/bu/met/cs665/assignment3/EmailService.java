package edu.bu.met.cs665.assignment3;

public class EmailService {

	public String generateBusinessEmail(Business customer) {
		Email email = new BusinessEmailDecorator(new BaseEmail(customer));
		return finishEmail(email);
	}

	public String generateReturningEmail(Returning customer) {
		Email email = new ReturningEmailDecorator(new BaseEmail(customer));
		return finishEmail(email);
	}

	public String generateFrequentEmail(Frequent customer) {
		Email email = new FrequentEmailDecorator(new BaseEmail(customer));
		return finishEmail(email);
	}

	public String generateNewEmail(New customer) {
		Email email = new NewEmailDecorator(new BaseEmail(customer));
		return finishEmail(email);
	}

	public String generateVIPEmail(VIP customer) {
		Email email = new VIPEmailDecorator(new BaseEmail(customer));
		return finishEmail(email);
	}

	private String finishEmail(Email email) {
		return email.generate()
			+ "Warm Regards,\n"
			+ "Customer Service";
	}
}