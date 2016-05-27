package com.adaming.adaming.entitis;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@RequestScoped
@ManagedBean(name="student")
public class Student implements java.io.Serializable {
	private static final long serialVersionUID = -2969404380784043392L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idStudent;
	private String nomStudent;
	private Integer ageStudent;
	
	public Long getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}
	public String getNomStudent() {
		return nomStudent;
	}
	public void setNomStudent(String nomStudent) {
		this.nomStudent = nomStudent;
	}
	public Integer getAgeStudent() {
		return ageStudent;
	}
	public void setAgeStudent(Integer ageStudent) {
		this.ageStudent = ageStudent;
	}
	
    public Student() {
    	super();
	}
    
	public Student(String nomStudent, Integer ageStudent) {
		super();
		this.nomStudent = nomStudent;
		this.ageStudent = ageStudent;
	}
	
	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", nomStudent=" + nomStudent
				+ ", ageStudent=" + ageStudent + "]";
	}
    
}
