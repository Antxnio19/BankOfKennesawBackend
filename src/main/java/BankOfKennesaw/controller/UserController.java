package BankOfKennesaw.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import BankOfKennesaw.customExceptions.UserNotFoundException;
import BankOfKennesaw.model.BankUser;
import BankOfKennesaw.service.UserService;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;	}
	

	
	@PostMapping("/login")
	public String toLoginUser(HttpSession session, BankUser user) throws UserNotFoundException{
		if(userService.verifyUser(user)) {
			BankUser foundUser = userService.findUsername(user.getUsername());
			session.setAttribute("user", foundUser);
			return "redirect:/";
		}
		
		return "redirect:/signIn";
	}
	
	
	@PostMapping("/register")
	public ResponseEntity<BankUser> registerNewUser(BankUser user) {
		BankUser newUser = userService.createNewUser(user);
		return new ResponseEntity<BankUser>(newUser, HttpStatus.CREATED);
		  }
	
	@GetMapping("/logout")
	public String toLogOut(HttpSession session) {
		session.invalidate();
		return "redirect:/signIn";
	}


}
