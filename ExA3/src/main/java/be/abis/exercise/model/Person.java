package be.abis.exercise.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Person {
	
	private int personId;

	private String firstName;
	private String lastName;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate birthDate;
	
	private String emailAddress;
	private String password;
	private String language;
	private Company company;
	public Person(int personId, String firstName, String lastName, LocalDate birthDate, String emailAddress,
			String password, String language, Company company) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.emailAddress = emailAddress;
		this.password = password;
		this.language = language;
		this.company = company;
	}
	
	public Person() {
	}
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
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
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
}
