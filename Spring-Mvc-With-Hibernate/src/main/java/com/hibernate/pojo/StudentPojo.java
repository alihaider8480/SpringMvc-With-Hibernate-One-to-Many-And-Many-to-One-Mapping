package com.hibernate.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="Student")
public class StudentPojo implements Serializable
{
   @Id
   @Column(name="S_ID")
   private Integer s_id;
   
   @Column(name="S_Name")
   private String s_name;
   
   @Column(name="S_Address")
   private String s_address;
   
   
   @OneToMany (cascade=CascadeType.ALL)
  
   private List<LaptopPojo> laptoppojo = new ArrayList();
   
   
public Integer getS_id() {
	return s_id;
}

public void setS_id(Integer s_id) {
	this.s_id = s_id;
}

public String getS_name() {
	return s_name;
}

public void setS_name(String s_name) {
	this.s_name = s_name;
}

public String getS_address() {
	return s_address;
}

public void setS_address(String s_address) {
	this.s_address = s_address;
}

public List<LaptopPojo> getLaptoppojo() {
	return laptoppojo;
}

public void setLaptoppojo(List<LaptopPojo> laptoppojo) {
	this.laptoppojo = laptoppojo;
}

 
}
