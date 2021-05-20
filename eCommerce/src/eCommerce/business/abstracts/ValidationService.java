package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface ValidationService {
	
	boolean firstNameIsVerified(User user);
	boolean lastNameIsVerified(User user);
	boolean emailIsVerified(User user);
	boolean passwordIsVerified(User user);

}
