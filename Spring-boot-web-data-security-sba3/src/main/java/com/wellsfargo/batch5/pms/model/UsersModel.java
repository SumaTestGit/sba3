package com.wellsfargo.batch5.pms.model;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class UsersModel {	
	
	@NotNull(message="User ID cannot be null")	
	private Integer userId;
	
	@NotNull(message="User Name cannot be null")
	@NotBlank(message="User Name cannot be blank")
	@Size(min=7,max=15, message="User Name should be between 7 and 15 chars length")
	private String userName;
	
	@NotNull(message="First Name cannot be null")
	@NotBlank(message="First Name cannot be blank")
	@Size(min=7,max=15, message="First Name should be between 7 and 15 chars length")
	private String firstName;
	
	@NotNull(message="Last Name cannot be null")
	@NotBlank(message="Last Name cannot be blank")
	@Size(min=7,max=15, message="Last Name should be between 7 and 15 chars length")
	private String lastName;
	
	@NotNull(message="Password cannot be null")
	@NotBlank(message="Password cannot be blank")
	@Size(min=7,max=15, message="Password should be between 7 and 16 chars length")
	private String password;
	
	@NotNull(message = "Confirm password is mandatory")
	@NotBlank(message = "Confirm password is mandatory")
	@Size(min = 8, max = 20, message = "Confirm password must be 7 and 16 chars length")
	private String confirmPassword;
			
	@NotNull(message="Role cannot be null")
	@NotBlank(message="Role cannot be blank")
	private String role;	
		
	@NotNull(message="PAN cannot be null")
	@NotBlank(message="PAN cannot be blank")
	@Pattern(regexp="[A-Z]{5}[0-9]{4}[A-Z]",message="PAN number should be of 10 chars length.")
	private String PAN;
	
	@NotNull(message="Contact Address cannot be null")
	@NotBlank(message="Contact Address cannot be blank")
	private String contactAddress;
	
	@NotNull(message="Mobile Number cannot be null")
	@NotBlank(message="Mobile Number cannot be blank")
	@Pattern(regexp="[1-9][0-9]{9}",message="Mobile Number should be of 10 digits.")
	private String mobileNumber;
	
	@NotNull(message="Date Of Birth is mandate")	
	@PastOrPresent(message="Date Of Birth can not be a future date")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate DOB;
	
	@NotNull(message="Email cannot be null")
	@NotBlank(message="Email cannot be blank")
	@Pattern(regexp="[A-Za-z0-9][@][A-Za-z0-9][.][A-Za-z]",message="Email format")	
	private String email;
	
	public UsersModel() {
		
	}	

	public UsersModel(Integer userId, String userName, String firstName, String lastName, String password, String confimrPassword,
			String role, String PAN, String contactAddress, String mobileNumber, LocalDate DOB, String email) {
		
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.confirmPassword = confimrPassword;
		this.role = role;
		this.PAN = PAN;
		this.contactAddress = contactAddress;
		this.mobileNumber = mobileNumber;
		this.DOB = DOB;
		this.email = email;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getPassword() {
		return password;
	}
	
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
}
