package controller;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.Donor_Request;
import dao.DonorDao;
import dao.MD5Encryption;
import dao.NgoDao;
import dao.RegistrationDao;
import dao.UserDao;
import bean.Registration;
import bean.User;
import bean.donorUser;
import bean.ngoUser;

@Controller
public class UserController {
@Autowired
	private UserDao userDao;
	@Autowired
	private RegistrationDao registrationDao;
	@Autowired
	private DonorDao donordao;
	@Autowired
	private NgoDao ngoDao;
	
	
	/*
	 *login and registration controllers are here
	 */
	
	@RequestMapping(value="/reg_form.htm")
	public String reg(ModelMap model) {
		model.put("user", new User());
		//model.put("ngoUser", new ngoUser());
		return "reg_form";
	}
	
	@RequestMapping(value="/reg3.htm")
	public String reg1(ModelMap model) {
		model.put("user", new User());
		//model.put("ngoUser", new ngoUser());
		return "reg";
	}
	
	@RequestMapping(value="/reg.htm")
	public String create(@Valid @ModelAttribute("user") User user,BindingResult result) {
		if(result.hasErrors())
		{
			return "reg";
		}
		Registration registration =new Registration();
		//registrationDao.usernamevalidation(user) ;
		ngoUser ngoUser= new ngoUser();
		donorUser donorUser = new donorUser();
		
		String password=MD5Encryption.getMd5(user.getPassword());
		if(user.getUserRole().equals("Donor"))
		{
			
			
			donorUser.setUserName(user.getUserName());
			donorUser.setPassword(password);
			donorUser.setEmail(user.getEmail());
			donorUser.setAddress(user.getAddress());
			donorUser.setCity(user.getCity());
			donorUser.setPincode(user.getPincode());
			donorUser.setMobileNo(user.getMobileNo());
			donorUser.setAge(user.getAge());
			donorUser.setGender(user.getGender());
			donorUser.setLocality(user.getLocality());
			donorUser.setName(user.getName());
		
			registration.setUserName(user.getUserName());
			registration.setPassword(password);
			registration.setRoleId(2);
			registration.setIsBlocked("Unblocked");
			registrationDao.register(registration);
			donordao.createDonor(donorUser);
			return "index1";
		}
		else if (user.getUserRole().equals("NGO"))
		{
		ngoUser.setuserName(user.getUserName());
		ngoUser.setPassword(password);
		ngoUser.setEmail(user.getEmail());
		ngoUser.setAddress(user.getAddress());
		ngoUser.setCity(user.getCity());
		ngoUser.setPincode(user.getPincode());
		ngoUser.setregistration_No(user.getRegistrationNo());
		ngoUser.setMobileNo(user.getMobileNo());
		ngoUser.setLocality(user.getLocality());
		ngoUser.setName(user.getName());
		ngoUser.setIsBlocked("Blocked");
		registration.setUserName(user.getUserName());
		registration.setPassword(password);
		registration.setRoleId(3);
		registration.setIsBlocked("Unblocked");
		registrationDao.register(registration);
		ngoDao.createNgo(ngoUser);
		return "index1";
		}
		else
		return "index";
	}
	@RequestMapping(value="/login.htm")
		public String login(ModelMap model)
		{
			model.put("user",new Registration());
			return "login";
		}
		
	
	@RequestMapping(value="/login1.htm" )
	public String login(Registration registration,ModelMap model,HttpSession session)
	{
		List<Registration>list=registrationDao.login(registration);
	
		
		if(!list.isEmpty()&&list.get(0).getRoleId()==2)
		{
					
					session.setAttribute("username", list.get(0).getUserName());
					return "DonorHomePage";
		}
		else if(!list.isEmpty()&&list.get(0).getRoleId()==3) {
			session.setAttribute("username", list.get(0).getUserName());	
			return "NgoHomePage";
		}
		else {
			model.put("user",new Registration());
			return "login";
		}
		
		
	}
	@RequestMapping(value="/donate.htm")
	public String donate(ModelMap model) {
		model.put("donor", new Donor_Request());
		return "Donor";
	}
	
	@RequestMapping(value="/user_list.htm")
	public String userlist(User user,ModelMap model)
	{
		List<User>list=userDao.selectusers();
		model.put("ulist", list);
		return "user_list";
	}
	
	@RequestMapping(value="/delete_user.htm")
	public String delete(HttpServletRequest request,ModelMap model) {
		
		String u=request.getParameter("userId");
		int id=Integer.parseInt(u);
		
		User ud= new User(id);
		userDao.deleteuser(ud);
		List<User>list=userDao.selectusers();
		model.put("ulist", list);
		return "user_list";
	}
	
	
	@RequestMapping(value="/select_user.htm")
	public String select(HttpServletRequest request,ModelMap model)
	{
		String u=request.getParameter("userId");
		int id= Integer.parseInt(u);
	
	User u2=	userDao.selectuser(id);
	
		model.put("user",u2 );
	return 	"update_form";
	}
	
	@RequestMapping(value="update_user.htm")
	public String update(User user,ModelMap model)
	{
		userDao.updateuser(user);
		List<User>list=userDao.selectusers();
		model.put("ulist", list);
		return "user_list";
		
	}
	
	@RequestMapping(value="/logout.htm")
	public String logout(ModelMap model,HttpSession session) {
		session.removeAttribute("username");
		session.invalidate();
		return "index";
	}
}
