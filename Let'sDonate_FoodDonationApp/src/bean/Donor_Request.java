package bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Donor_Request")

public class Donor_Request {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int requestId=0;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "donorId", referencedColumnName = "userName")
	private donorUser donorId;
	
	private int categoryId;
	private int cookTime;
	private int quantity;
	private String description;
	private String location;
	private String collectedBy;
	private int statusId;
	private String timeOfreach;
	public Donor_Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCookTime() {
		return cookTime;
	}

	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}

	
	
	public int getRequestId() {
		return requestId;
	}



	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public String getCollectedBy() {
		return collectedBy;
	}

	public void setCollectedBy(String collectedBy) {
		this.collectedBy = collectedBy;
	}

	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	

	public String getTimeOfreach() {
		return timeOfreach;
	}

	public void setTimeOfreach(String timeOfreach) {
		this.timeOfreach = timeOfreach;
	}

	

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public Donor_Request(int requestId, int categoryId, int cookTime, int quantity, String description, String location,
			String collectedBy, int statusId, String timeOfreach,donorUser donorId) {
		super();
		this.requestId = requestId;
		this.categoryId = categoryId;
		this.cookTime = cookTime;
		this.quantity = quantity;
		this.description = description;
		this.location = location;
		this.collectedBy = collectedBy;
		this.statusId = 1;
		this.timeOfreach = timeOfreach;
		this.donorId=donorId;
	}

	public donorUser getDonorId() {
		return donorId;
	}

	public void setDonorId(donorUser donorId) {
		this.donorId = donorId;
	}

	

	
	
	

}
