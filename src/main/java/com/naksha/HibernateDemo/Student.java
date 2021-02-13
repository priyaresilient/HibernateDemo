package com.naksha.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmbeddedStudent")
public class Student {
	@Id
	private int studentId;
	private StudentName studentName;
	private String studentDept;
	public Student(int studentId, StudentName studentName, String studentDept) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDept = studentDept;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public StudentName getStudentName() {
		return studentName;
	}
	public void setStudentName(StudentName studentName) {
		this.studentName = studentName;
	}
	public String getStudentDept() {
		return studentDept;
	}
	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}
	
}
