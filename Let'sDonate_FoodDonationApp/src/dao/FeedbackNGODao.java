package dao;
import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import bean.FeedbackBean;
import bean.FeedbackforNGO;

@Repository
public class FeedbackNGODao {


	@Autowired
	private HibernateTemplate hibernateTemplate;

	public FeedbackNGODao() {
		super();
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
		

	public void insertFeedBackngo( FeedbackforNGO feedbackbean1,int categoryId)
	{
		feedbackbean1.setCategoryId(categoryId);
	  hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<FeedbackBean>>() {
		@Override
		public List<FeedbackBean> doInHibernate(Session session) throws HibernateException {
			Transaction t = session.beginTransaction();
			session.save(feedbackbean1);
			t.commit();
			session.flush();
			session.close();
			return null;
		}
	  });	
	}

	

	 

	}


