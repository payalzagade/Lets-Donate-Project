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

@Repository
public class FeedbackDao {


	@Autowired
	private HibernateTemplate hibernateTemplate;

	public FeedbackDao() {
		super();
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
		

	public void insertFeedBack( FeedbackBean feedbackbean,int categoryId)
	{
		feedbackbean.setCategoryId(categoryId);
		
	  hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<FeedbackBean>>() {
		@Override
		public List<FeedbackBean> doInHibernate(Session session) throws HibernateException {
			Transaction t = session.beginTransaction();
			session.save(feedbackbean);
			t.commit();
			session.flush();
			session.close();
			return null;
		}
	  });	
	}

	public FeedbackBean FeedbackResponse (int NGOId) {
		

		 FeedbackBean feedbackbean=hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<FeedbackBean>() {
			@Override
			public FeedbackBean doInHibernate(Session session) throws HibernateException {		
				Transaction t=session.beginTransaction();
				FeedbackBean feedbackbean1=(FeedbackBean)session.get(FeedbackBean.class,NGOId);
				t.commit();
				session.flush();
				session.close();
				return feedbackbean1;
			}
		});
		 
		 return feedbackbean;
		}

	 

	}


