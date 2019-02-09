





package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import dao.MD5Encryption;

@Entity
@Table(name="Registration1")
public class User {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	

private int userId;	
private String UserName;
private String Password;
private String Email;
private int Age;
private String Name;
//private String Mobile_No;
private String Gender;
private String UserRole;
private String Address;
private int Pincode;
private String City;
private int Registration_No;
private int Telephone_No;

public User(int userId) {
	super();
	this.userId = userId;
}

public User() {
	super();
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}



public User(int userId, String userName, String password, String email, int age, String name, 
		String gender, String userRole, String address, int pincode, String city, int registration_No,
		int telephone_No,String checkvalid) {
	super();
	this.userId = userId;
	UserName = userName;
	Password = password;
	Email = email;
	Age = age;
	Name = name;
	//Mobile_No = mobile_No;
	Gender = gender;
	UserRole = userRole;
	Address = address;
	Pincode = pincode;
	City = city;
	Registration_No = registration_No;
	Telephone_No = telephone_No;
	
}

public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	String encryptedPassword=MD5Encryption.getMd5(password);
	Password = encryptedPassword;
}

public int getAge() {
	return Age;
}

public void setAge(int age) {
	Age = age;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}


public String getGender() {
	return Gender;
}

public void setGender(String gender) {
	Gender = gender;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public int getPincode() {
	return Pincode;
}

public void setPincode(int pincode) {
	Pincode = pincode;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public int getRegistration_No() {
	return Registration_No;
}

public void setRegistration_No(int registration_No) {
	Registration_No = registration_No;
}

public int getTelephone_No() {
	return Telephone_No;
}

public void setTelephone_No(int telephone_No) {
	Telephone_No = telephone_No;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getUserRole() {
	return UserRole;
}

public void setUserRole(String userRole) {
	UserRole = userRole;
}



}