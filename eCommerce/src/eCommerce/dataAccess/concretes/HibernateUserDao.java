package eCommerce.dataAccess.concretes;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kullanıcı bilgileri sisteme eklendi : " + user.getFirstName() +" "+user.getLastName() );
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı bilgileri güncellendi : " + user.getFirstName() +" "+user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı bilgileri sistemden silindi : " + user.getEmail());
		
	}

}
