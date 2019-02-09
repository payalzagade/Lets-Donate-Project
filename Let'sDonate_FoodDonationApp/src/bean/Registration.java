package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Registration")
public class Registration {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;	
	private String UserName;
	private String Password;
	private int RoleId;
	private String isBlocked;
	
	
	public Registration() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	
	public Registration(int userId, String userName, String password, int roleId) {
		super();
		this.userId = userId;
		UserName = userName;
		Password = password;
		setRoleId(roleId);
	}

	public String getIsBlocked() {
		return isBlocked;
	}

	public void setIsBlocked(String isBlocked) {
		this.isBlocked = isBlocked;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
		Password = password;
	}

	public int getRoleId() {
		return RoleId;
	}

	public void setRoleId(int roleId) {
		RoleId = roleId;
	}
	


}
