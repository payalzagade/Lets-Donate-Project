package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bean.Donor_Request;
import bean.ngoUser;
import dao.NgoDao;
import service.NgoService;

@Controller
public class NgoController {
@Autowired
private NgoService ngoservice;

@RequestMapping("/Tcheckbox2.htm")
public String updatingObject(ngoUser ngo, ModelMap model,HttpSession session) {
	
	ngoservice.getNgoDao().updateNgo(ngo,(String)session.getAttribute("username"));
	return "ToNgoShowDonorList";
}
	
@RequestMapping("/selectCategory.htm")
public String selectCategory(ModelMap model)
{
	model.put("ngo", new ngoUser());
	return "TCheclist";
}

@RequestMapping("/toNgoDonorList.htm")
public String toNgoDonorList(ModelMap model,HttpSession session) {
	List<Donor_Request>list= ngoservice.getNgoDao().donorList((String)session.getAttribute("username"));
	model.put("list",list);
	return "ToNgoShowDonorList";
}

@RequestMapping("/accept.htm")
public String acceptRequest(ModelMap model,@RequestParam("requestid")int requestid,@RequestParam("categoryid") int id,HttpSession session) {
	String Username=(String) session.getAttribute("username");
	ngoservice.getNgoDao().updateRequest(requestid, Username);
	return "NgoHomePage";
}
}
