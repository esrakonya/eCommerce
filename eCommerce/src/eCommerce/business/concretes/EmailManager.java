package eCommerce.business.concretes;

import eCommerce.business.abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void send() {
		System.out.println("Doğrulama kodunuz mailinize gönderildi.");
		
	}

	@Override
	public void verify() {
		System.out.println("Mail adresiniz doğrulandı.");
		
	}

}
