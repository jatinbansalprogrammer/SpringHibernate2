package com.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	public EmployeeController() {
		System.out.println();
	}
	
	@InitBinder
	public void InitBinder(WebDataBinder databinder){
		StringTrimmerEditor editer=new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, editer);
	}
	
	@RequestMapping("/EmployeeDetails")
	public String EmployeeDetails(@ModelAttribute Employee emp){
		return "EmployeeForm";
	}
	
	@RequestMapping("/processEmployee")
	public String ProcessEmployee(@Valid@ModelAttribute Employee emp,BindingResult result){
		
		if(result.hasErrors()){
			return "EmployeeForm";
		}else{
			return "ProcessEmployee";
		}
	}
	

}
