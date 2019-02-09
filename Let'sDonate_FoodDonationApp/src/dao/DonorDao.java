package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import bean.Donor_Request;
import bean.User;
import bean.donorUser;
import bean.ngoUser;

@Repository
public class DonorDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public DonorDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void createDonorRequest(final Donor_Request donor,String username) {
		donorUser donoruser=hibernateTemplate.load(donorUser.class,username);
		donor.setDonorId(donoruser);
	
		hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<Donor_Request>>() {

			@Override
			public List<Donor_Request> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.save(donor);
				t.commit();
				session.flush();
				session.close();
				
				return null;
			}
		});
	}
		public void DonorRequest(final Donor_Request donor) {
			
		
			hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<Donor_Request>>() {

				@Override
				public List<Donor_Request> doInHibernate(Session session) throws HibernateException {
					Transaction t = session.beginTransaction();
					session.save(donor);
					t.commit();
					session.flush();
					session.close();
					
					return null;
				}
			});
		
		
	}
public void createDonor(final donorUser donor) {
	
		hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<donorUser>>() {

			@Override
			public List<donorUser> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.save(donor);
				t.commit();
				session.flush();
				session.close();

				return null;
			}
		});
	}

}
