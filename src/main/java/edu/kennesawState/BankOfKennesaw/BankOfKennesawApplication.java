package edu.kennesawState.BankOfKennesaw;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import BankOfKennesaw.model.BankUser;
import BankOfKennesaw.repository.BankUserRepository;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class BankOfKennesawApplication {
	
	@Autowired
	private BankUserRepository repository;
	
	@PostConstruct
	public void initUsers() {
		List<BankUser> users = Stream.of(
				new BankUser(101, "JesusTrejoTamayo", "password1234", "jtrejo@gmail.com"),
				new BankUser(102, "sallySmith", "password1234", "sallySmith@gmail.com"),
				new BankUser(103, "janeDoe", "password1234", "janeDoe@gmail.com"),
				new BankUser(104, "mikeDavis", "password1234", "mikeDavis@gmail.com"),
				new BankUser(105, "samWilliams", "password1234", "samWilliams@gmail.com"),
				new BankUser(106, "kenClark", "password1234", "kenClark@gmail.com")
				).collect(Collectors.toList());
		repository.saveAll(users);
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(BankOfKennesawApplication.class, args);
	}

}
