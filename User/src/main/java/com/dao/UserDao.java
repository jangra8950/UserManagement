package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.confi.HibConfi;
import com.model.User;

public class UserDao {
    
	// Save user
	public void saveUser(User user) {
		SessionFactory factory=HibConfi.getsession();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(user);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
    }

     //Update User
    
    public void updateUser(User user) {
    	SessionFactory factory=HibConfi.getsession();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.update(user);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
    }

     // Delete User using id
     
    public void deleteUser(int id) {

    	SessionFactory factory=HibConfi.getsession();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			// delete user
			User user=session.get(User.class, id);
			if(user!=null)
			{
				session.delete(user);
				System.out.println("User is deleted");
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
    }

  
     // Get A User By ID
    
    public User getUser(int id) {

        User user=null;
        SessionFactory factory=HibConfi.getsession();
		Session session=factory.openSession();
		user=session.get(User.class, id);
		return user;
    }

    
     // Get all Users
    
    @SuppressWarnings("unchecked")
	public List < User > getAllUser() {

    	SessionFactory factory=HibConfi.getsession();
		Session session=factory.openSession();
        List <User> listOfUser = null;
        try {
            // get an user object
           listOfUser = session.createQuery("from User").getResultList();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listOfUser;
    }
}
