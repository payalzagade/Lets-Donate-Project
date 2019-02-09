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



@Controller
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
	
	
	
	
	public List<Admin> selectdonors()
	{
	List<Admin>list=hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<Admin>>() {

		@Override
		public List<Admin> doInHibernate(Session session) throws HibernateException {
			Transaction t=session.beginTransaction();
			Query q=session.createQuery("from Admin");
			List<Admin>l=q.list();
			t.commit();
			session.flush();
			session.close();
			return l;
		}
	})	;
	return list;
	}
	
}

