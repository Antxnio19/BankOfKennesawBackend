package BankOfKennesaw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import BankOfKennesaw.model.BankUser;

public interface BankUserRepository  extends JpaRepository<BankUser, Long>{
	
	BankUser findById(long id);

	BankUser findByUserName(String username);

}
