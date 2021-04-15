package siva.bootjparepo.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails_table")
public class UserDetails implements Serializable {

	private static final long serialVersionUID = -8284443850494067982L;

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_email")
	private String userEmail;
	@Column(name = "user_contact")
	private String userContact;
	@Column(name = "user_age")
	private String userAge;
	@Column(name = "user_dob")
	private Date userDateOfBirth;
	@Column(name = "user_employeeid")
	private Long userEmployeeId;
	@Column(name = "user_location")
	private String userLocation;

	
	public UserDetails() {
		super();
	}

	public UserDetails(Integer userId, String userName, String userEmail, String userContact, String userAge,
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
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", userContact=" + userContact + ", userAge=" + userAge + ", userDateOfBirth=" + userDateOfBirth
				+ ", userEmployeeId=" + userEmployeeId + ", userLocation=" + userLocation + "]";
	}

	public UserDetails orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
