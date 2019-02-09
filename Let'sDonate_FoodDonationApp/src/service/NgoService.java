package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Donor_Request;
import bean.ngoUser;
import dao.NgoDao;
@Service
public class NgoService {
	@Autowired
	private NgoDao ngoDao;
	
	
	
	public NgoService() {
		super();
	}

	public NgoDao getNgoDao() {
		return ngoDao;
	}

	public void setNgoDao(NgoDao ngoDao) {
		this.ngoDao = ngoDao;
	}

	public void createNgo(final ngoUser ngo) {
		ngoDao.createNgo(ngo);
	}
	
	public void updateNgo(final ngoUser ngobean,String username) {
		ngoDao.updateNgo(ngobean, username);
	}
	public List<Donor_Request> donorList(String username){
		return ngoDao.donorList(username);
	}
	public void updateRequest(int requestid,String username) {
		ngoDao.updateRequest(requestid, username);
	}
	
}
