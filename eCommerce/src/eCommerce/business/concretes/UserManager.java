package eCommerce.business.concretes;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.abstracts.ValidationService;
import eCommerce.core.SignUpService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private ValidationService ValidationService;
	private SignUpService SignUpService;

	public UserManager(UserDao userDao, ValidationService validationService, SignUpService signUpService) {
		super();
		this.userDao = userDao;
		ValidationService = validationService;
		SignUpService = signUpService;
	}

	@Override
	public void signUp(User user) {
		
		if(ValidationService.firstNameIsVerified(user)==true && ValidationService.lastNameIsVerified(user)==true && 
				ValidationService.emailIsVerified(user)==true && ValidationService.passwordIsVerified(user)==true) {
			System.out.println("Email ve þifreniz onaylandý.");
			this.userDao.add(user);
			this.SignUpService.signUpToSystem();
		} else {
			System.out.println("Email ve þifrenizi kontrol edin.");
		}
			
		
		
	}

	@Override
	public void logIn(User user, String email, String password) {
		if(email == user.getEmail() && password == user.getPassword()) {
			System.out.println("Sisteme giriþ yapýldý.");
		} else {
			System.out.println("Hatalý giriþ yaptýnýz.");
		}
		
	}

}
