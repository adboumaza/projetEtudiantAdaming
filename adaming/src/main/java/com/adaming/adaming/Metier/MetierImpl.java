package com.adaming.adaming.Metier;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.adaming.Dao.Idao;
import com.adaming.adaming.entitis.Student;

@ManagedBean(name = "metierStudent")
@Service(value = "metierStudent")
@Transactional
@RequestScoped
public class MetierImpl implements Imetier, java.io.Serializable {
	private static final long serialVersionUID = 6236336770344726747L;

	@Autowired
	private Idao dao;
	
	public void setDao(Idao dao) {
		this.dao = dao;
	}

	@Override
	public void addStudent(Student s) {
		this.dao.addStudent(s);
	}

	@Override
	public List<Student> getStudents() {
		return this.dao.getStudents();
	}
}
