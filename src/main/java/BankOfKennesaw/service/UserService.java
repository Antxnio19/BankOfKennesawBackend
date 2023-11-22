package BankOfKennesaw.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import BankOfKennesaw.model.BankUser;
import BankOfKennesaw.repository.BankUserRepository;


@Service
public class UserService implements UserDetailsService{
	
	   @Autowired
	    private BankUserRepository repository;
	   
	   /**
	     * Case-1 
	     * 1. client hit "/authenticate"
	     * 2. Request(Username and Password) vs Database (username and Password)
	     * 3. Populate UserDetails(Spring Security) Object 
	     * 
	     * Case-2
	     * 4. client hit "/" ,"userDetails"
	     * 5. Do #3 
	     */
	    @Override
	public UserDetails loadUserByUsername(String username) 
	    		throws UsernameNotFoundException {
	        BankUser user = repository.findByUserName(username);
	        //BankUser user = repository.findByName(name);
	        return new org.springframework.security.core.userdetails.User(user.getFullName(), user.getPassword(), new ArrayList<>());
	  }

	public boolean verifyUser(BankUser user) {
		// TODO Auto-generated method stub
		return false;
	}

	public BankUser findUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public BankUser createNewUser(BankUser user) {
		// TODO Auto-generated method stub
		return new BankUser(user);
	}



}
