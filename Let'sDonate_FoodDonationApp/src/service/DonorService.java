package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Donor_Request;
import bean.donorUser;
import dao.DonorDao;

@Service
public class DonorService {
@Autowired
private DonorDao donordao;

public DonorDao getDonordao() {
	return donordao;
}

public void setDonordao(DonorDao donordao) {
	this.donordao = donordao;
}

public DonorService() {
	super();
}
public void createDonorRequest(final Donor_Request donor,String username) {
	donordao.createDonorRequest(donor, username);
}
public void createDonor(final donorUser donor) {
	donordao.createDonor(donor);
}
public void DonorRequest(final Donor_Request donor) {
	donordao.DonorRequest(donor);
}
}
