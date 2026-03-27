package edu.bu.met.cs665.assignment3;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class EmailGenerationTest {

	private EmailService service;

	@Before
	public void setUp() {
		service = new EmailService();
	}

	@Test
	public void testBusinessEmail() {

		Business customer = new Business("Cupcake Shop");
		String email = service.generateBusinessEmail(customer);

		assertTrue(email.contains("Cupcake Shop"));
		assertTrue(email.contains("Thank you for doing business with us, we appreciate your business."));
	}

	@Test
	public void testReturningEmail() {

		Returning customer = new Returning("Yuting");
		String email = service.generateReturningEmail(customer);

		assertTrue(email.contains("Yuting"));
		assertTrue(email.contains("Thank you for returning to our business."));
	}

	@Test
	public void testFrequentEmail() {

		Frequent customer = new Frequent("Lola");
		String email = service.generateFrequentEmail(customer);

		assertTrue(email.contains("Lola"));
		assertTrue(email.contains("Thank you for being a frequent customer."));
	}

	@Test
	public void testNewEmail() {

		New customer = new New("Stinky");
		String email = service.generateNewEmail(customer);

		assertTrue(email.contains("Stinky"));
		assertTrue(email.contains("Thank you for being a new customer. We hope you return."));
	}

	@Test
	public void testVIPEmail() {

		VIP customer = new VIP("Goofy");
		String email = service.generateVIPEmail(customer);

		assertTrue(email.contains("Goofy"));
		assertTrue(email.contains("You are a VIP customer, thank you for your support."));
	}

	@Test
	public void testEmailsAreDifferent() {

		String businessEmail = service.generateBusinessEmail(new Business("Cupcake Shop"));
		String returningEmail = service.generateReturningEmail(new Returning("Yuting"));
		String frequentEmail = service.generateFrequentEmail(new Frequent("Lola"));
		String newEmail = service.generateNewEmail(new New("Stinky"));
		String vipEmail = service.generateVIPEmail(new VIP("Goofy"));

		assertNotEquals(businessEmail, returningEmail);
		assertNotEquals(businessEmail, frequentEmail);
		assertNotEquals(businessEmail, newEmail);
		assertNotEquals(businessEmail, vipEmail);
	}
}