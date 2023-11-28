package edu.kennesawState.BankOfKennesaw.DTO;

public class UserDTO {
	
	private long userId;
	private String userFullName;
	private String userEmail;
	private int userPhoneNumber;
	private String password;
	private String username;
	
	public UserDTO() {
		
	}
	
	public UserDTO(long userId, String userFullName, String userEmail, int userPhoneNumber, String password, String username) {
		super();
		this.userId = userId;
		this.userFullName = userFullName;
		this.userEmail = userEmail;
		this.userPhoneNumber = userPhoneNumber;
		this.password = password;
		this.username = username;
	}
	public long getUserId() {
		return userId;
	}

	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(int userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	

}
