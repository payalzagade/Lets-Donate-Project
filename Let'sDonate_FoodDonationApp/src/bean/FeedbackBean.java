package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="Response_Form_Donor")
public class FeedbackBean 
{
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private int ResponseId;
 private int RequestId;
 private int CategoryId;
 private int NGOId;
 private int DonorId;
 private String Response1;
 private String Response2;
 private String Response3;
 private int Overrallrating;
 
 @Size(min=2,max=200,message="Comment should be between 2 to 200")
 private String Comment;

 private boolean MarkedReponse;
 
 
 public FeedbackBean() {
		super();
	}

 	 
	
	
public int getRequestId() {
	return RequestId;
}




public void setRequestId(int requestId) {
	RequestId = requestId;
}




public int getCategoryId() {
	return CategoryId;
}




public void setCategoryId(int categoryId) {
	CategoryId = categoryId;
}




public FeedbackBean(int responseId, int requestId, int categoryId, int nGOId, int donorId, String response1,
		String response2, String response3, int overrallrating, String comment, boolean markedReponse) {
	super();
	ResponseId = responseId;
	RequestId = requestId;
	CategoryId = categoryId;
	NGOId = nGOId;
	DonorId = donorId;
	Response1 = response1;
	Response2 = response2;
	Response3 = response3;
	Overrallrating = overrallrating;
	Comment = comment;
	MarkedReponse = markedReponse;
}




public int getResponseId() {
	return ResponseId;
}

public void setResponseId(int responseId) {
	ResponseId = responseId;
}

public int getNGOId() {
	return NGOId;
}

public void setNGOId(int nGOId) {
	NGOId = nGOId;
}

public int getDonorId() {
	return DonorId;
}

public void setDonorId(int donorId) {
	DonorId = donorId;
}

public String getResponse1() {
	return Response1;
}

public void setResponse1(String response1) {
	Response1 = response1;
}

public String getResponse2() {
	return Response2;
}

public void setResponse2(String response2) {
	Response2 = response2;
}

public String getResponse3() {
	return Response3;
}

public void setResponse3(String response3) {
	Response3 = response3;
}

public int getOverrallrating() {
	return Overrallrating;
}

public void setOverrallrating(int overrallrating) {
	Overrallrating = overrallrating;
}

public String getComment() {
	return Comment;
}

public void setComment(String comment) {
	Comment = comment;
}

public boolean isMarkedReponse() {
	return MarkedReponse;
}

public void setMarkedReponse(boolean markedReponse) {
	MarkedReponse = markedReponse;
}


 
}
