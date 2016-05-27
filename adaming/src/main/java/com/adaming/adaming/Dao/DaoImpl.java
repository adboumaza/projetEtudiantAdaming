package com.adaming.adaming.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.adaming.adaming.entitis.Student;

@Repository(value = "dao")
public class DaoImpl implements Idao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addStudent(Student s) {
		em.persist(s);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Student> getStudents() {
		Query query = em.createQuery("from Student");
		List<Student> students = query.getResultList();
		System.out.println("Taille = " + students.size());
		
		return students;
	}
}
