package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import bean.Admin;
import bean.Registration;
import bean.User;

@Repository
public class RegistrationDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public RegistrationDao() {
		super();
	}
	public List<Registration> login(Registration registration)
	{
		
	 List<Registration>list=hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<Registration>>() {

		@Override
		public List<Registration> doInHibernate(Session session) throws HibernateException {
			Transaction t=session.beginTransaction();
			Query q=session.createQuery("from Registration where userName=? and password=? and isBlocked='Unblocked' ");
			q.setString(0, registration.getUserName());
			q.setString(1,MD5Encryption.getMd5(registration.getPassword() ));
			System.out.println(registration.getPassword());
			List<Registration>l=q.list();
			t.commit();
			session.flush();
			session.close();
			return l;
		}
	})	;
	 return list;
}
	
	public void register(final Registration registration) {
		
		hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<Registration>>() {

			@Override
			public List<Registration> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				
				session.save(registration);
				t.commit();
				session.flush();
				session.close();

				return null;
			}
		});
	}
	
	
}
