package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserService {
	
	void signUp(User user);
	void logIn(User user, String email, String password);

}
