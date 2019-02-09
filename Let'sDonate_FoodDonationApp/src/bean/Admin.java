package bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.SessionScope;

import dao.MD5Encryption;
@SessionScope
@Entity
@Table(name="admin")
public class Admin {


@Id
private String userName;
private String password;
private String name;
public Admin() {
	super();
}
public Admin(String userName, String password, String name) {
	super();
	this.userName = userName;
	this.password = password;
	this.name = name;
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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

	
}
