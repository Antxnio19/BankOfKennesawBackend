package edu.kennesawState.BankOfKennesaw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.kennesawState.BankOfKennesaw.DTO.SingInDTO;
import edu.kennesawState.BankOfKennesaw.DTO.UserDTO;
import edu.kennesawState.BankOfKennesaw.service.LoginMessage;
import edu.kennesawState.BankOfKennesaw.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("api/user")
public class UserController {
	
	
    @Autowired
    private UserService userService;
    
    
    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserDTO userDTO)
    {
        String id = userService.addUser(userDTO);
        return id;
    }
    
    
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody SingInDTO singInDTO)
    {
        LoginMessage loginResponse = userService.loginUser(singInDTO);
        return ResponseEntity.ok(loginResponse);
    }
}
