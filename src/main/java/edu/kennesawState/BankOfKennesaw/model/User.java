package edu.kennesawState.BankOfKennesaw.model;

import jakarta.persistence.*;


@Entity
@Table(name="USERS")
public class User {
	
	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	
	@Column(name="USER_FULL_NAME")
	private String userFullName;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="USER_EMAIL")
	private String userEmail;
	
	@Column(name="USER_PHONE_NUMBER")
	private int userPhoneNumber;
	
	@Column(name="PASSWORD")
	private String password;
	
	public User() {
		
	}

	public User(long id, String userFullName, String userEmail, int userPhoneNumber, String password, String username) {
		super();
		this.userId = id;
		this.userFullName = userFullName;
		this.userEmail = userEmail;
		this.userPhoneNumber = userPhoneNumber;
		this.password = password;
		this.username = username;
	}

	public long getUserId() {
		return userId;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	
	
	
	
}
