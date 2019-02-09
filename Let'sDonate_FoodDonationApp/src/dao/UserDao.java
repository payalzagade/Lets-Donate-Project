package dao;

import java.sql.SQLException;
import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.Registration;
import bean.User;
import bean.donorUser;
import bean.ngoUser;

@Repository
public class UserDao {
@Autowired
private HibernateTemplate hibernateTemplate;

public UserDao() {
	super();
}

public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}
/*
public void createDonorUser(final donorUser user) {
	
	hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<User>>() {

		@Override
		public List<User> doInHibernate(Session session) throws HibernateException {
			Transaction t = session.beginTransaction();
			session.save(user);
			
			t.commit();
			session.flush();
			session.close();

			return null;
		}
	});
}

public void createNgoUser(final ngoUser user,Registration registration) {
	
	hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<User>>() {

		@Override
		public List<User> doInHibernate(Session session) throws HibernateException {
			Transaction t = session.beginTransaction();
			session.save(user);
			session.save(registration);
			t.commit();
			session.flush();
			session.close();

			return null;
		}
	});
}
*/

public void deleteuser(User user)
{
	hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<User>>() {

		@Override
		public List<User> doInHibernate(Session session) throws HibernateException {
			Transaction t = session.beginTransaction();
			session.delete(user);
			t.commit();
			session.flush();
			session.close();

		
			return null;
		}
	});
}

public void updateuser(User user)
{
	hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<User>>() {

		@Override
		public List<User> doInHibernate(Session session) throws HibernateException {
			Transaction t = session.beginTransaction();
			session.update(user);
			t.commit();
			session.flush();
			session.close();

		
			return null;
		}
	});
}


public List<User> login(User user)
{
 List<User>list=hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<User>>() {

	@Override
	public List<User> doInHibernate(Session session) throws HibernateException {
		Transaction t=session.beginTransaction();
		Query q=session.createQuery("from User where UserName=? and Password=? ");
		q.setString(0, user.getUserName());
		q.setString(1, user.getPassword());
		
		List<User>l=q.list();
		t.commit();
		session.flush();
		session.close();
		return l;
	}
})	;
 
 return list;
}


public List<User> selectusers()
{
List<User>list=hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<User>>() {

	@Override
	public List<User> doInHibernate(Session session) throws HibernateException {
		Transaction t=session.beginTransaction();
		Query q=session.createQuery("from User");
		List<User>l=q.list();
		t.commit();
		session.flush();
		session.close();
		return l;
	}
})	;
return list;
}


public User selectuser(int userId)
{
 User user=hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<User>() {

	@Override
	public User doInHibernate(Session session) throws HibernateException {
	
		Transaction t=session.beginTransaction();
		User u=(User)session.get(User.class, userId);
		t.commit();
		session.flush();
		session.close();
		return u;
	}
})	;
 
 return user;
}




}