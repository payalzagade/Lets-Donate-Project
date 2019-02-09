package controller;

import javax.servlet.http.HttpSession;

import org.hibernate.Hibernate;
import org.hibernate.type.TrueFalseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.Donor_Request;

import dao.UserDao;
import service.DonorService;
import bean.User;
import bean.donorUser;

@Controller
public class DonorController {

	@Autowired
	private DonorService donorservice;	
	

	public DonorController() {
		super();
	}

	

	public DonorService getDonorservice() {
		return donorservice;
	}



	public void setDonorservice(DonorService donorservice) {
		this.donorservice = donorservice;
	}



	@RequestMapping(value = "/donorFoodRequest.htm")
	public String createf(Donor_Request donor,ModelMap model,HttpSession session) {
		if(donor.getDescription()==null || donor.getQuantity() == 0 || donor.getCookTime()==0)
		{
			model.put("donor", new Donor_Request());
			return "Donor";
		}
		donor.setStatusId(1);//pending status
		
		donor.setCategoryId(1);
		donorservice.getDonordao().createDonorRequest(donor,(String) session.getAttribute("username"));
		model.put("donor1", new Donor_Request());
		return "BookDonor";
	}
	
	@RequestMapping(value = "/donorFoodSkip.htm")
	public String SkipFood(ModelMap model) {
		model.put("donor1", new Donor_Request());
		return "BookDonor";
	}
	
	@RequestMapping(value = "/donorBookSkip.htm")
	public String SkipBook(ModelMap model) {
		model.put("donor2", new Donor_Request());
		return "ClothsDonor";
	}
	
	@RequestMapping(value = "/donorClothSkip.htm")
	public String SkipCloth(ModelMap model) {
		  //model.put("response1",new FeedbackforNGO());
		return "DonorHomePage";
	}

	@RequestMapping(value = "/donorBookRequest.htm")
	public String createb(Donor_Request donor,ModelMap model,HttpSession session) {
		if(donor.getDescription()==null || donor.getQuantity() == 0)
		{
			model.put("donor1", new Donor_Request());
			return "BookDonor";
		}
		donor.setStatusId(1);//pending status
		
		
		donor.setCategoryId(2);
		donorservice.getDonordao().createDonorRequest(donor,(String) session.getAttribute("username"));		model.put("donor2", new Donor_Request());
		return "ClothsDonor";
	}

	
	@RequestMapping(value = "/donorClothRequest.htm")
	public String createc(Donor_Request donor,ModelMap model,HttpSession session) {
		if(donor.getDescription()==null || donor.getQuantity() == 0)
		{
			model.put("donor2", new Donor_Request());
			return "ClothsDonor";
		}
		donor.setStatusId(1);//pending status
		
		donor.setCategoryId(3);
		donorservice.getDonordao().createDonorRequest(donor,(String) session.getAttribute("username"));
		 // model.put("response1",new FeedbackforNGO());
		return "DonorHomePage";
	}
	
	
	
	
}
