package com.hibernate.pojo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Laptop")
public class LaptopPojo implements Serializable
{
	@Id
	@Column(name="L_ID")
	private Integer l_id;
	
	@Column(name="L_Name")
	private String l_name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="S_ID")
	private StudentPojo pojo;

	public StudentPojo getPojo() {
		return pojo;
	}

	public void setPojo(StudentPojo pojo) {
		this.pojo = pojo;
	}

	public Integer getL_id() {
		return l_id;
	}

	public void setL_id(Integer l_id) {
		this.l_id = l_id;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
}
