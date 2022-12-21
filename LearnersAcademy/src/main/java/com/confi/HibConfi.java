package com.confi;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.model.Eclass;
import com.model.Student;
import com.model.Subject;
import com.model.Teacher;
import com.model.User;

public class HibConfi 
{
	 private static SessionFactory sessionFactory;

	 public static SessionFactory getsession() {
	  if (sessionFactory == null) {
	   try {
	    Configuration configuration = new Configuration();

	    Properties settings = new Properties();
	    settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
	    settings.put(Environment.URL, "jdbc:mysql://localhost:3306/demo");
	    settings.put(Environment.USER, "root");
	    settings.put(Environment.PASS, "Xolo7860@");
	    settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

	    settings.put(Environment.SHOW_SQL, "true");

	    settings.put(Environment.HBM2DDL_AUTO, "update");

	    configuration.setProperties(settings);
	    configuration.addAnnotatedClass(User.class);
	    configuration.addAnnotatedClass(Eclass.class);
	    configuration.addAnnotatedClass(Student.class);
	    configuration.addAnnotatedClass(Subject.class);
	    configuration.addAnnotatedClass(Teacher.class);

	    sessionFactory = configuration.buildSessionFactory();
	    return sessionFactory;

	   } catch (Exception e) {
	    e.printStackTrace();
	   }
	  }
	  return sessionFactory;
	 }
}
