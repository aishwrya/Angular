package com.cts.MicroService.client.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user_tb")
public class UserEntity {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private long contactNumber;
	private String regCode;
	private String role;
	private String linkedinUrl;
	private Float yearsOfExperience;
	private Boolean active=true;
	private Boolean confirmedSignUp=false;
	private Date resetPasswordDate;
	private Boolean resetPassword=false;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getRegCode() {
		return regCode;
	}
	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLinkedinUrl() {
		return linkedinUrl;
	}
	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}
	public Float getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(Float yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Boolean getConfirmedSignUp() {
		return confirmedSignUp;
	}
	public void setConfirmedSignUp(Boolean confirmedSignUp) {
		this.confirmedSignUp = confirmedSignUp;
	}
	public Date getResetPasswordDate() {
		return resetPasswordDate;
	}
	public void setResetPasswordDate(Date resetPasswordDate) {
		this.resetPasswordDate = resetPasswordDate;
	}
	public Boolean getResetPassword() {
		return resetPassword;
	}
	public void setResetPassword(Boolean resetPassword) {
		this.resetPassword = resetPassword;
	}
	
	
	
}
