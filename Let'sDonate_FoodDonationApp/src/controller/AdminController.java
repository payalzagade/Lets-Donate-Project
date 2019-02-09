package controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.hibernate.metamodel.relational.CheckConstraint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import bean.Admin;
import bean.Donor_Request;
import bean.User;
import bean.donorUser;
import bean.ngoUser;
import dao.AdminDao;
import dao.UserDao;
//import services.AdminService;
@Controller

public class AdminController {
	
	//private AdminService adminservice;
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private UserDao userDao;
	
	/*public AdminService getAdminservice() {
		return adminservice;
		
	}

	public void setAdminservice(AdminService adminservice) {
		this.adminservice = adminservice;
	}*/
	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@RequestMapping(value="/adminReg.htm")
	public String adminReg(ModelMap model) {
		model.put("admin",new Admin());
		return "AdminRegistration";
	}
	
	@RequestMapping(value="/adminRegistration.htm")
	public String adminRegistration(ModelMap model,Admin admin) {
		adminDao.createUser(admin);
		return "AdminLoginMasterPage";
	}
	/*
	@RequestMapping(value="/Adminlogin.htm",method=RequestMethod.POST)
	public String adminLogin(ModelMap model,@ModelAttribute (value="admin")Admin admin,HttpSession session,HttpServletRequest request,HttpServletResponse response) {
		AdminDao adminDao=new AdminDao();
		if(adminDao.login(admin.getUserName(), admin.getPassword())) {
			session.setAttribute("userName",admin.getUserName());
			if(request.getParameter("remember")!=null) {
				Cookie ckUsername=new Cookie("userName", admin.getUserName());
				ckUsername.setMaxAge(3600);
				response.addCookie(ckUsername);
				Cookie ckPassword=new Cookie("password", admin.getPassword());
				ckUsername.setMaxAge(3600);
				response.addCookie(ckPassword);
				return "AdminLoginMasterPage";
			
		}
		else {
			model.put("error","Account is invalid");
			return "login1";
		}
		
	}
		return "login1";
	}*/
	//LOGIN CONTROLLER
	@RequestMapping(value="/adminlogin.htm")
	public String adminLogin(ModelMap model)
	{
		model.put("admin", new Admin());
		return "AdminLogin1";
	}
	@RequestMapping(value="/AdminloginObject.htm",method=RequestMethod.POST)
	public String AdminloginObject(ModelMap model,HttpSession session,Admin admin)
	{
			List<Admin>list= adminDao.login(admin);
			if(!list.isEmpty())
			{
				System.out.println(admin.getUserName());
				session.setAttribute("username", admin.getUserName());
				return "AdminMasterPage";	
			}
			else {
				
				return "AdminLoginMasterPage" ;
			}
	}
	
	@RequestMapping(value="/ngolist.htm")
	public String ngolist(ModelMap model) {
		List<ngoUser> list=adminDao.selectngo();
		model.put("list",list);
		
		return "AdminNGOList";
	}
	
	@RequestMapping(value="/donorlist.htm")
	public String donorlist(ModelMap model) {
		
		List<donorUser> list=adminDao.selectdonors();
		model.put("list",list);
		
		return "AdminDonorList";
	}
	
/*
	@RequestMapping(value="/readxml.htm",method=RequestMethod.POST)
	public ModelAndView upload(@RequestParam CommonsMultipartFile file,HttpSession session) {
		String path=session.getServletContext().getRealPath("/");
		String filename=file.getOriginalFilename();
		System.out.println(path+" "+filename);
		try {
			byte barr[]=file.getBytes();
			
			BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream(path+" "+filename));
			Object o=bout;
			bout.write(barr);
			bout.flush();
			bout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return new ModelAndView("Success");
	} 

	public Admin checkCookie(HttpServletRequest request) {
		Cookie[] cookies=request.getCookies();
		Admin admin=null;
		String userName="",password="",name="";
		for(Cookie ck: cookies) {
			if(ck.getName().equalsIgnoreCase("userName")) 
				userName=ck.getValue();
			if(ck.getName().equalsIgnoreCase("password")) 
				password=ck.getValue();
			if(ck.getName().equalsIgnoreCase("name")) 
				name=ck.getValue();
		}
		if(!userName.isEmpty() && !password.isEmpty() && !name.isEmpty())
			admin=new Admin(userName,password,name);
		return admin;
	}
  */
	@RequestMapping("/Logout.htm")
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		session.invalidate();
		return "AdminLoginMasterPage";
	}

		@RequestMapping("/validate.htm")
		public String validate(ModelMap model,@RequestParam("username")String username) {
			adminDao.validateNgo(username);
			//adminDao.ReginValidateNgo(username);
			List<ngoUser> list=adminDao.selectngo();
			model.put("list",list);
			return "AdminNGOList";
		}
		
		
		@RequestMapping("/invalid.htm")
		public String invalid(ModelMap model,@RequestParam("username")String username) {	
			adminDao.inValidateNgo(username);
			List<ngoUser> list=adminDao.selectngo();
			model.put("list",list);
			return "AdminNGOList";
		}
		@RequestMapping("/request.htm")
		public String request(ModelMap model) {
			List<Donor_Request>list= adminDao.request();
			model.put("list", list);
			return "AdminShowRequest";
		}
}
