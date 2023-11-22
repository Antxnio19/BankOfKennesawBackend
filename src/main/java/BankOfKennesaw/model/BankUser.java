package BankOfKennesaw.model;


import java.util.Objects;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name="Bank_Users")
public class BankUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String fullName;
	private String username;
	private String password;
	private String email;
	private String phoneNumber;
	private String Address;
	private long DOB;
	
	public BankUser() {
		
	}
	
	public BankUser(long id, String name, String password, String email) {
		super();
		this.id = id;
		this.fullName = name;
		this.password = password;
		this.email = email;
	}
	
	

	public BankUser(BankUser user) {
		super();
		this.fullName = user.getFullName();
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.email = user.getEmail();
		this.phoneNumber = user.getPhoneNumber();
		this.Address = user.getAddress();
		this.DOB = user.getDOB();
	}


	

	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public long getDOB() {
		return DOB;
	}



	public void setDOB(long dOB) {
		DOB = dOB;
	}



	public long getId() {
		return id;
	}

//no setter for id because I want to respect data integrity by restricting access. 

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	@Override
	public String toString() {
		return "BankUser [id=" + id + ", fullName=" + fullName + ", username=" + username + ", password=" + password
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", Address=" + Address + ", DOB=" + DOB + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Address, DOB, email, fullName, id, password, phoneNumber, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankUser other = (BankUser) obj;
		return Objects.equals(Address, other.Address) && DOB == other.DOB && Objects.equals(email, other.email)
				&& Objects.equals(fullName, other.fullName) && id == other.id
				&& Objects.equals(password, other.password) && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(username, other.username);
	}


}
