package services;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import dao.AdminDao;

@Entity
public class AdminService {

	private AdminDao adminDao;

	public AdminService() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	
	

}
