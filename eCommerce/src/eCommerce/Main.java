package eCommerce;

import eCommerce.business.abstracts.EmailService;
import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.EmailManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.business.concretes.ValidationManager;
import eCommerce.core.DefaultSignUpManager;
import eCommerce.core.GoogleSignUpManagerAdapter;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Esra","Konya","esra@example.com","123789");
		User user2 = new User(2,"Ayþin","Konya","aysin@example.com","456147");
		
		UserService userService = new UserManager(new HibernateUserDao(), new ValidationManager(), new DefaultSignUpManager());
		UserService userService2 = new UserManager(new HibernateUserDao(), new ValidationManager(), new GoogleSignUpManagerAdapter());
		
		EmailService emailService = new EmailManager();
		
		userService.signUp(user2);
		emailService.send();
		emailService.verify();
		
		System.out.println("\n");
		System.out.println("\n");
		
		userService2.signUp(user1);
		emailService.send();
		emailService.verify();
		
		System.out.println("\n");
		System.out.println("\n");
		
		userService.logIn(user1, "esra@example.com", "123789");
		userService.logIn(user2, "aysin@example.com", "456147");
	}

}
