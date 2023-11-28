package edu.kennesawState.BankOfKennesaw.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.kennesawState.BankOfKennesaw.model.User;

public interface UserRepo  extends JpaRepository<User, Long>{
	
	Optional<User> findUserByUsernameAndPassword(String username, String Password);
	
	
	User findByUsername(String username);

}
