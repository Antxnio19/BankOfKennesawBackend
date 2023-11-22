package BankOfKennesaw.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import BankOfKennesaw.model.BankUser;
import BankOfKennesaw.repository.BankUserRepository;

@RestController
public class RegisterServiceApp {
	
    @Autowired
    private BankUserRepository repository;

    @PostMapping("/register")
    public String register(@RequestBody BankUser user) {
        repository.save(user);
        return "Hi " + user.getFullName() + " your Registration process successfully completed";
    }
    
    @GetMapping("/getAllUsers")
    public List<BankUser> findAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/findUser/{id}")
    public Optional<BankUser> findUser(@PathVariable long id) {
        return Optional.ofNullable(repository.findById(id));
    }

    @DeleteMapping("/cancel/{id}")
    public List<BankUser> cancelRegistration(@PathVariable long id) {
        repository.deleteById(id);
        return repository.findAll();
    }

}
