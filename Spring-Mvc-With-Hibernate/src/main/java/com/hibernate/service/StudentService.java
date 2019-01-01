package com.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.daoimpl.StudentDaoImpl;
import com.hibernate.pojo.LaptopPojo;
import com.hibernate.pojo.StudentPojo;

@Service
public class StudentService 
{
  @Autowired 
  private StudentDaoImpl studentdaoimp;
	
  @Transactional
  public String insertsturecords(StudentPojo obj2,LaptopPojo obj3)
  {
	return studentdaoimp.insertstudentrecord(obj2,obj3); 
  }
  
  @Transactional
  public String insertlaprecords(LaptopPojo obj1)
  {
	return studentdaoimp.insertlaptoprecords(obj1); 
  }
}
