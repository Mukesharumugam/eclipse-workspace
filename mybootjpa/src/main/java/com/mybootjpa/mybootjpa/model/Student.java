package com.mybootjpa.mybootjpa.model;

import javax.persistence.Entity;
import com.mybootjpa.mybootjpa.*;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private String studentname;
	private int studentrollno;
	private int studentmark;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentrollno() {
		return studentrollno;
	}
	public void setStudentrollno(int studentrollno) {
		this.studentrollno = studentrollno;
	}
	public int getStudentmark() {
		return studentmark;
	}
	public void setStudentmark(int studentmark) {
		this.studentmark = studentmark;
	}
	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", studentrollno=" + studentrollno + ", studentmark="
				+ studentmark + "]";
	}
	
}
