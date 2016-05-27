package com.adaming.adaming.Dao;

import java.util.List;

import com.adaming.adaming.entitis.Student;

public interface Idao {

	public void addStudent(Student s);
	public List<Student> getStudents();
}
