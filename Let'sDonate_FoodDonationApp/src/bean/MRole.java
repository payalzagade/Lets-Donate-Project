package bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_role")
public class MRole {
@Id
private int roleId;
private String role;
public int getRoleId() {
	return roleId;
}
public void setRoleId(int roleId) {
	this.roleId = roleId;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public MRole() {
	super();
}
public MRole(int roleId, String role) {
	super();
	this.roleId = roleId;
	this.role = role;
}


}
