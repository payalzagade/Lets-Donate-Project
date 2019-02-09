package controller;

import java.util.Locale.Category;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bean.FeedbackBean;
import bean.FeedbackforNGO;
import dao.FeedbackDao;
import dao.FeedbackNGODao;

@Controller
public class FeedbackController {

	@Autowired
	private FeedbackDao feedback;
	
	@Autowired
	private FeedbackNGODao feedbackNgo;
		//feedback for donor from ngo
	   @RequestMapping(value="/Feedback_Food.htm")
	   public String Feedbackresponse_Food(ModelMap model)
	   {
		  model.put("response",new FeedbackBean());
		   return "FeedbackForDonor_Food";
	   }
	   
	   
	   @RequestMapping(value="/Feedback_Book.htm")
	   public String Feedbackresponse_Book(ModelMap model)
	   {
		   model.put("response",new FeedbackBean());
		   return "FeedbackForDonor_Book";
	   }
	   @RequestMapping(value="/Feedback_Cloth.htm")
	   public String Feedbackresponse_Cloth(ModelMap model)
	   {
		   model.put("response",new FeedbackBean());
		   return "FeedbackForDonor_Cloth";
	   }
	   
	   
	   @RequestMapping(value="/Feedback_response_Food.htm")
	   public String FeedbackSubmit_Food(ModelMap model,HttpSession session,@Valid @ModelAttribute("response")FeedbackBean feedbackbean,BindingResult result)
	   {
		  	 
		 
		 if(result.hasErrors())
		 {
			 return "FeedbackForDonor_Food";
		 }
		  feedback.insertFeedBack(feedbackbean,1);
		   model.put("response",new FeedbackBean());

		   return "FeedbackForDonor_Book";
		   
	   }
	   
	   @RequestMapping(value="/Feedback_response_Book.htm")
	   public String FeedbackSubmit_Book(ModelMap model,@Valid @ModelAttribute("response")FeedbackBean feedbackbean,HttpSession session,BindingResult result)
	   {
		  		  
		 if(result.hasErrors())
		 {
			 return "FeedbackForDonor_Book";
		 }
		
		   feedback.insertFeedBack(feedbackbean,2);
		   model.put("response",new FeedbackBean());
					   return "FeedbackForDonor_Cloth";
		   
	   }
	   
	   @RequestMapping(value="/Feedback_response_Cloth.htm")
	   public String FeedbackSubmit_Cloth(ModelMap model,HttpSession session,@Valid @ModelAttribute("response")FeedbackBean feedbackbean,BindingResult result)
	   {
		  		  
		   if(result.hasErrors())
			 {
				 return "FeedbackForDonor_Book";
			 }
		   feedback.insertFeedBack(feedbackbean,3);
		   return "NgoHomePage";
		   
	   }
	  
	  //for ngo from donor
	   
	   @RequestMapping(value="/Feedback_Ngo.htm")
	   public String Feedbackresponse_NGO(ModelMap model)
	   {
		   model.put("response1",new FeedbackforNGO());
		   return "FeedbackForNGO_Food";
	   }
	   
	   
	   @RequestMapping(value="/FeedbackNGOFood.htm")
	    public String FeedbackresponseNgo_cloth(HttpSession session,ModelMap model,@Valid @ModelAttribute("response1")FeedbackforNGO feedbackforngo,BindingResult result)
	    {
		  		  
	    	 if(result.hasErrors())
				 {
					 return "FeedbackForNGO_Food";
				 }
	    	
		   feedbackNgo.insertFeedBackngo(feedbackforngo,1);
		   model.put("response1",new FeedbackforNGO());
		   return "FeedbackForNGO_Book";
		   
	    }

		@RequestMapping(value="/FeedbackNGOBook.htm")
	           public String FeedbackresponseNgo_Book(HttpSession session,ModelMap model,@Valid @ModelAttribute("response1")FeedbackforNGO feedbackforngo,BindingResult result)
			 {
		    	  if(result.hasErrors())
					 {
						 return "FeedbackForNGO_Book";
					 }
		    	  
		    	  feedbackNgo.insertFeedBackngo(feedbackforngo,2);

				   model.put("response1",new FeedbackforNGO());
				   return "FeedbackForNGO_Cloth";
			  }
		  
		  
		     @RequestMapping(value="/FeedbackNGOCloth.htm")
			 public String FeedbackresponseNgo_book(HttpSession session,ModelMap model,@Valid @ModelAttribute("response1")FeedbackforNGO feedbackforngo,BindingResult result)
			 {
		    	 
		    	  if(result.hasErrors())
					 {
						 return "FeedbackForNGO_Cloth";
					 }
		    	  
			   feedbackNgo.insertFeedBackngo(feedbackforngo,3);

				   model.put("response1",new FeedbackforNGO());
				   return "DonorHomePage";
			  }
		 
		     
		  
		   @RequestMapping(value="/skipBook.htm")
		   public String skipFood(ModelMap model)		   {
			   model.put("response1",new FeedbackforNGO());
			   return "FeedbackForNGO_Cloth";
		   }
		   
		  @RequestMapping(value="/skipCloth.htm")
		   public String skipBooK(ModelMap model)
		   {
			   model.put("response1",new FeedbackforNGO());
			   return "DonorHomePage";
		   }
		  
		  @RequestMapping(value="/skip"
		  		+ "Food.htm")
		   public String skipCloth(ModelMap model)
		   {
			  model.put("response1",new FeedbackforNGO());
			  return "FeedbackForNGO_Book";
		   }
}


