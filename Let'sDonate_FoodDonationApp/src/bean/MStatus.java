package bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_status")
public class MStatus {
@Id
private int statusId;
private String status;
public int getStatusId() {
	return statusId;
}
public void setStatusId(int statusId) {
	this.statusId = statusId;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public MStatus() {
	super();
}
public MStatus(int statusId, String status) {
	super();
	this.statusId = statusId;
	this.status = status;
}

}
