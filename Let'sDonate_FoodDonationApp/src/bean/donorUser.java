package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="donor_registration")

public class donorUser {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;	
	@Id
	private String userName;
	private String password;
	private String email;
	private int age;
	private String name;
	private String mobileNo;
	private String gender;
	private String address;
	private int pincode;
	private String city;
	private String locality;
	private int negativeFeedbackflag;
	private String isBlock;
	
	public donorUser() {
		super();
		this.negativeFeedbackflag = 0;
		this.isBlock ="Unblocked" ;
		// TODO Auto-generated constructor stub
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



	public String getMobileNo() {
		return mobileNo;
	}



	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getLocality() {
		return locality;
	}



	public void setLocality(String locality) {
		this.locality = locality;
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






	public int getNegativeFeedbackflag() {
		return negativeFeedbackflag;
	}



	public void setNegativeFeedbackflag(int negativeFeedbackflag) {
		this.negativeFeedbackflag = negativeFeedbackflag;
	}



	public String getIsBlock() {
		return isBlock;
	}



	public void setIsBlock(String isBlock) {
		this.isBlock = isBlock;
	}



	


	public donorUser(int userId, String userName, String password, String email, int age, String name, String mobileNo,
			String gender, String locality, String address, int pincode, String city, int negativeFeedbackflag,
			int isBlock) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.age = age;
		this.name = name;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.locality = locality;
		this.address = address;
		this.pincode = pincode;
		this.city = city;
		this.negativeFeedbackflag = 0;
		this.isBlock ="Unblocked" ;
	}
	

	
	
	

}
