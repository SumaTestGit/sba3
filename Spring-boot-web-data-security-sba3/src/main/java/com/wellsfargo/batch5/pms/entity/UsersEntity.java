package com.wellsfargo.batch5.pms.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@DiscriminatorColumn(name="role",discriminatorType = DiscriminatorType.STRING)
@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
public class UsersEntity {
	
	@GeneratedValue
	@Id
	@Column(name="user_id")	
	private Integer userId;
	
	@Column(name="user_name",nullable=true,unique=true)
	private String userName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="password",nullable=true)
	private String password;
	
	@Column(name="role", insertable=false, updatable = false)
	private String role;	
		
	@Column(name="pan")
	private String PAN;
	
	@Column(name="contact_address")
	private String contactAddress;
	
	@Column(name="mobile_number")
	private String mobileNumber;
	
	@Column(name="DOB")
	private LocalDate DOB;
	
	@Column(name="email")
	private String email;	
		
	public UsersEntity() {
		
	}	

	public UsersEntity(Integer userId, String userName, String password, String role, String firstName, String lastName,
			String PAN, String contactAddress, String mobileNumber, LocalDate DOB, String email) {
		
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String PAN) {
		this.PAN = PAN;
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

	public void setDOB(LocalDate DOB) {
		this.DOB = DOB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
}
