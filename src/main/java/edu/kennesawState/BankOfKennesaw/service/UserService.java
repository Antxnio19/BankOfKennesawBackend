package edu.kennesawState.BankOfKennesaw.service;



import edu.kennesawState.BankOfKennesaw.DTO.SingInDTO;
import edu.kennesawState.BankOfKennesaw.DTO.UserDTO;

public interface UserService {
	
	String addUser(UserDTO userDTO);
	
	
	LoginMessage loginUser(SingInDTO singInDTO);

}
