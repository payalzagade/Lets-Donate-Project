package bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_category")
public class MCategory {
@Id
private int categoryId;
private String category;
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public MCategory() {
	super();
}

}
