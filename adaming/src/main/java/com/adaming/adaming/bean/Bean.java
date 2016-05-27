package com.adaming.adaming.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;

import com.adaming.adaming.Metier.Imetier;
import com.adaming.adaming.entitis.Student;

@ManagedBean(name="monBean")
@RequestScoped
public class Bean {
	
	@Autowired
	private Imetier metier;

	public Student save(Student s){
		metier.addStudent(s);
		return s;
	}
	
	

}
