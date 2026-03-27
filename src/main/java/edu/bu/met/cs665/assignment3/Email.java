package edu.bu.met.cs665.assignment3;

interface Email {
	String generate();
}

class BaseEmail implements Email {

	protected final Customer customer;

	public BaseEmail(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String generate() {
		return "Dear " + customer.getName() + ",\n" + "We hope this email finds you well. \n";
	}
}

abstract class EmailDecorator implements Email {

	protected final Email email;

	public EmailDecorator(Email email) {
		this.email = email;
	}
}

class BusinessEmailDecorator extends EmailDecorator {

	public BusinessEmailDecorator(Email email) {
		super(email);
	}

	@Override
	public String generate() {
		return email.generate() + "Thank you for doing business with us, we appreciate your business. \n";
	}
}

class ReturningEmailDecorator extends EmailDecorator {
	
    public ReturningEmailDecorator(Email email) {
        super(email);
	}

	@Override
	public String generate() {
		return email.generate() + "Thank you for returning to our business. \n";
	}
}

class FrequentEmailDecorator extends EmailDecorator {

	public FrequentEmailDecorator(Email email) {
		super(email);
	}

	@Override
	public String generate() {
		return email.generate() + "Thank you for being a frequent customer. \n";
	}
}

class NewEmailDecorator extends EmailDecorator {

	public NewEmailDecorator(Email email) {
		super(email);
	}

	@Override
	public String generate() {
		return email.generate() + "Thank you for being a new customer. We hope you return. \n";
	}
}

class VIPEmailDecorator extends EmailDecorator {

	public VIPEmailDecorator(Email email) {
		super(email);
	}

	@Override
	public String generate() {
		return email.generate() + "You are a VIP customer, thank you for your support. \n";
	}
}