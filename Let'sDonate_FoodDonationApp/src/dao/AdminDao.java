package dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import bean.Admin;
import bean.Donor_Request;
import bean.Registration;
import bean.donorUser;
import bean.ngoUser;



@Repository
public class AdminDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void createUser(final Admin admin) {
		String originalPassword=admin.getPassword();
		admin.setPassword(MD5Encryption.getMd5(originalPassword));
		hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<Admin>>() {

			@Override
			public List<Admin> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				
				session.save(admin);
				t.commit();
				session.flush();
				session.close();

				return null;
			}
		});
	}
	
	public List<Admin> login(Admin admin)
	{
	 List<Admin>list=hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<Admin>>() {

		@Override
		public List<Admin> doInHibernate(Session session) throws HibernateException {
			Transaction t=session.beginTransaction();
			Query q=session.createQuery("from Admin where userName=? and password=? ");
			q.setString(0, admin.getUserName());
			q.setString(1,MD5Encryption.getMd5(admin.getPassword()) );
			System.out.println(MD5Encryption.getMd5(admin.getPassword()));
			List<Admin>l=q.list();
			t.commit();
			session.flush();
			session.close();
			return l;
		}
	});
	 return list;
	}
	
	
	
	
	public List<ngoUser> selectngo()
	{
	List<ngoUser>list=hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<ngoUser>>() {

		@Override
		public List<ngoUser> doInHibernate(Session session) throws HibernateException {
			Transaction t=session.beginTransaction();
			Query q=session.createQuery("from ngoUser where isValidated='no'");
			List<ngoUser>l=q.list();
			t.commit();
			session.flush();
			session.close();
			return l;
		}
	})	;
	return list;
	}
	
	public void validateNgo(final String username) {
		
		
		hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<ngoUser>>() {
						@Override
			public List<ngoUser> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				ngoUser ngouser=(ngoUser)session.load(ngoUser.class, username);
				ngouser.setIsBlocked("Unblocked");
				ngouser.setIsValidated("yes");
				session.update(ngouser);
				t.commit();
				session.flush();
				session.close();

				return null;
			}
		});
	}
public void inValidateNgo(final String username) {
		
		
		hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<ngoUser>>() {
						@Override
			public List<ngoUser> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				ngoUser ngouser=(ngoUser)session.load(ngoUser.class, username);
				ngouser.setIsValidated("yes");
				session.update(ngouser);
				t.commit();
				session.flush();
				session.close();

				return null;
			}
		});
	}
public void ReginValidateNgo(final String username) {
	
	
	hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<Registration>>() {
					@Override
		public List<Registration> doInHibernate(Session session) throws HibernateException {
			Transaction t = session.beginTransaction();
			Registration ngouser=(Registration)session.load(ngoUser.class, username);
			ngouser.setIsBlocked("Unblocked");
			session.update(ngouser);
			t.commit();
			session.flush();
			session.close();

			return null;
		}
	});
}
	public List<donorUser> selectdonors()
	{
	List<donorUser>list=hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<donorUser>>() {

		@Override
		public List<donorUser> doInHibernate(Session session) throws HibernateException {
			Transaction t=session.beginTransaction();
			Query q=session.createQuery("from donorUser");
			List<donorUser>l=q.list();
			t.commit();
			session.flush();
			session.close();
			return l;
		}
	})	;
	return list;
}
	
	public List<Donor_Request> request() {
		List<Donor_Request>list=hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<Donor_Request>>() {

			@Override
			public List<Donor_Request> doInHibernate(Session session) throws HibernateException {
				Transaction t=session.beginTransaction();
				
				Query q=session.createQuery("from Donor_Request ");
				
				List<Donor_Request>l=q.list();
				t.commit();
				session.flush();
				session.close();
				return l;
			}
		})	;
		return list;
		}
}
