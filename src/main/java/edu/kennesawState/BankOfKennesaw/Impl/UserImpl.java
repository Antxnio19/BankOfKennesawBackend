package edu.kennesawState.BankOfKennesaw.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import edu.kennesawState.BankOfKennesaw.DTO.SingInDTO;
import edu.kennesawState.BankOfKennesaw.DTO.UserDTO;
import edu.kennesawState.BankOfKennesaw.Repo.UserRepo;
import edu.kennesawState.BankOfKennesaw.model.User;
import edu.kennesawState.BankOfKennesaw.service.LoginMessage;
import edu.kennesawState.BankOfKennesaw.service.UserService;

@Service
public class UserImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String addUser(UserDTO userDTO) {
		
        User newUser = new User(
        		userDTO.getUserId(),
        		userDTO.getUserFullName(),
        		userDTO.getUserEmail(),
        		userDTO.getUserPhoneNumber(),
        		userDTO.getUsername(),
        		this.passwordEncoder.encode(userDTO.getPassword())
        		);
        userRepo.save(newUser);
        return newUser.getUserFullName();
	}
	
	UserDTO userDTO;

	@Override
	public LoginMessage loginUser(SingInDTO singInDTO) {
		
		String msg = "";
        User user1 = userRepo.findByUsername(singInDTO.getUsername());
        if (user1 != null) {
            String password = singInDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepo.findUserByUsernameAndPassword(singInDTO.getUsername(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginMessage("Login Success", true);
                } else {
                    return new LoginMessage("Login Failed", false);
                }
            } else {
                return new LoginMessage("password Not Match", false);
            }
        }else {
            return new LoginMessage("Email not exits", false);
        }

	}

}
