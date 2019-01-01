package com.hibernate.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hibernate.pojo.LaptopPojo;
import com.hibernate.pojo.StudentPojo;
import com.hibernate.service.StudentService;


@Controller
public class RequestController 
{
	@Autowired
	private StudentService studentservice_obj1;
	
	@RequestMapping(value="/InsertStudent",method=RequestMethod.POST)
    public String insertstudentinfo(@ModelAttribute("insert_attribut") @Valid StudentPojo obj2,LaptopPojo obj3,Model model,BindingResult bind1)
    {
		System.out.println(obj2.getS_id()+":"+obj2.getS_name());
    	if(bind1.hasErrors())
    	{
    		model.addAttribute("cheack7","Error");
    		return "homepage";
    	}
    	model.addAttribute("cheack7",studentservice_obj1.insertsturecords(obj2,obj3));
    	return "homepage";
    }
    
	@RequestMapping(value="/InsertLaptop",method=RequestMethod.POST)
    public String insertLaptopinfo(@ModelAttribute("insert_attributs") @Valid LaptopPojo obj1,Model model,BindingResult bind1)
    {
    	if(bind1.hasErrors())
    	{
    		model.addAttribute("cheack7","Error");
    		return "homepage";
    	}
    	model.addAttribute("cheack8",studentservice_obj1.insertlaprecords(obj1));
    	return "homepage";
    }
}
