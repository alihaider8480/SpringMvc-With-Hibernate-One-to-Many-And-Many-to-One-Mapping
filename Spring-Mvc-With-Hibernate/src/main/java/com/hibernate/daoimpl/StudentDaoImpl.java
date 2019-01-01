package com.hibernate.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.dao.LaptopDao;
import com.hibernate.dao.StudentDao;
import com.hibernate.pojo.LaptopPojo;
import com.hibernate.pojo.StudentPojo;

@Repository
public class StudentDaoImpl implements StudentDao,LaptopDao
{
	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public String insertstudentrecord(StudentPojo obj2,LaptopPojo obj3)
	{
		try
		{
		obj3.setPojo(obj2);
		obj2.getLaptoppojo().add(obj3);
		Session session  = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(obj3);
		tx.commit();
		session.close();
		System.out.println("saved...");
		return "Inserted";
		}
		catch (Exception e) 
		{
			String a = String.valueOf(e.getMessage()+" / "+e.getLocalizedMessage()+" / "+e.fillInStackTrace()+"/"+e.getCause()); 
			return a;
		}
	}

	@Override
	public String insertlaptoprecords(LaptopPojo obj1) 
	{
		try
	    {
			sessionfactory.getCurrentSession().save(obj1);
			return "Inserted";
 	    }
	     catch (Exception e) 
	    {
	    	 String a =String.valueOf(e.getMessage()+" / "+e.getLocalizedMessage()+" / "+e.fillInStackTrace()+"/"+e.getCause()); 
	    	 return a;
	     }
	}
}