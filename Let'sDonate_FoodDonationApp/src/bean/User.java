package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;//for server side validation

@Entity
@Table(name="user")
public class User {
	

@GeneratedValue(strategy=GenerationType.AUTO)
private int userId;	
@Id
private String userName;
@Pattern(regexp="(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$",message="Password should be UpperCase, LowerCase, Number/SpecialChar and min 8 Chars")
private String password;
private String email;
private int age;
private String name;

private String gender;
private String userRole;
private String address;
private int pincode;
private String city;
private String locality;
private String registrationNo;
@Pattern(regexp="^\\d{10}$" ,message="please enter 10digit mobile number")
private String mobileNo;


public User(int userId) {
	super();
	this.userId = userId;
}


public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(int userId, String userName, String password, String email, int age, String name, String gender,
		String userRole, String address, int pincode, String city, String registrationNo, String mobileNo,String locality) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.password = password;
	this.email = email;
	this.age = age;
	this.name = name;
	this.gender = gender;
	this.userRole = userRole;
	this.address = address;
	this.pincode = pincode;
	this.city = city;
	this.registrationNo = registrationNo;
	this.mobileNo = mobileNo;
	this.locality=locality;
}


public int getUserId() {
	return userId;
}


public void setUserId(int userId) {
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


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public String getUserRole() {
	return userRole;
}


public void setUserRole(String userRole) {
	this.userRole = userRole;
}



public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public int getPincode() {
	return pincode;
}


public void setPincode(int pincode) {
	this.pincode = pincode;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getRegistrationNo() {
	return registrationNo;
}


public void setRegistrationNo(String registrationNo) {
	this.registrationNo = registrationNo;
}


public String getMobileNo() {
	return mobileNo;
}


public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}


public String getLocality() {
	return locality;
}


public void setLocality(String locality) {
	this.locality = locality;
}




}
