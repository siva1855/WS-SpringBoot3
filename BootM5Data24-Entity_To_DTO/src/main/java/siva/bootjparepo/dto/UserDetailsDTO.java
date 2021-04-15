package siva.bootjparepo.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class UserDetailsDTO {

	private Integer userId;
	private String userName;
	@JsonIgnore
	private String userEmail;
	private String userContact;
	private String userAge;
	@JsonIgnore
	private Date userDateOfBirth;
	//@JsonIgnore
	private Long userEmployeeId;

	private String userLocation;

	public UserDetailsDTO() {
		super();
	}

	public UserDetailsDTO(Integer userId, String userName, String userEmail, String userContact, String userAge,
			Date userDateOfBirth, Long userEmployeeId, String userLocation) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userContact = userContact;
		this.userAge = userAge;
		this.userDateOfBirth = userDateOfBirth;
		this.userEmployeeId = userEmployeeId;
		this.userLocation = userLocation;
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public Date getUserDateOfBirth() {
		return userDateOfBirth;
	}

	public void setUserDateOfBirth(Date userDateOfBirth) {
		this.userDateOfBirth = userDateOfBirth;
	}

	public Long getUserEmployeeId() {
		return userEmployeeId;
	}

	public void setUserEmployeeId(Long userEmployeeId) {
		this.userEmployeeId = userEmployeeId;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	@Override
	public String toString() {
		return "UserDetailsDTO [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", userContact=" + userContact + ", userAge=" + userAge + ", userDateOfBirth=" + userDateOfBirth
				+ ", userEmployeeId=" + userEmployeeId + ", userLocation=" + userLocation + "]";
	}

}
