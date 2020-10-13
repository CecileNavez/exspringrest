package be.abis.exercise.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Login {
	
	@JsonProperty("email")
	private String emailAddress;
	private String password;
	
	public Login(String emailAddress, String password) {
		super();
		this.emailAddress = emailAddress;
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
