package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Controller;

import bean.Admin;
import bean.Donor_Request;
import bean.donorUser;
import bean.ngoUser;

@Controller
public class NgoDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	public void createNgo(final ngoUser ngo) {
		
			hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<donorUser>>() {

				@Override
				public List<donorUser> doInHibernate(Session session) throws HibernateException {
					Transaction t = session.beginTransaction();
					session.save(ngo);
					t.commit();
					session.flush();
					session.close();

					return null;
				}
			});
		}
	
	public void updateNgo(final ngoUser ngobean,String username) {
		hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<ngoUser>>(){

			public List<ngoUser> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				//Query q = session.createQuery("update NgoBean set categoryofInterest=? where username=?");
				//q.setString(0,ngobean.getCategoryofInterest());
				//q.setString(1, "shivani");
				//int result = q.executeUpdate();
				ngoUser ngouser=(ngoUser) session.load(ngoUser.class, username);
				
				ngouser.setCategoryOfInterest(ngobean.getCategoryOfInterest());
				session.update(ngouser);
				t.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}
	
	public List<Donor_Request> donorList(String username) {
		List<Donor_Request>list=hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<Donor_Request>>() {

			@Override
			public List<Donor_Request> doInHibernate(Session session) throws HibernateException {
				Transaction t=session.beginTransaction();
				ngoUser ngouser=(ngoUser) session.load(ngoUser.class, username);
				Query q=session.createQuery("from Donor_Request where location=? and statusId=1");
				q.setString(0, ngouser.getLocality());
				List<Donor_Request>l=q.list();
				t.commit();
				session.flush();
				session.close();
				return l;
			}
		})	;
		return list;
		}
		
	public void updateRequest(int requestid,String username) {
		hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<Donor_Request>>(){

			public List<Donor_Request> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				//Query q = session.createQuery("update NgoBean set categoryofInterest=? where username=?");
				//q.setString(0,ngobean.getCategoryofInterest());
				//q.setString(1, "shivani");
				//int result = q.executeUpdate();
				Donor_Request donorRequest=(Donor_Request) session.load(Donor_Request.class,requestid);
				donorRequest.setStatusId(2);
				donorRequest.setCollectedBy(username);
				session.update(donorRequest);
				t.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}
		
		
		
		
	}
	
	
	
	


