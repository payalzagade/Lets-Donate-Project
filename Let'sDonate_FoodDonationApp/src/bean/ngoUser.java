package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ngo_registration")

public class ngoUser {
		

	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;	
	@Id
	private String userName;
	private String password;
	private String email;
	private String name;
	//private String Mobile_No;
	private String address;
	private int pincode;
	private String city;
	private String locality;
	private String registration_No;
	private String mobileNo;
	private String isBlocked;
	private int negativeFeedbackFlag;
	private int pdfDocument;
	private String isValidated;
	private String categoryOfInterest;

	public ngoUser(int userId) {
		super();
		this.userId = userId;
	}

	public ngoUser() {
		super();
		this.isBlocked = "Unblocked";
		this.negativeFeedbackFlag = 0;
		//this.pdfDocument = pdfDocument;
		this.isValidated ="no" ;
	}

	

	public ngoUser(int userId, String userName, String password, String email, String name, String address, int pincode,
			String city, String locality, String registration_No, String mobileNo
			) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.city = city;
		this.locality = locality;
		this.registration_No = registration_No;
		this.mobileNo = mobileNo;
		this.isBlocked = "Unblocked";
		this.negativeFeedbackFlag = 0;
		//this.pdfDocument = pdfDocument;
		this.isValidated ="no" ;
		//this.categoryOfInterest=categoryOfInterest;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getregistration_No() {
		return registration_No;
	}

	public void setregistration_No(String registration_No) {
		this.registration_No = registration_No;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileno) {
		this.mobileNo = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getRegistration_No() {
		return registration_No;
	}

	public void setRegistration_No(String registration_No) {
		this.registration_No = registration_No;
	}

	public String getIsBlocked() {
		return isBlocked;
	}

	public void setIsBlocked(String isBlocked) {
		this.isBlocked = isBlocked;
	}

	public int getNegativeFeedbackFlag() {
		return negativeFeedbackFlag;
	}

	public void setNegativeFeedbackFlag(int negativeFeedbackFlag) {
		this.negativeFeedbackFlag = negativeFeedbackFlag;
	}

	public int getPdfDocument() {
		return pdfDocument;
	}

	public void setPdfDocument(int pdfDocument) {
		this.pdfDocument = pdfDocument;
	}

	public String getIsValidated() {
		return isValidated;
	}

	public void setIsValidated(String isValidated) {
		this.isValidated = isValidated;
	}

	public String getCategoryOfInterest() {
		return categoryOfInterest;
	}

	public void setCategoryOfInterest(String categoryOfInterest) {
		this.categoryOfInterest = categoryOfInterest;
	}

	

	

	
}
